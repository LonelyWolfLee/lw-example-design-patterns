# 중재자 패턴 (Mediator Pattern) - 조정자 패턴

## 문제점

![problem](https://refactoring.guru/images/patterns/diagrams/mediator/problem1-en.png)

객체간에 복잡한 논리적 의존 관계가 형성 되어있는 경우 각 객체들은 서로를 알고 있어야 하며, 특정 객체의 수정이 다른 객체의 수정으로 연쇄적 수정이 일어날 수 있음

## 해결책

![solution](https://refactoring.guru/images/patterns/diagrams/mediator/solution1-en.png)

각 구성요소간의 직접적인 참조 및 호출을 제거하고, 중재자를 통한 간접적인 호출에 의존하도록 변경

## 장/단점

### 장점

- 단일 책임 원칙 . 다양한 구성 요소 간의 통신을 한 곳으로 추출하여 이해하고 유지 관리하기가 더 쉽습니다.
- 개방/폐쇄 원칙 . 실제 구성 요소를 변경하지 않고도 새로운 중재자를 도입할 수 있습니다.
- 프로그램의 다양한 구성 요소 간의 결합을 줄일 수 있습니다.
- 개별 구성 요소를 더 쉽게 재사용할 수 있습니다.

### 단점

- 시간이 지남에 따라 중재자는 God Object 로 진화할 수 있습니다 .