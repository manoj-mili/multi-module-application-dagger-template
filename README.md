# multi-module-application-dagger-template
Android Multi-Module Code Template Using Dagger For DI, Room for caching and retrofit for network. It is feature and layering based separation

Pros:
- Better Separation
- Reusability
- Smaller/Specific dependency
- Leads to faster build based on gradle configs

Cons:
- Features are not completely isolated features don't have their own domain, data source and other layers so completely using particular module in other projects won't be possible.
- Taking owner ship of the data source and domain as a team it would become important to make sure not multiple intent changes the data its like 1 intent should have option to change data others should be mere consumers.

Videos To Know More About this thougt process</br>
https://youtu.be/PZBg5DIzNww<br>
https://youtu.be/OM4nA9Zykwk
