# Q-CAST-SIMULATION
Q-CAST Simulation in Java. Internship worked on summer 2020 under fellowship of Professor Qian of the University of California Santa Cruz 

To run the Program:
  1. Download files and open project in terminal. (cd Downloads, cd Q-CAST-SIMULATION)
  2. compile all files with the command: javac*. java
  3. Run program with the command: java Main
  
  This project was my interpretation of the Q-CAST protocol written and researched by Professor Chen Qian and his pupil, Shouqian Shi. It reflects the knowledge I
  have accumulated through my research in the summer of 2020 about quantum computing, networks, and data structures. 
  
  The program includes a topology generator which serves to create a random graph containing anywhere from 5-15 nodes. This object is created by the class "GraphGenerator" 
  in which a graph in the form of a list of neighbors is initialized and assigned values. This list is stored in the form of an array list within an array list of 
  type "Node."
  Each index, therefore, corresponds to the node of the graph and the contents within that index includes the edges that the node contains (ex. index 0 refers to
  node 0 in the graph and the following numbers 3 4 8 are the nodes it is connected to). 
  Once the graph is created, a random source and destination node are created within the graph. Computer networks are emulated as information wants to be sent from the 
  sender to its destination. 
  From there, the graph is passed through a "solver" where the Extended Dijkstra Algorithm is used to greedily find the shortest path from source to destination.
  The program will end once it has reached its destination. The number 2147483647 represents infinity as some paths from source to other nodes are either impossible,
  or did not pass through on its way to the destination node.
  The system then spews out the smallest costs from the source node to each other node, as well as the shortest path from the source node to destination node. 
  
  This simulation does not emulate quantum protocols. Some of these features that I wish to emulate in the future include Quantum Key Distribution, 
  superposition of atoms, inter-router protocols such as the data plane or control plane, bell measurements, and teleportation.

  
  This simulation is simplified from their code, and not completely finished. Due to unforeseen family emergencies and time contraints, I was unable to replicate
  this protocol as much as I had hoped and intended; although,I hope to be able to continue and finish this project in the future. 
  
