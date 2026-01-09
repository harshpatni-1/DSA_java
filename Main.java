# A simple beginner-friendly Python program: Guess the Number Game

# This program picks a random number between 1 and 100,
# and asks the player to guess it. It gives hints if the guess is too high or too low.

import random  # We need this to generate a random number

# Generate a random secret number between 1 and 100
secret_number = random.randint(1, 100)

print("Welcome to the Guess the Number game!")
print("I'm thinking of a number between 1 and 100.")
print("Try to guess it!")

# Keep track of how many guesses the player makes
guesses = 0

# The game loop - continues until the player guesses correctly
while True:
    # Ask the player for a guess
    guess = int(input("Enter your guess: "))
    
    # Count this guess
    guesses += 1
    
    # Check if the guess is correct
    if guess == secret_number:
        print(f"Congratulations! You got it! The number was {secret_number}.")
        print(f"It took you {guesses} guesses.")
        break  # Exit the loop because the game is over
    elif guess < secret_number:
        print("Too low! Try a higher number.")
    else:
        print("Too high! Try a lower number.")

print("Thanks for playing!")