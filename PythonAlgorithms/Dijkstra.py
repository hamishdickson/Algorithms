def dijkstra(in):
    """dijkstra's algorithm for evaluating string expressions"""
    ops = []
    vals = []

    parts = in.split()
    
    for i in range (0, len(in)):
        s = parts[i]
        
