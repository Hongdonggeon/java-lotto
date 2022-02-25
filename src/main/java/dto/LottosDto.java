package dto;

<<<<<<< HEAD
<<<<<<< HEAD
import domain.Lotto.Lotto;

import java.util.ArrayList;
import java.util.Collections;
<<<<<<< HEAD
import java.util.List;

public class LottosDto {

    private final int quantity;
    private final List<LottoDto> lottoDtos;

    private LottosDto(List<LottoDto> lottoDtos) {
        this.lottoDtos = new ArrayList<>(lottoDtos);
        this.quantity = lottoDtos.size();
    }

    public static LottosDto from(List<Lotto> lottos) {
=======
import domain.Lotto;
=======
import domain.Lotto.Lotto;
>>>>>>> d5f0ef8 (refactor: 패키지 분리)

import java.util.ArrayList;
=======
>>>>>>> 3158ddf (refactor : 일급 컬렉션의 List 불변 객체로 만들기)
import java.util.List;

public class LottosDto {

    private final int quantity;
    private final List<LottoDto> lottoDtos;

    private LottosDto(List<LottoDto> lottoDtos) {
        this.lottoDtos = new ArrayList<>(lottoDtos);
        this.quantity = lottoDtos.size();
    }

<<<<<<< HEAD
    public static LottosDto from(List<Lotto> lottos){
>>>>>>> f80fb84 (feat: DTO 추가)
=======
    public static LottosDto from(List<Lotto> lottos) {
>>>>>>> 94c4d43 (style: 코드 포멧팅)
        List<LottoDto> lottoDtos = new ArrayList<>();
        for (Lotto lotto : lottos) {
            LottoDto lottoDto = LottoDto.from(lotto.getLotto());
            lottoDtos.add(lottoDto);
        }
        return new LottosDto(lottoDtos);
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e6945bb (style: 코드 포멧팅)

    public int getQuantity() {
        return quantity;
    }

    public List<LottoDto> getLottoDtos() {
<<<<<<< HEAD
<<<<<<< HEAD
        return Collections.unmodifiableList(lottoDtos);
    }
=======
>>>>>>> f80fb84 (feat: DTO 추가)
=======
        return lottoDtos;
=======
        return Collections.unmodifiableList(lottoDtos);
>>>>>>> 3158ddf (refactor : 일급 컬렉션의 List 불변 객체로 만들기)
    }
>>>>>>> e6945bb (style: 코드 포멧팅)
}
