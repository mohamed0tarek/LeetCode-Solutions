class Solution {
    class Node {
        String val;
        int turns;
        Node(String val,int turns){
            this.val = val;
            this.turns = turns;
        }
    }
    public int openLock(String[] deadends, String target) {
        Queue<Node> que = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Collections.addAll(visited,deadends);
        que.offer(new Node("0000",0));
        if(visited.contains("0000")) return -1;
        else visited.add("0000");
        while (!que.isEmpty()){
            Node node = que.poll();
            String poped = node.val;
            int turn = node.turns;
            if(poped.equals(target))
                return turn;
            for (String child : children(poped))
                if(!visited.contains(child)){
                    que.offer(new Node(child,turn+1));
                    visited.add(child);
                }
        }
        return -1;
    }
    public List<String> children(String s){
        List<String> res = new ArrayList<>();
        for (int i=0;i<4;i++){
            String digit = String.valueOf((s.charAt(i)-'0'+1)%10);
            String assemble = s.substring(0,i)+digit+s.substring(i+1);
            res.add(assemble);
            digit = String.valueOf((s.charAt(i)-'0'-1+10)%10);
            assemble = s.substring(0,i)+digit+s.substring(i+1);
            res.add(assemble);
        }
        return res;
    }
}
