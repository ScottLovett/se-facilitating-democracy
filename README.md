# Description
This program is an educational system designed to demonstrate the way that different voting systems influence the results of an election, and therefore the representation of the populace in the government.

The system itself shows three different systems: 
- First Past The Post 
  - The standard most = win
- Single Transferable Vote 
  - One backup vote, where if your first loses, then your vote is given to your next choice
- Rank Choice Voting
  - Ranking all candidates from best to worst, lowest votes eliminated, votes for eliminated go to next choice
  
# Organization
All code and images are in the src folder

in the JFX folder are the images used in the gui system and the FacilitatingDemocracy folder

All java classes and the fxml for the gui and integration are in the FacilitatingDemocracy folder

The only items in the postgres folder are the csv files per table and the most recent database dump file

# Written vs Library
The only libraries used were JavaFX, JDBC with the postgres extension, and the postgresql database.

The GUI was made using SceneBuilder as a graphical designer for the JavaFX XFML functionality.

As a rule of thumb, if it's a function that is the same as an import line, then it's a library, otherwise it was written by someone on the team.

# Vote Guide
Editing votes such that :
- FPTP: each candidate gets at least 1 vote, but candidate 4 and 5 gets a super majority of the rest.
- STV: 2 candidates should be eliminated(1,4), leaving 3 (candidates 3,5,2)
- RC: 3 candidates should be eliminated, leaving 2 (candidates 2 and 5)

Therefore, out of 30 votes:
- FPTP: Can1 (1), Can2 (2), Can3 (2), Can4 (12), Can5 (13)
- STV: Can1 (5), Can2 (7), Can3 (6), Can4 (3), Can5 (9)
  - -> Can1 (6), Can2 (7), Can3 (8), Can4 (0), Can5 (9)
  - -> Can1 (0), Can2 (10), Can3 (9), Can4 (0), Can5 (10)
  - Notice one person's vote has been eliminated because their 1st and 2nd choice was eliminated.
- RC: Can1 (5), Can2 (7), Can3 (6), Can4 (3), Can5 (9)
  - -> Can1 (6), Can2 (7), Can3 (8), Can4 (0), Can5 (9)
  - -> Can1 (0), Can2 (11), Can3 (9), Can4 (0), Can5 (10)
  - -> Can1 (0), Can2 (16), Can3 (0), Can4 (0), Can5 (14)

Vote1: "STV 1/RC 1"
vote2: "RC 2"
vote3: "RC 3"
vote4: "RC 4"
vote5: "STV Safety Pick"