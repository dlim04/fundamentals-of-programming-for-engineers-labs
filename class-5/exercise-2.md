# Exercise 2 - Tile Calculator
A row of black and white tiles needs to be placed along a wall (see below). For
aesthetic reasons, the architect has specified that the first and last tile
shall be black. Your task is to compute the number of tiles needed and the gap
at each end, given the space available and the width of each tile.

> [!TIP]
> If you can’t compute the solution to the problem by hand yourself the
> likelihood is that you will not be able to program it in Java (or any other
> language)

<img src=../assets/class-5-exercise-2/tiles-1.png>

Some pseudocode for the task could be as follows:
```
- Number of pairs = integer part of (total width – tile width) / (2 x tile width)
- Number of tiles = 1 + 2 x number of pairs
- Gap at each end = (total width – number of tiles x tile width) / 2
```

## Extension
> [!NOTE]
> Maybe come back to this at the end if you're running out of time

What if the architect specifies a new pattern with black, grey and white tiles
as follows? The first and last tile should be still black.  How do you modify
and implement the algorithm?

<img src=../assets/class-5-exercise-2/tiles-2.png>

