#include <stdio.h>
#include <stdlib.h>

int main() {
    // Define a struct for linked list node
    struct node {
        int data;
        struct node *next;
    };

    // Create three nodes
    struct node *head, *middle, *last;

    // Allocate memory for each node
    head = (struct node *)malloc(sizeof(struct node));
    middle = (struct node *)malloc(sizeof(struct node));
    last = (struct node *)malloc(sizeof(struct node));

    // Assign data to each node
    head->data = 10;
    middle->data = 20;
    last->data = 30;

    // Link the nodes
    head->next = middle;
    middle->next = last;
    last->next = NULL;  

    // Temporary pointer to traverse the list
    struct node *temp = head;

    // Traverse and print the linked list
    printf("Linked List: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");

    // Free the allocated memory
    free(head);
    free(middle);
    free(last);

    return 0;
}
