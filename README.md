# EncryptString
 
A.	Remove spaces from the text and write the characters in a grid of RXC dimension    ----  
B.	Say L is the length of the text after removing spaces
C.	R & C should follow these constraints
	a.	[PRESQRT(L)] <= R <= C <= [POSTSQRT(L)]
	b.	Where [PRESQRT(L)] = square root of largest perfect square number less than or equals to L
	c.	Where [POSTSQRT(L)] = square root of smallest perfect square number greater than or equals to L
	d.	Ensure that R * C >= L
	e.	In case multiple combination of R & C satisfy all the above constraints, then choose a combination with min [RXC]
D.	Now encrypted text obtained by joining the characters in each column and separated by space

if L is 8  ===2 Pre
              3 Post?        2<=R<=C<= 3
			                   R,C = 2,2
							   R,C = 2,3
							   
							   
							   R,C = 3,3
							   c h i
							   l l o
							   u t
			                  clu hlt io
							  
							  
L = 26      === 5
            === 6		
			               R,C = 5, 5
						         5, 6
								 6, 6
								 
								 5,6
								 t h e b l a
								 c k c a t j
								 u m p e d o
								 n t h e r o
								 o f
						     

E.	For eg:
a.	Input – the black cat jumped on the roof
Output – tcuno hkmtf ecph baee ltdr ajoo
b.	Input – chill out
Output – clu hlt io
