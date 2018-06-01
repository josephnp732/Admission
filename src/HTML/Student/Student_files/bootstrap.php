(function() {
	var _smartsupp = {};
	var smartsupp = window.parent.smartsupp;
	var smartsuppChat = parent.smartsupp.chats[smartchatId];
	
	var smartsuppLoadInterval = setInterval(function() {
		if (!window.miwo) return;
		clearInterval(smartsuppLoadInterval);
		smartsuppChat.setOptions(_smartsupp);
		miwo.ready(function() {
			(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
			(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
			m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
			})(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

			miwo.cookie.document = parent.document;
			miwo.baseUrl = smartsuppChat.getOption('baseUrl');
			miwo.staticUrl = smartsuppChat.getOption('staticUrl');

			var data = {"package":"free","lang":"en","orientation":"right","hideBanner":false,"hideWidget":false,"hideOfflineBanner":false,"enableRating":false,"requireLogin":false,"hideOfflineChat":false,"muteSounds":false,"isEnabledEvents":false,"banner":{"type":"arrow","options":{}},"translates":{"online":{"title":"CMR Group","infoTitle":"CMR Group","infoDesc":"of Institutions"},"offline":{"notice":"Admission Hotline: <b><h2>09342900666<\/h2><\/b>\nNote: Mention your Phone Number in the message box."},"widget":{},"banner":{"arrow":{},"bubble":{}}},"colors":{"primary":"#04CAD8","banner":"#FFEE00","primaryText":"#353A3A"},"theme":{"name":"flat","options":{"widgetRadius":3}},"api":{"basic":true,"banner":true,"events":false,"groups":false,"theme":true}};
			data.baseLang = 'en';
			data.browserLang = 'en';
			data.avatar = '/chats/104821/avatar-f08liddbpj.png';
			data.host = 's16.smartsupp.com';
			data.packageName = 'free';
			data.logoUrl = '';
			data.logoSrc = '';
			data.logoSmSrc = '';
			data.smartlook = window.smartlook;

			var configurator = new Miwo.Configurator();
			configurator.addConfig(App.DefaultConfig.getConfig());
			configurator.addConfig(App.ClientConfig.getConfig(data));
			configurator.addConfig(App.ChatConfig.getConfig(smartsuppChat));

			configurator.ext(new Chat.ChatExtension());
			var container = configurator.createContainer();
			container.get('miwo.application').run();
		});
	}, 50);
	
	
	if(!window.parent.visitortrace && !window.parent.smartlook && window.parent._smartsupp && smartsuppChat.getOption('recordingDisable')!==true && smartsuppChat.getOption('visitortraceDisable')!==true) {
		var _smartlook = window.parent._smartlook || window.parent._visitortrace || {};
		_smartlook.host = 's2.smartlook.com';
		_smartlook.window = window.parent;
		_smartlook.document = window.parent.document;
		if(window.parent._smartsupp.cookieDomain && !_smartlook.cookieDomain){ _smartlook.cookieDomain = window.parent._smartsupp.cookieDomain; }
		if(window.parent._smartsupp.cookiePath && !_smartlook.cookiePath){ _smartlook.cookiePath = window.parent._smartsupp.cookiePath; }
	
		window.smartlook||(function(d) {var o=smartlook=function(){ o.api.push(arguments)},
		s=d.getElementsByTagName('script')[0],c=d.createElement('script');o.api=[];c.type='text/javascript';
		c.async=true;c.charset='utf-8';c.src='https://rec1.smartlook.com/recorder.js?t='+
		new Date().getTime();s.parentNode.insertBefore(c,s);})(window.parent.document);
		window.parent.smartlook = window.smartlook;
	
		smartlook('init', 'b34866c50ea91699d08ebeeecae933dcf5030a49', _smartlook);
	}
	
	
	!smartsuppChat.getOption('disableInternalApi') && (function() {
		
	})();
})();
