# 🧪 3494. Find the Minimum Amount of Time to Brew Potions

**Difficulty:** Medium  
**Topics:** Dynamic Programming, Simulation  

---

## 📖 Problem Statement

You are given two integer arrays, `skill` and `mana`, of length `n` and `m`, respectively.

In a laboratory, `n` wizards must brew `m` potions **in order**.  
Each potion has a mana capacity `mana[j]` and must pass through **all the wizards sequentially** to be brewed properly.  

The time taken by the `i-th` wizard on the `j-th` potion is given by:

time[i][j] = skill[i] * mana[j]

Since the brewing process is delicate, a potion must be passed to the next wizard **immediately** after the current wizard completes their work.  
This means each wizard begins working on a potion exactly when it arrives.

Return the **minimum amount of time required** for all the potions to be brewed properly.

---

## 🧩 Example 1

**Input:**  
skill = [1,5,2,4]
mana = [5,1,4,2]


**Output:**  
110


**Explanation:**

| Potion | Start Time | Wizard 0 Done | Wizard 1 Done | Wizard 2 Done | Wizard 3 Done |
|:-------|:------------|:---------------|:---------------|:---------------|:---------------|
| 0 | 0 | 5 | 30 | 40 | 60 |
| 1 | 52 | 53 | 58 | 60 | 64 |
| 2 | 54 | 58 | 78 | 86 | 102 |
| 3 | 86 | 88 | 98 | 102 | 110 |

For example, wizard 0 **cannot** start working on the 1st potion before time `t = 52`,  
because wizard 3 will still be working on the 0th potion until `t = 60`.

---

## 🧩 Example 2

**Input:**  
skill = [1,1,1]
mana = [1,1,1]

**Output:**  

**Explanation:**  
Potion 0 starts at `t = 0` → done by `t = 3`  
Potion 1 starts at `t = 1` → done by `t = 4`  
Potion 2 starts at `t = 2` → done by `t = 5`

---

## 🧩 Example 3

**Input:**  
skill = [1,2,3,4]
mana = [1,2]
**Output:**  
21


---

## ⚙️ Constraints

- `n == skill.length`  
- `m == mana.length`  
- `1 <= n, m <= 5000`  
- `1 <= skill[i], mana[i] <= 5000`

---

💡 *This problem tests your ability to simulate synchronized multi-stage processing and manage dependency timing efficiently.*
