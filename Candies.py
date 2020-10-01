N = int(input())
rating = list(int(input()) for i in range(N))
forward, backward = [1] * N, [1] * N
for i in range(1, N):
  if rating[i] > rating[i - 1]:
    forward[i] = forward[i - 1] + 1
  if rating[N - i - 1] > rating[N - i]:
    backward[N - i - 1] = backward[N - i] + 1
print(sum(max(forward[i], backward[i]) for i in range(N)))