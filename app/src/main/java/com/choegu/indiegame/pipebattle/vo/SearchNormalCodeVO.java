package com.choegu.indiegame.pipebattle.vo;

import java.io.Serializable;

/**
 * Created by student on 2018-01-19.
 */

public class SearchNormalCodeVO implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = -8076269658698217771L;
    private String code;
    private String loginId;
    private String message;
    private int portNum;
    private String player1;
    private String player2;

    public SearchNormalCodeVO() {
    }

    public SearchNormalCodeVO(String code, String loginId, String message, int portNum, String player1, String player2) {
        this.code = code;
        this.loginId = loginId;
        this.message = message;
        this.portNum = portNum;
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPortNum() {
        return portNum;
    }

    public void setPortNum(int portNum) {
        this.portNum = portNum;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    @Override
    public String toString() {
        return "SearchNormalCodeVO{" +
                "code='" + code + '\'' +
                ", loginId='" + loginId + '\'' +
                ", message='" + message + '\'' +
                ", portNum=" + portNum +
                ", player1='" + player1 + '\'' +
                ", player2='" + player2 + '\'' +
                '}';
    }
}
