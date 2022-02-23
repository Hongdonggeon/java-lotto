import controller.LottoController;
<<<<<<< HEAD
import domain.Result;
=======
>>>>>>> 6a49a84 (feat: 로또 구매 및 당첨번호 세팅 기능 구현)
import dto.LottosDto;
import dto.RanksDto;
import view.InputView;
import view.OutputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
<<<<<<< HEAD
        InputView inputView = InputView.getInstance();
        OutputView outputView = OutputView.getInstance();
        LottoController lottoController = new LottoController();

        LottosDto lottosDto = lottoController.purchase(inputView.inputPurchaseAmount());
        outputView.printPurchasedLotto(lottosDto);

        lottoController.determineWinningNumber(inputView.inputWinningNumber(), inputView.inputBonusBall());

        outputView.printResult(lottoController.makeResult());
=======
        LottoController lottoController = new LottoController();

        int purchaseAmount = InputView.inputPurchaseAmount();
        LottosDto lottosDto = lottoController.purchase(purchaseAmount);
        OutputView.printPurchasedLotto(lottosDto);

        List<String> winningNumber = InputView.inputWinningNumber();
        int bonusBall = InputView.inputBonusBall();
        lottoController.determineWinningNumber(winningNumber,bonusBall);
<<<<<<< HEAD
>>>>>>> 6a49a84 (feat: 로또 구매 및 당첨번호 세팅 기능 구현)
=======

<<<<<<< HEAD
<<<<<<< HEAD
        lottoController.calculateRank();
>>>>>>> 20bb1bf (feat: 2,3등은 보너스볼과 일치하는 숫자의 갯수를 기준으로, 나머지 등수는 일치하는 숫자의 갯수만으로 등수를 판정하는 로직 구현)
=======
        List<RankDto> rankDtos = lottoController.calculateRank();

        OutputView.printRank(rankDtos);
>>>>>>> 2821995 (feat: 결과 출력 기능 구현)
=======
        RanksDto result = lottoController.makeResult();
        OutputView.printResult(result);
>>>>>>> 6741479 (feat: 수익률 계산 로직 및 출력 기능 구현)
    }
}
