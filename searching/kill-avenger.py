from collections import Counter

n = int(input())
gene = input()
char_counts = Counter()
for i in range(n):
    char_counts[gene[i]] += 1

n_by_4 = n / 4
min_length = n
left = 0
right = 0

substring_counts = Counter()
while right < n:
    substring_counts[gene[right]] += 1
    right += 1

    has_enough_excessive_chars = True
    for ch in "ACTG":
        diff = char_counts[ch] - n_by_4
        # the char cannot be used to replace other items
        if (diff > 0) and (substring_counts[ch] < diff):
            has_enough_excessive_chars = False
            break

    if has_enough_excessive_chars:
        while left < right and substring_counts[gene[left]] > (char_counts[gene[left]] - n_by_4):
            substring_counts[gene[left]] -= 1
            left += 1

        min_length = min(min_length, right - left)

print (min_length)