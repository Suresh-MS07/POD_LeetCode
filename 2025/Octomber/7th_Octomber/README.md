# 🧩 LeetCode Problem 1488: Avoid Flood in The City

**Difficulty:** Medium  
**Topics:** Hash Map, Heap (Priority Queue), Greedy  

---

## 📄 Problem Statement

Your country has an infinite number of lakes. Initially, all the lakes are empty, but when it rains over the `nth` lake, the `nth` lake becomes full of water. If it rains over a lake that is already full, there will be a **flood**.  
Your goal is to **avoid floods** in any lake.

You are given an integer array `rains` where:

- `rains[i] > 0` → It rains over lake `rains[i]` on the `i-th` day.  
- `rains[i] == 0` → No rain on the `i-th` day, and you can **choose one lake to dry** on that day.

Return an array `ans` where:

- `ans.length == rains.length`
- `ans[i] == -1` if `rains[i] > 0`
- `ans[i]` is the **lake number** you choose to dry on the `i-th` day if `rains[i] == 0`

If there are multiple valid answers, return any of them.  
If it is **impossible** to avoid a flood, return an **empty array**.

---

## 💡 Example 1

**Input:**  
rains = [1,2,3,4]
**Output:**  
[-1,-1,-1,-1]

**Explanation:**  
- After each day, the full lakes are `[1]`, `[1,2]`, `[1,2,3]`, `[1,2,3,4]`.  
- There’s no dry day, but also no flood occurs.

---

## 💡 Example 2

**Input:**  
rains = [1,2,0,0,2,1]
**Output:**  
[-1,-1,2,1,-1,-1]

**Explanation:**  
- Day 1 → Lake 1 full → `[1]`  
- Day 2 → Lake 2 full → `[1,2]`  
- Day 3 → Dry lake 2 → `[1]`  
- Day 4 → Dry lake 1 → `[]`  
- Day 5 → Lake 2 full → `[2]`  
- Day 6 → Lake 1 full → `[1,2]`  
✅ No flood occurs.

---

## 💡 Example 3

**Input:**  
rains = [1,2,0,1,2]

**Output:**  

[]

**Explanation:**  
- After day 2, lakes `[1,2]` are full.  
- On day 3, only one lake can be dried.  
- Rain follows on both lakes again → flood is unavoidable.

---

## ⚙️ Constraints
- `1 <= rains.length <= 10⁵`
- `0 <= rains[i] <= 10⁹`

---

📘 **LeetCode Link:** [1488. Avoid Flood in The City](https://leetcode.com/problems/avoid-flood-in-the-city/)
