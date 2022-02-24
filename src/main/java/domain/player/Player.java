package domain.player;

import domain.Lotto.Lotto;
import domain.Lotto.WinningLotto;
import domain.LottoGenerator.LottoGenerator;
import domain.Result;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Collections;
=======
>>>>>>> d5f0ef8 (refactor: 패키지 분리)
import java.util.List;

public class Player {

<<<<<<< HEAD
    private static final int MINIMUM_PURCHASE_AMOUNT = 1000;

    private final Money money;
    private final List<Lotto> lottos;

    public Player(int money) {
        this.money = new Money(money);
        this.lottos = new ArrayList<>();
    }

    public boolean canBuyLotto() {
        return money.isBiggerThanLottoPrice();
    }

    public void purchaseLotto(Lotto lotto) {
        money.deductMoney();
        lottos.add(lotto);
    }


=======
    private final Money money;
    private List<Lotto> lottos;

    public Player(Money money) {
        this.money = money;
        this.lottos = new ArrayList<>();
    }

    private int getNumberOfPurchases() {
        return money.determineQuantity();
    }

    public void purchaseLotto(LottoGenerator lottoGenerator, List<Integer> lottoNumbers) {
        int numberOfPurchases = getNumberOfPurchases();
        for (int i = 0; i < numberOfPurchases; i++) {
            lottos.add(lottoGenerator.generateLotto(lottoNumbers));
        }
    }

>>>>>>> d5f0ef8 (refactor: 패키지 분리)
    public List<Result> judgeAll(WinningLotto winningLotto) {
        List<Result> result = new ArrayList<>();
        for (Lotto lotto : lottos) {
            result.add(lotto.judge(winningLotto));
        }
        return result;
    }

    public double calculateIncomeRate(double totalIncome) {
<<<<<<< HEAD
        return totalIncome / (lottos.size() * MINIMUM_PURCHASE_AMOUNT);
    }

    public List<Lotto> getLottos() {
        return Collections.unmodifiableList(lottos);
=======
        return totalIncome / money.getAmount();
    }

    public List<Lotto> getLottos() {
        return lottos;
>>>>>>> d5f0ef8 (refactor: 패키지 분리)
    }
}
