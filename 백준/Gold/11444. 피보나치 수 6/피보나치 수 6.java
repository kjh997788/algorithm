import java.io.*;

class Main {
    static final long MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        System.out.println(fibonacci(n));
    }

    public static long fibonacci(long n) {
        long[][] baseMatrix = {{1, 1}, {1, 0}};
        long[][] resultMatrix = matrixPower(baseMatrix, n - 1); // F(n) = F(1) * (baseMatrix^(n-1))
        return resultMatrix[0][0]; // 결과 행렬의 [0][0] 값이 F(n)
    }

    public static long[][] matrixPower(long[][] matrix, long exp) {
        long[][] result = {{1, 0}, {0, 1}}; // 2 x 2 단위 행렬

        while (exp > 0) {
            if (exp % 2 == 1) result = multiplyMatrix(result, matrix); // 홀수 차수인 경우
            matrix = multiplyMatrix(matrix, matrix); // 2 x 2 행렬의 제곱
            exp /= 2;
        }

        return result;
    }

    public static long[][] multiplyMatrix(long[][] a, long[][] b) {
        long[][] result = new long[2][2];

        result[0][0] = (a[0][0] * b[0][0] + a[0][1] * b[1][0]) % MOD;
        result[0][1] = (a[0][0] * b[0][1] + a[0][1] * b[1][1]) % MOD;
        result[1][0] = (a[1][0] * b[0][0] + a[1][1] * b[1][0]) % MOD;
        result[1][1] = (a[1][0] * b[0][1] + a[1][1] * b[1][1]) % MOD;

        return result;
    }
}