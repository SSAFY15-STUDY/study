# 📅 Day 1: Java 기초 문법 정리 (String & Array)

## 🔤 문자열 (String)

자바에서 가장 많이 사용하는 문자열 조작 메서드 정리입니다.

| 기능 | 코드 | 결과 |
| --- | --- | --- |
| **반복** | `"hi".repeat(3)` | `"hihihi"` |
| **부분 문자열** | `"hello".substring(0, 2)` | `"he"` (0부터 2 미만까지) |
| **문자열 분리** | `"hi hello".split(" ")` | `String[] {"hi", "hello"}` |
| **정수 → 문자열** | `String.valueOf(9)` | `"9"` |
| **문자열 → 정수** | `Integer.parseInt("9")` | `9` |
| **문자열 → char[]** | `"hi".toCharArray()` | `char[] {'h', 'i'}` |
| **char[] → 문자열** | `new String(charArr)` | `"hi"` |
| **문자열 길이** | `"hi".length()` | `2` (메서드이므로 `()` 필수) |

---

## 🔢 배열 (Array)

배열은 문자열과 사용법이 다른 부분이 있으니 주의해야 합니다.

### 1. 기본 특징 및 정렬

* **길이 확인**: `arr.length`
> 💡 **주의**: 문자열과 다르게 메서드가 아닌 **속성(Property)**이므로 소괄호 `()`를 붙이지 않습니다.


* **정렬**: `Arrays.sort(arr)` (원본 배열의 순서를 변경합니다.)

### 2. 2차원 배열 입력 받기 (알고리즘 팁)

데이터를 입력받는 두 가지 방법입니다. 처음에는 **방법 1**에 익숙해지는 것을 추천합니다!

#### **방법 1: Scanner 활용 (권장 ⭐)**

가장 쉽고 직관적인 방법입니다. `nextInt()`를 사용하여 공백 단위로 값을 읽어옵니다.

```java
for (int i = 0; i < N; i++) {
    for (int j = 0; j < M; j++) {
        arr[i][j] = sc.nextInt();
    }
}

```

#### **방법 2: BufferedReader & split 활용 (심화)**

입력 데이터가 아주 많을 때 성능을 위해 사용하지만, 초보 단계에서는 **Scanner를 먼저 마스터**하는 것이 좋습니다.

```java
for (int i = 0; i < N; i++) {
    String line = br.readLine();
    String[] elements = line.split(" ");
    for (int j = 0; j < M; j++) {
        arr[i][j] = Integer.parseInt(elements[j]);
    }
}

```

---

### 📌 요약 및 주의사항

* 문자열 길이는 `.length()`, 배열 길이는 `.length`입니다.
* `String.valueOf()`와 `Integer.parseInt()`는 서로 반대되는 개념입니다.
* 데이터가 아주 많을 때는 `BufferedReader`가 더 빠르긴 하지만, **우선은 쓰기 편한 `Scanner`를 사용하세요!**