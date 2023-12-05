> 다리 건너기 핵심: 다리를 생성해 플레이어가 이동할 수 있어야 한다.

## 기능 목록

- [x] 다리 건너기 게임 기능 시작 - BridgeGameController#run()
  - [x] 다리 건너기 게임 준비 - BridgeGameController#ready()
- [x] 다리를 생성 - BridgeMaker#makeBridge()
  - [x] 무작위 값을 사용해 건널 수 있는 칸 생성 - BridgeMaker#generateRoom()
  - [x] 무작위 값을 생성 - BridgeMaker#generateNumber()
- [x] 플레이어가 이동 - BridgeGame#move()
- [x] 플레이어 게임 재시작 - BridgeGame#retry()
- [x] 다리 길이를 입력 - InputView#readBridgeSize()
  - [x] 다리 길이 검증 - InputView#validateBridgeSize()
- [x] 이동할 칸 입력 - InputView#readMoving()
  - [x] 이동할 칸 검증 - InputView#validateMove()
- [x] 게임 재시작 명령 입력 - InputView#readGameCommand()
  - [x] 재시작 명령 검증 - InputView#validateGameCommand()
- [x] 다리 건너기 게임 시작 문구 출력 - OutputView#printHelloBridgeGame()
- [x] 현재까지 이동한 다리의 상태 출력 - OutputView#printMap()
- [x] 게임의 최종 결과를 출력 - OutputView#printResult()

## 테스트 기능 목록

- [x] 입력 받은 다리 길이만큼 칸 생성을 확인 - BridgeMakerTest#createRoomToBridgeLength()
- [x] 입력 받은 다리 길이가 3부터 20 사이의 숫자 아닐 경우 예외 발생 - InputViewTest#createBridgeSizeBetweenThreeToTwenty()
- [x] 입력 받은 이동할 칸이 U(위 칸)와 D(아래 칸)가 아닐 경우 예외 발생 - InputViewTest#createMoveToUOrD()
- [x] 입력 받은 게임 R(재시작)과 Q(종료)가 아닐 경우 예외 발생 - InputViewTest#createGameCommandToROrQ()