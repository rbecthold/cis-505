/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

public class ProductDB {
    
    /**
     * getProducts method to return a GenericQueue<Product> full of the selected Product type
     * @param code String
     * @return [bags/balls/shoes/empty] GenericQueue<Product>
     */
    public static GenericQueue<Product> getProducts(String code) {
        
        // If user inputs "a", a GenericQueue<Product> of Bag Products will be created and returned
        if(code.equalsIgnoreCase("a")) {

            // Create new GenericQueue<Product> of Bags for return
            GenericQueue<Product> bags = new GenericQueue<Product>();

            // Create new Bag bag1, set attributes, and add to bags queue
            Bag bag1 = new Bag();
            bag1.setCode("a001");
            bag1.setPrice(49.99);
            bag1.setDescription("Beginner bag");
            bag1.setType("Single");
            bags.enqueue(bag1);

            // Create new Bag bag2, set attributes, and add to bags queue
            Bag bag2 = new Bag();
            bag2.setCode("a002");
            bag2.setPrice(74.99);
            bag2.setDescription("Advanced bag");
            bag2.setType("Double");
            bags.enqueue(bag2);

            // Create new Bag bag3, set attributes, and add to bags queue
            Bag bag3 = new Bag();
            bag3.setCode("a003");
            bag3.setPrice(99.99);
            bag3.setDescription("Party bag");
            bag3.setType("Triple");
            bags.enqueue(bag3);

            // Return GenericQueue<Product> of Bag objects
            return bags;
        }

        // If user inputs "b", a GenericQueue<Product> of Ball Products will be created and returned
        else if(code.equalsIgnoreCase("b")) {

            // Create new GenericQueue<Product> of Balls for return
            GenericQueue<Product> balls = new GenericQueue<Product>();

            // Create new Ball ball1, set attributes, and add to balls queue
            Ball ball1 = new Ball();
            ball1.setCode("b001");
            ball1.setPrice(99.99);
            ball1.setDescription("Perfect for beginners!");
            ball1.setColor("Black");
            balls.enqueue(ball1);

            // Create new Ball ball2, set attributes, and add to balls queue
            Ball ball2 = new Ball();
            ball2.setCode("b002");
            ball2.setPrice(69.99);
            ball2.setDescription("Baby\'s first bowling ball");
            ball2.setColor("Blue/Pink");
            balls.enqueue(ball2);

            // Create new Ball ball3, set attributes, and add to balls queue
            Ball ball3 = new Ball();
            ball3.setCode("b003");
            ball3.setPrice(159.99);
            ball3.setDescription("SpinMaster 5000");
            ball3.setColor("Green & White");
            balls.enqueue(ball3);

            // Create new Ball ball4, set attributes, and add to balls queue
            Ball ball4 = new Ball();
            ball4.setCode("b004");
            ball4.setPrice(159.99);
            ball4.setDescription("The StraightLine");
            ball4.setColor("Black & Blue");
            balls.enqueue(ball4);

            // Create new Ball ball5, set attributes, and add to balls queue
            Ball ball5 = new Ball();
            ball5.setCode("b005");
            ball5.setPrice(249.99);
            ball5.setDescription("It\'s made of glass.  Maybe not the best?");
            ball5.setColor("Clear?  Translucent?");
            balls.enqueue(ball5);

            // Return GenericQueue<Product> of Ball objects
            return balls;
        }

        // If user inputs "s", a GenericQueue<Product> of Shoe Products will be created and returned
        else if(code.equalsIgnoreCase("s")) {

            // Create new GenericQueue<Product> of Shoes for return
            GenericQueue<Product> shoes = new GenericQueue<Product>();

            // Create new Shoe shoe1, set attributes, and add to shoes queue
            Shoe shoe1 = new Shoe();
            shoe1.setCode("s001");
            shoe1.setPrice(39.99);
            shoe1.setDescription("Children\'s pair");
            shoe1.setSize(4.0);
            shoes.enqueue(shoe1);

            // Create new Shoe shoe2, set attributes, and add to shoes queue
            Shoe shoe2 = new Shoe();
            shoe2.setCode("s002");
            shoe2.setPrice(49.99);
            shoe2.setDescription("Beginner\'s pair");
            shoe2.setSize(7.0);
            shoes.enqueue(shoe2);

            // Create new Shoe shoe3, set attributes, and add to shoes queue
            Shoe shoe3 = new Shoe();
            shoe3.setCode("s003");
            shoe3.setPrice(59.99);
            shoe3.setDescription("Women\'s standard");
            shoe3.setSize(6.0);
            shoes.enqueue(shoe3);

            // Create new Shoe shoe4, set attributes, and add to shoes queue
            Shoe shoe4 = new Shoe();
            shoe4.setCode("s004");
            shoe4.setPrice(59.99);
            shoe4.setDescription("Men\'s standard");
            shoe4.setSize(8.0);
            shoes.enqueue(shoe4);

            // Create new Shoe shoe5, set attributes, and add to shoes queue
            Shoe shoe5 = new Shoe();
            shoe5.setCode("s005");
            shoe5.setPrice(89.99);
            shoe5.setDescription("Advanced pair");
            shoe5.setSize(9.0);
            shoes.enqueue(shoe5);

            // Return GenericQueue<Product> of Shoe objects
            return shoes;
        }

        // If the user inputs "x" (or any invalid input), an empty GenericQueue<Product> will be returned
        else {

            // Return empty GenericQueue<Product>
            return new GenericQueue<Product>();
        }
    }

} // end ProductDB class