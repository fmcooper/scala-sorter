
EX_1:="3 6 0 9 1 2 9 1 4 6"
EX_2:="25 9 47 57 15 19 72 30 96 84 35 94 89 33 30 76 68 47 88 34 71 59 53 58 96 26 60 27 90 51 31 0 32 51 80 68 70 66 87 94 80 23 32 21 34 74 87 41 29 64"
EX_3:="83 80 25 79 58 83 52 15 77 77 72 34 75 7 99 99 51 15 13 84 62 13 22 34 17 69 87 100 75 47 90 71 7 8 75 50 64 32 57 43 55 29 60 71 45 51 74 86 63 19 98 50 41 62 58 14 57 5 98 30 35 72 19 31 65 19 92 20 14 56 99 8 20 6 75 26 82 29 3 100 88 21 91 84 47 6 85 85 28 92 7 45 9 92 38 74 96 23 18 37 73 64 59 88 7 84 33 53 8 97 73 23 72 77 99 93 19 31 15 9 63 77 57 98 62 94 41 60 8 30 58 46 40 9 1 18 67 30 91 60 90 26 11 14 19 14 59 26 47 16 93 83 81 61 45 50 79 86 93 4 56 6 34 94 27 60 83 46 8 24 52 14 46 46 22 79 95 49 96 33 27 39 66 68 37 78 27 37 50 69 82 85 49 37 21 11 2 51 26 17 74 31 18 72 84 2 42 26 91 88 40 83 69 33 82 85 79 94 41 93 66 58 30 26 51 54 86 9 98 21 22 12 53 62 46 6 12 48 46 66 29 12 69 23 15 84 38 12 25 7 33 92 11 15 27 77 76 42 9 35 52 66 49 44 48 94 10 61 22 43 70 11 21 97 34 53 87 4 41 73 95 48 82 80 85 82 64 46 8 63 95 91 50 47 74 84 96 21 29 24 90 1 47 21 79 10 67 88 57 9 75 39 94 32 91 8 94 39 72 92 82 28 83 50 13 11 63 28 22 28 9 78 6 51 19 10 11 63 47 89 67 98 8 53 99 23 34 21 30 94 27 29 41 26 59 3 18 55 9 53 57 78 59 96 99 12 76 92 67 35 33 80 64 26 86 99 21 25 24 58 31 16 15 82 45 28 69 41 42 8 3 81 46 27 75 66 11 30 68 34 90 81 15 10 30 48 71 3 89 29 43 27 34 52 67 40 84 42 71 29 2 87 72 67 89 26 33 60 58 15 92 77 1 45 46 74 31 67 8 83 13 5 79 47 52 15 18 20 90 44 30 83 49 12 49 80 31 47 40 76 4 61 80 91 58 20 30 80 81 10 42 16 87 27 89 34 78 77 63 76 67 79 39 6 13 2 78 85 27 35 36 44 36 94 30 32 85 46 15 27"

default:
	scalac -cp . -d . src/*.scala


runexample1: default
	@scala -cp . src.sort 1 $(EX_1)
	@scala -cp . src.sort 2 $(EX_1)

runexample2: default
	@scala -cp . src.sort 1 $(EX_2)
	@scala -cp . src.sort 2 $(EX_2)

runexample3: default
	@scala -cp . src.sort 1 $(EX_3)
	@scala -cp . src.sort 2 $(EX_3)

