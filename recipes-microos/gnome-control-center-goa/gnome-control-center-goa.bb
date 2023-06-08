SUMMARY = "Configuration panel for online accounts"
DESCRIPTION = "This package provides the online accounts onfiguration panel for \
GNOME control center."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-control-center-goa-44.1-1.1.noarch.rpm"
RPM_HASH = "76b85cf2f30a3a37f5476aacef43cd5c78906e1a6b2595c16d8b83c61673c4b1e37781a6e2d085150bcbe0770554142ca879e4907d37f735d20a2ccb9e2696cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(gnome-online-accounts-panel.desktop) gnome-control-center-goa"
RDEPENDS:${PN} += "gnome-control-center gnome-online-accounts"

inherit rpm
