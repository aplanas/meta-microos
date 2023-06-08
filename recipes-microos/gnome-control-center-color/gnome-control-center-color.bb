SUMMARY = "Configuration panel for color management"
DESCRIPTION = "This package provides the color management configuration panel for \
GNOME control center."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-control-center-color-44.1-1.1.noarch.rpm"
RPM_HASH = "9b220763afc47e571c257affd420fa48a168da3b14def17af4a5782a55fd92dbd2e7ff9b424b6804d53248b6cb90480fc96c65b5637cf95b5391dbcb09cee5e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(gnome-color-panel.desktop) gnome-control-center-color"
RDEPENDS:${PN} += "colord gnome-color-manager gnome-control-center"

inherit rpm
