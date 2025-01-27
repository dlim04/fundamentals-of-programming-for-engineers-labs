extern "C" {
  #include "node.h"
}

/**
 * Prints out and deletes the contents of a linked list.
 */
void print_linked_list(node *head) {
  // Loop through the linked list and print the values in order
  int value = node_pop_head(&head);
  while (value != -1) {
    Serial.println(value);

    // Prevents weird serial behaviour
    delay(20);

    value = node_pop_head(&head);
  }
}

/**
 * Test the implementation of node.c.
 * Should print:
 * 1
 */
void test1() {
  Serial.println();
  Serial.println("==== TEST 1 ====");

  node *head = NULL;
  node *n = NULL;
  
  // Build the linked list
  n = node_create_node(1);
  node_add_node(&head, n);

  print_linked_list(head);
}

/**
 * Test the implementation of node.c.
 * Should print:
 * 2
 * 3
 * 4
 */
void test2() {
  Serial.println();
  Serial.println("==== TEST 2 ====");

  node *head = NULL;
  node *n = NULL;
  
  // Build the linked list
  n = node_create_node(2);
  node_add_node(&head, n);
  n = node_create_node(3);
  node_add_node(&head, n);
  n = node_create_node(4);
  node_add_node(&head, n);

  print_linked_list(head);
}

/**
 * Test the implementation of node.c.
 * Should print:
 * 5
 * 6
 * 7
 */
void test3() {
  Serial.println();
  Serial.println("==== TEST 3 ====");

  node *head = NULL;
  node *n = NULL;
  
  // Build the linked list
  n = node_create_node(7);
  node_add_node(&head, n);
  n = node_create_node(6);
  node_add_node(&head, n);
  n = node_create_node(5);
  node_add_node(&head, n);

  print_linked_list(head);
}

/**
 * Test the implementation of node.c.
 * Should print:
 * 8
 * 9
 * 10
 */
void test4() {
  Serial.println();
  Serial.println("==== TEST 4 ====");

  node *head = NULL;
  node *n = NULL;
  
  // Build the linked list
  n = node_create_node(10);
  node_add_node(&head, n);
  n = node_create_node(8);
  node_add_node(&head, n);
  n = node_create_node(9);
  node_add_node(&head, n);

  print_linked_list(head);
}

void setup() {
  Serial.begin(9600);
  test1();
  // test2();
  // test3();
  // test4();
}

void loop() {
  exit(EXIT_SUCCESS);
}
