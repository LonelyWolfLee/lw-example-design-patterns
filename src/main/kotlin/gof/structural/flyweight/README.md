#  플라이웨이트 패턴 (Flyweight Pattern)

## 문제점

![problem](https://refactoring.guru/images/patterns/diagrams/flyweight/problem-en.png)

잘 변하지 않는 특정 데이터로 인해 객체 생성 비용(RAM)이 낭비 될 수 있다.

## 해결책

![solution](https://refactoring.guru/images/patterns/diagrams/flyweight/solution1-en.png)

잘 변하지 않는 특정 데이터를 외부 데이터 객체로 만들어서, 재사용 한다.

## 장/단점

### 장점

- 비슷한 특성의 객체가 매우 다수 생성 된다면, 메모리 사용량을 많이 줄일 수 있다.

### 단점

- 구성한 외부 데이터가 사용시 변해야 되는 필요성이 생기면, 연산비용이 크게 증가 할 수 있다.
- 코드가 복잡해진다.