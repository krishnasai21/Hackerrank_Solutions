for case in range(int(input())):
  a, b = input(), input()
  dp = [[False] * len(b) for i in range(len(a))]
  for i in range(len(a)):
    dp[i][0] = any(x.upper() == b[0] for x in a[:i+1]) \
               and sum(1 for x in a[:i+1] if x == b[0]) <= 1 \
               and not any(x.isupper() and x != b[0] for x in a[:i+1])
  for j in range(1, len(b)):
    for i in range(1, len(a)):
      if not a[i].isupper():
        dp[i][j] = dp[i - 1][j]
      if a[i].upper() == b[j]:
        dp[i][j] = dp[i][j] or dp[i - 1][j - 1]
  print('YES' if dp[-1][-1] else 'NO')