# CantarusApp

Hi,

I designed the system in this way as it allows for the system to really scale up, you could add more Item variations and by using the Abstract class you can simply just add into that what an item can really hold. By abstracting out the details of the products into their own classes it makes anything possible. I also abstracted the checkout into its own class so i could handle all types of the checkout. This means the checkout can handle all the rules and can handle any change in rules. I designed the system this was so if the system does scale up in the future, the overall performance should be ok.

I designed a simple algorithm to calculate the costs on the fly, you will see this in the Checkout class. 

I hope the Unittesting will not let me down. My new laptop wouldnt compile the JUNIT file and kept saying 'package does not exist' I tried to debug the issue but the time ran out. I'll include a link to another repository which is past work of mine which does show I can write Unit tests, It just wouldn't work on this occurance which is a shame.

https://github.com/AndrewLawler/comp_122_as4/tree/master/comp122_assessment_4_201210893

I hope you like it and i look forward to some feedback from you.

If i was to improve the system with more time i would change the storage of the price and cost and store them both together inside Checkout, this way i could eliminate one of my data storages and make the memory allocation a lot smaller, I would also explore ways of storing items better as this current method is Items * O(N) as i have to search the scanned items fully for each speciic item which is not the best.

*IMPORTANT* - Managed to get the JUNIT jar working on my new laptop, as you can see i havent edited any of the files in the github repo, i just ran the file i wrote freehand and the test worked sucessfully which is great*

Andrew
