SUMMARY = "Search appliance sample app"
DESCRIPTION = "Search appliance sample app that demonstate how the kiosk \
compositor is used."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-kiosk-sample-app-44.0-1.1.noarch.rpm"
RPM_HASH = "b6ab1090b39f1fb0e6445279ad66b7ca1fa23a18253ea98c058669b8772b3548263177f1bbec2c2761e4daf4d6a539c814602cf65ef030e397644530645d748a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.gnome.Kiosk.SearchApp.desktop) gnome-kiosk-sample-app"
RDEPENDS:${PN} += "MozillaFirefox gnome-kiosk"

inherit rpm
