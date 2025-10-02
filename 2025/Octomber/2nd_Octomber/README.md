# 📅 LeetCode POD – October 2, 2025  

## 🔹 Problem: [3195. Find the Maximum Number of Water Bottles](https://leetcode.com/problems/find-the-maximum-number-of-water-bottles/)  
**Difficulty:** Medium  
**Topics:** Simulation, Math, Greedy  

---

## 📖 Question  
You have **numBottles** full water bottles. After drinking one, it becomes empty.  

You can exchange empty bottles for full ones:  
- If you have **at least numExchange** empty bottles, you can trade them for **1 full bottle**.  
- After every exchange, the value of **numExchange increases by 1** (making the next exchange harder).  

Return the **maximum number of bottles you can drink**.  

---

## ✅ Example 1  
**Input:**  
numBottles = 3, numExchange = 3
**Output:**  
3

**Explanation:**  
You drink 3 bottles. You now have 3 empty bottles.  
To exchange, you need 3 empties → you can trade them for 1 full bottle.  
But after the trade, `numExchange = 4`, so you cannot make another exchange.  
Total = 3.  

---

## ✅ Example 2  
**Input:**  
numBottles = 4, numExchange = 2

**Output:**  
5

**Explanation:**  
- Drink 4 bottles → empty = 4  
- Exchange 2 empties for 1 full → `numExchange = 3`  
- Now empty = (4 - 2) + 1 = 3  
- Cannot exchange again because need 3 empties for 1, but after trade `numExchange = 4`.  
- Total drunk = 4 + 1 = 5  

---

## 🔒 Constraints  
- `1 <= numBottles <= 10^9`  
- `2 <= numExchange <= 10^9`  

---

📌 **Note:** This `README.md` contains only the **problem statement**. The solution is available in the respective code file. 🚀  

