package baseball;

import baseball.domain.BallNumber;

public class GameManager {
    BallNumber computerNumber;

    GameManager() {
        computerNumber = RandomNumberGenerator.generate();
    }


}
