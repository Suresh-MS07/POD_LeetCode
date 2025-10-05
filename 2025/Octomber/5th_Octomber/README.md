# 🧭 417. Pacific Atlantic Water Flow

**Difficulty:** Medium  
**Topics:** Depth-First Search, Breadth-First Search, Matrix, Graph  
**Companies:** Premium Lock

---

## 🧩 Problem Description

There is an `m x n` rectangular island that borders both the **Pacific Ocean** and **Atlantic Ocean**.  
The Pacific Ocean touches the island's **left and top edges**, and the Atlantic Ocean touches the island's **right and bottom edges**.

The island is partitioned into a grid of square cells.  
You are given an `m x n` integer matrix `heights` where `heights[r][c]` represents the **height above sea level** of the cell at coordinate `(r, c)`.

The island receives a lot of rain, and the rain water can flow to neighboring cells directly **north, south, east, and west** if the neighboring cell's height is **less than or equal to** the current cell's height.  
Water can flow from any cell adjacent to an ocean into the ocean.

Return a 2D list of grid coordinates `result` where  
`result[i] = [ri, ci]` denotes that rain water can flow from cell `(ri, ci)` to **both** the Pacific and Atlantic oceans.

---

## 💡 Example 1

**Input:**
heights = [
[1,2,2,3,5],
[3,2,3,4,4],
[2,4,5,3,1],
[6,7,1,4,5],
[5,1,1,2,4]
]
**Output:**
[[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]

**Explanation:**
- Water from cells like `(0,4)` and `(1,3)` can reach **both** oceans.  
- Example path for `[1,3]`:  
  - To Pacific → `[1,3] → [0,3]`  
  - To Atlantic → `[1,3] → [1,4]`

---

## 💧 Example 2

**Input:**
heights = [[1]]
[[0,0]]

**Explanation:**  
The only cell can flow to both the Pacific and Atlantic oceans.

---

## 🧠 Constraints

- `m == heights.length`  
- `n == heights[r].length`  
- `1 <= m, n <= 200`  
- `0 <= heights[r][c] <= 10⁵`

---

📘 **LeetCode Problem Link:** [417. Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/)
