SUMMARY = "Translations for package plasma-applet-weather-widget"
DESCRIPTION = "Provides translations for the 'plasma-applet-weather-widget' package."
LICENSE = "GPL-2.0-only"

PV = "1.6.10"

RPM_NAME = "plasma-applet-weather-widget-lang-1.6.10-5.7.noarch.rpm"
RPM_HASH = "7acdf3d570df5fac4185b8e4f9d2eae99419a913bfa1bede89e91bb1bc22e70f658cd73c7ecb30ecd869fb2e25aec0a17a0c73fa47bb108032d471d274f24a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma-applet-weather-widget:bg) \
locale(plasma-applet-weather-widget:cs) \
locale(plasma-applet-weather-widget:de) \
locale(plasma-applet-weather-widget:en) \
locale(plasma-applet-weather-widget:es) \
locale(plasma-applet-weather-widget:fr) \
locale(plasma-applet-weather-widget:hu) \
locale(plasma-applet-weather-widget:it_IT) \
locale(plasma-applet-weather-widget:pl) \
locale(plasma-applet-weather-widget:ru) \
locale(plasma-applet-weather-widget:zh_CN) \
locale(plasma-applet-weather-widget:zh_TW) \
plasma-applet-weather-widget-lang \
plasma-applet-weather-widget-lang-all"
RDEPENDS:${PN} += "plasma-applet-weather-widget"

inherit rpm
