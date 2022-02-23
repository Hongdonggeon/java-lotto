package controller;

<<<<<<< HEAD
import domain.Lotto.Lotto;
import domain.Lotto.LottoNumber;
import domain.Lotto.WinningLotto;
import domain.LottoGenerator.AutoLottoGenerator;
import domain.LottoGenerator.LottoGenerator;
import domain.LottoGenerator.ManualLottoGenerator;
import domain.Result;
import domain.ResultStatus;
import domain.player.Player;
import dto.LottosDto;
import dto.RanksDto;
=======
import domain.*;
import dto.LottosDto;
>>>>>>> 6a49a84 (feat: 로또 구매 및 당첨번호 세팅 기능 구현)

import java.util.List;

public class LottoController {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 20bb1bf (feat: 2,3등은 보너스볼과 일치하는 숫자의 갯수를 기준으로, 나머지 등수는 일치하는 숫자의 갯수만으로 등수를 판정하는 로직 구현)

    private Player player;
    private WinningLotto winningLotto;

<<<<<<< HEAD
    public LottosDto purchase(int purchaseAmount) {
        player = new Player(purchaseAmount);
        LottoGenerator lottoGenerator = new AutoLottoGenerator();
        while (player.canBuyLotto()) {
            player.purchaseLotto(lottoGenerator.generateLotto());
        }
        return LottosDto.from(player.getLottos());
    }

    public void determineWinningNumber(List<Integer> winningNumbers, int bonusBall) {
        LottoGenerator lottoGenerator = new ManualLottoGenerator();
        Lotto winningLotto = lottoGenerator.generateLotto(winningNumbers);
        this.winningLotto = new WinningLotto(winningLotto, LottoNumber.valueOf(bonusBall));
    }

    public RanksDto makeResult() {
        List<Result> results = player.judgeAll(winningLotto);
        ResultStatus resultStatus = new ResultStatus();
        resultStatus.judgeResult(results);
        double totalIncome = resultStatus.calculateTotalIncome();
        double incomeRate = player.calculateIncomeRate(totalIncome);
        return RanksDto.from(resultStatus, incomeRate);
=======
=======
>>>>>>> 20bb1bf (feat: 2,3등은 보너스볼과 일치하는 숫자의 갯수를 기준으로, 나머지 등수는 일치하는 숫자의 갯수만으로 등수를 판정하는 로직 구현)
    public LottosDto purchase(int purchaseAmount) {
        player = new Player(new Money(purchaseAmount));
        List<Lotto> lottos = player.getLottos();
        return LottosDto.from(lottos);
    }

    public void determineWinningNumber(List<String> winningNumber, int bonusBall) {
        List<LottoNumber> lottoNumbers = LottoFactory.generateWinningLotto(winningNumber);
<<<<<<< HEAD
        WinningLotto winningLotto = new WinningLotto(lottoNumbers, new LottoNumber(bonusBall));
>>>>>>> 6a49a84 (feat: 로또 구매 및 당첨번호 세팅 기능 구현)
=======
        winningLotto = new WinningLotto(lottoNumbers, new LottoNumber(bonusBall));
    }

    public void calculateRank() {
        List<Result> results = player.judgeAll(winningLotto);
        Rank.calculateAllResult(results);
        for (Rank value : Rank.values()) {
            System.out.println(value.getCriteria());
            System.out.println(value.getHitCount());
            System.out.println(value.getReward());
            System.out.println("----------");
        }
>>>>>>> 20bb1bf (feat: 2,3등은 보너스볼과 일치하는 숫자의 갯수를 기준으로, 나머지 등수는 일치하는 숫자의 갯수만으로 등수를 판정하는 로직 구현)
    }
}
