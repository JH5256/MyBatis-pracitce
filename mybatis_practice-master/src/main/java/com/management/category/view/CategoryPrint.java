package com.management.category.view;

import com.management.category.model.dto.CategoryDTO;

import java.util.List;
import java.util.Map;

public class CategoryPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // * 주석을 지우고 다음 세 가지 메소드를 작성하세요.

    public void printTeamList(List<CategoryDTO> categoryList, Map<String, String> parameter) {

        // 1. 조회한 목록 출력하는 메소드
        //    (조건 1) HashMap 타입의 매개변수로 받아온 값을 기준으로 전체 목록 조회인지, 순위별 제품분류 조회인지 구분하여 출력하세요.
        //    (조건 2) List<CategoryDTO>로 받아온 데이터 목록을 전체 출력하세요.
        for(CategoryDTO categoryDTO : categoryList){
            System.out.println(categoryDTO);
        }

    }

    public void printSuccessMessage(String successCode) {

        // 2. 성공메시지를 출력하는 메소드
        //    (조건) 성공코드를 전달받아 각각의 요청에 대해 성공을 알리는 메시지를 출력하세요.

        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "신규 제품분류 정보 등록을 성공하였습니다."; break;
            case "update" : successMessage = "기존 제품분류 정보 수정을 성공하였습니다."; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {

        // 3. 에러메시지를 출력하는 메소드
        //    (조건) 에러코드를 전달받아 각각의 요청에 대해 에러를 알리는 메시지를 출력하세요.

        String errorMessage = "";

        switch (errorCode) {
            case "selectList" : errorMessage = "메뉴목록 조회를 실패하였습니다."; break;
            case "insert" : errorMessage = "신규 제품분류 추가를 실패하셨습니다."; break;
            case "update" : errorMessage = "기존 제품분류 정보 수정을 실패하였습니다."; break;
        }

        System.out.println(errorMessage);
    }

}
