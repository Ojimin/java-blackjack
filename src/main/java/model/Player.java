package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Player {
    private String name;
    private List<Card> cardList;

    public Player(String name) {
        this.name = name;
        this.cardList = initCardList();
    }

    /*
        코드 중복- 수정 필요
     */
    public List<Card> initCardList() {
        List<Card> cardList = new ArrayList<>();
        cardList.add(new Card());
        cardList.add(new Card());
        return cardList;
    }

    public String getName() {
        return name;
    }

    /*
        playerlist에 있는 메서드와 구분 필요
     */
    @Override
    public String toString() {
        String cards = cardList.stream()
                .map(Card::toString)
                .collect(Collectors.joining(", "));
        return name + "카드:" + cards;
    }
}
