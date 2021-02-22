# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

def differentSquares(matrix):
    squares = []
    for i in range(len(matrix)-1):
        for j in range(len(matrix[0]) -1):
            elem = [matrix[i][j], matrix[i][j+1], matrix[i+1][j], matrix[i+1][j+1]]
            if elem not in squares :
                squares.append(elem)
    
    return len(squares);

matr = [[2,5,3,4,3,1,3,2], 
        [4,5,4,1,2,4,1,3], 
        [1,1,2,1,4,1,1,5], 
        [1,3,4,2,3,4,2,4], 
        [1,5,5,2,1,3,1,1], 
        [1,2,3,3,5,1,2,4], 
        [3,1,4,4,4,1,5,5], 
        [5,1,3,3,1,5,3,5], 
        [5,4,4,3,5,4,4,4]]

print(differentSquares(matr));