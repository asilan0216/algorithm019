学习笔记


本周主要学习了深度优先，广度优先，贪心算法，二分查找

DFS 递归和递归写法 

递归模板：
public List<List<Integer>> levelOrder(TreeNode root) {
  List<List<Integer>> allResults = new ArrayList<>();
  if(root==null){
    return allResults;
  }
  travel(root,0,allResults);
  return allResults;
}

private void travel(TreeNode root,int level, List<List<Integer>> results) {
  if (results.size() == level) { 
    results.add(new ArrayList<>());
  }
  results.get(level).add(root.val);
  if (root.left != null) {
    travel(root.left,level+1,results);
  }
  if(root.right != null){
    travel(root.right, level+1, results);
  }
}

非递归模板：

#Python
def DFS(self, tree):
  if tree.root is None:
     return []
  visited, stack = [], [tree.root]	
  while stack:		
     node = stack.pop()
     visited.add(node)		
     process (node)	
     nodes = generate_related_nodes(node)
     stack.push(nodes)	
# other processing work 	...


BFS 模板

//Java 
public class TreeNode {    
  int val;    
  TreeNode left;    
  TreeNode right;    T
  TreeNode(int x) {        
     val = x;    
  }
}

public List<List<Integer>> levelOrder(TreeNode root) {   
  List<List<Integer>> allResults = new ArrayList<>();   
  if (root == null) {        
    return allResults;    
  }    
  Queue<TreeNode> nodes = new LinkedList<>();    
  nodes.add(root);    
  while (!nodes.isEmpty()) {
    int size = nodes.size();       
    List<Integer> results = new ArrayList<>();      
    for (int i = 0; i < size; i++) {            
      TreeNode node = nodes.poll();            
      results.add(node.val);            
      if (node.left != null) {                
        nodes.add(node.left);            
      }            
      if (node.right != null) {    
        nodes.add(node.right);
      }        
    }        
   allResults.add(results);    
  }    
  return allResults;
}