#ifndef NODE_H
#define NODE_H

typedef struct node node;

/**
 * A node of a linked list.
 */
struct node {
  int value;
  node *next_node;
};

/**
 * Create a new node for the linked list.
 * @param value The value stored by the node
 * @return The new node
 */
node *node_create_node(int value);

/**
 * Add a node to an ordered linked list.
 * @param head The linked list
 * @param new_node The node to be added
 */
void node_add_node(node **head, node *new_node);

/**
 * Return the value of the first node in the linked list and delete it from the
 * linked list.
 * @param head The linked list
 * @return The value of the head of the queue (-1 if list is empty)
 */
int node_pop_head(node **head);

#endif
