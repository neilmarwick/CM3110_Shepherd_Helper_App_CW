# CM3110_Shepherd_Helper_App_CW


## Shepherd Helper - Tool for making the work life of shepherds easier
## App plan - app description

#### Developer - Neil Marwick 2004752

This is the ideal app for sheep farmers and will make their work life more convenient and reduce paper-work.

#### Planned functionalities within the app:

-  You can store information about your sheep such as its breed, age, gender, tag number, a photo of the sheep.
This information is stored in a ROOM SQLite Database making it accessible offline.

- Shepherd Helper works in portrait and landscape view.

- There is a calculator which the user can input values into to calculate values such as correct dosages for vaccines and minerals, and also calculate
the amount of space they should allow in an agricultural field for an inputted number of sheep to ensure good animal welfare.

- Shepherd Helper can send you notifications to your device containing facts about sheep.

- Shepherd Helper uses an API from Signet Breeding services to provide a sheep's breeding value (how likely it is to have certain genetic traits)
  It can obtain this data and then nicely format it inside the app.

- If you want to do this you simply have to provide the following information which all legal sheep owners should have:
  - Your flock code
  - Your breed organisation name
  - The current date

- More information about Signet's API: https://signetdata.com/api/v1/get_animal_ebv_json?id=UK+0+162361+01754

#### Planned permissions required:
- To upload a photo of the sheep (optional) the app will require permissions to the camera & photo gallery app.


## App plan - app design (what the implementation is actually like)

I was not able to implement any web-services or databases.

All of the activities work in landscape mode by creating a "Landscape Qualifier". I made a separate XML file for each activity and switched up the layout of the views so everything would look correct in landscape mode.

There is a back button on the action bar of the calculator and RecyclerView (My sheep) activity to go back to the Start Menu activity, this was done using intents.

### Start Menu Activity

This is the activity the user sees when they open the app, however there will be a pop-up that appears when the app is first installed asking to the user to give the app permissions to send notifications.
When you click the "Recieve Notifications" button it sends a notification to your device. Notifications are assigned to a channel in StartMenuActivity.java, in my code the channelID is "Notification".
This activity uses a ConstraintLayout. The other 2 buttons open other activities when you click them. 


Screenshot of the Start Menu Activity:

- <img src="https://user-images.githubusercontent.com/73298944/205743605-b448fd38-cd3d-4cb0-91e3-c573e2384c30.jpg" width="30%" height="30%">
Example of notification being sent from the app after clicking the "Recieve Notifications" button:

- <img src="https://user-images.githubusercontent.com/73298944/205744901-afe45334-fbc5-41db-9416-791d08013395.jpg" width="30%" height="30%">



### Calculator Activity

On this page there is EditTexts which the user can enter information into, click the submit button which will display an answer in a TextView. The views for this activity are contained within a ConstraintLayout and the landscape version's views are contained within a ScrollView.

Screenshot of what the Calculator activity looks like when first opened:
- <img src="https://user-images.githubusercontent.com/73298944/205751315-bad96e2c-3574-4aab-b494-82cfd80356dc.png" width="30%" height="30%">

Screenshot of what the Calculator activity does:
- <img src="https://user-images.githubusercontent.com/73298944/205751363-99f73a71-2918-47ab-8768-5424bd38a7a3.png" width="30%" height="30%">


### My Sheep Actvitiy (contains the RecyclerView)

On this page there is a RecyclerView which contains sheep. This page is scrollable, so you need to scroll on it to see everything. I attempted to let the user add their own sheep into the RecyclerView but it was too complicated, so as an alternative to this, I made it so the RecyclerView already contains data.
This RecyclerView gets data from 3 classes - SheepModel.java, Sheep_RecyclerViewAdapter and RecyclerViewActivity.java. The landscape XML version of this page uses a ScrollView layout whereas the portrait version uses a ConstraintLayout.

Screenshot of the My Sheep activity:

- <img src="https://user-images.githubusercontent.com/73298944/205758177-c19763fd-6988-46f5-8c80-01b056829b9b.jpg" width="30%" height="30%">



## Testing

Testing functionality within the app

<img width="1002" alt="image" src="https://user-images.githubusercontent.com/73298944/205776553-01beea1e-2dc5-4ccd-8147-2c39900f9cfb.png">



## Reflective statement

The emulator in Android Studio was often very slow and unresponsive which wasted a lot of my time. If I was making an app in Android Studio again I would run my app on a physical Android device instead.
Next time I would come up with a very detailed plan and idea for an app before trying to implement the app in Android Studio, as I had no idea what to do sometimes when trying to make the app as I didn't have much of a plan.
What went well is I had a decent idea of how to make the user interface as I had practiced with it quite a lot before, but I had very little to no experience in implementing APIs, a database or connecting my app to a web service, so I struggled a lot with that.
But overall I still somewhat learned how to make a mobile app as that's something I had never done before. 
Next time I would start this project much earlier as I was very pushed for time and rushed some things which meant I didn't have much of a chance to learn about implementing databases, APIs or connecting the app to a web service. This meant, when developing the app, I sort of stuck with what I knew how to do already which was make user interfaces, which meant I didn't learn as much as I could have done.


