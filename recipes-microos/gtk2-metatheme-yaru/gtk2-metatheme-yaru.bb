SUMMARY = "GTK+ 2 support for the Yaru Gtk Theme"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only & LGPL-3.0-only & CC-BY-SA-4.0"

PV = "20.10.6.1"

RPM_NAME = "gtk2-metatheme-yaru-20.10.6.1-1.6.noarch.rpm"
RPM_HASH = "6971d348ceae65da01d795be4a1dbc853440a0b08ae9f48d9db8f3cdf045ee9a173a48dc384837370a754809cbe85295e1147240a264c6d6c83f83207e7a017c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-yaru"
RDEPENDS:${PN} += "gtk2-engine-murrine gtk2-theming-engine-adwaita metatheme-yaru-common"

inherit rpm
