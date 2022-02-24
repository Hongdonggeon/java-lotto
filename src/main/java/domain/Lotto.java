package domain;

import utils.ExceptionMessage;

import java.util.List;

public class Lotto {

    public static final int CORRECT_LOTTO_SIZE = 6;

    private final List<LottoNumber> lotto;

    public Lotto(List<LottoNumber> lotto) {
        validateLottoSize(lotto);
        this.lotto = lotto;
    }

    private void validateLottoSize(List<LottoNumber> lotto){
        if(lotto.size() != CORRECT_LOTTO_SIZE){
            throw new IllegalArgumentException(ExceptionMessage.LOTTO_SIZE_IS_NOT_SIX);
        }
    }

    public List<LottoNumber> getLotto() {
        return lotto;
    }

    public Result judge(WinningLotto winningLotto){
        List<LottoNumber> winningNumbers = winningLotto.getWinningLotto();
        int hitCount = 0;
        for(LottoNumber lottoNumber : lotto){
            hitCount += lottoNumber.checkHit(winningNumbers);
        }
        boolean isHitBonusBall = judgeBonusBall(winningLotto.getBonusBall());
        return new Result(hitCount,isHitBonusBall);
    }

    private boolean judgeBonusBall(LottoNumber bonusBall){
        return lotto.contains(bonusBall);
    }
}