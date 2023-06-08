SUMMARY = "Arc GTK 3 Theme"
DESCRIPTION = "Arc is a flat theme with transparent elements. \
It supports MATE, GNOME, Budgie, Xfce, and Cinnamon. \
 \
This package contains the GTK 3 theme."
LICENSE = "GPL-3.0-or-later"

PV = "20221218"

RPM_NAME = "gtk3-metatheme-arc-20221218-1.1.noarch.rpm"
RPM_HASH = "719c5b11e5b9b7ae6ef2bd696d800625194d328d1b662ee7f74529717901e862b9b69f44f2d048c0a8017c84c92df9f93c81355b0d8df7f016b3500c807cbdf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-arc"
RDEPENDS:${PN} += "gtk3 metatheme-arc-common"

inherit rpm
