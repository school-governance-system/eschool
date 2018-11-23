import {enableProdMode} from '@angular/core';
import {environment} from './environments/environment';


if (environment.production) {
  enableProdMode();
}

import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';
import {ChankyaAppModule} from './app/app.module';
platformBrowserDynamic().bootstrapModule(ChankyaAppModule);



