# java-calculator-precourse

# 문자열 계산기

## 과제 소개
문자열에서 숫자를 추출하여 합계를 계산하는 계산기입니다.
쉼표(,), 콜론(:) 또는 커스텀 구분자로 구분된 숫자들의 합을 반환합니다.

## 구현 기능

### 기본 기능
- 쉼표(,) 또는 콜론(:) 구분자 지원
- 빈 문자열 입력 시 0 반환
- 여러 숫자의 합계 계산

### 커스텀 구분자
- `//구분자\n숫자` 형식 지원
- 예: `//;\n1;2;3` → 6

### 예외 처리
- 잘못된 입력 시 IllegalArgumentException 발생
  - 음수
  - 숫자가 아닌 문자

## 패키지 구조
```
calculator
├── Application.java          # 프로그램 진입점
├── controller
│   └── CalculatorController  # 전체 흐름 제어
├── service
│   ├── CalculatorService     # 인터페이스
│   └── CalculatorServiceImpl # 비즈니스 로직
├── io
│   ├── InputView             # 사용자 입력
│   └── OutputView            # 결과 출력
└── util
    ├── DelimiterParser       # 구분자 추출
    ├── StringSplitter        # 문자열 분리
    ├── NumberParser          # 숫자 변환
    ├── Calculator            # 합계 계산
    └── Validator             # 음수 검증
