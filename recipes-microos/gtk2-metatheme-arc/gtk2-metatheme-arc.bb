SUMMARY = "Arc GTK 2 Theme"
DESCRIPTION = "Arc is a flat theme with transparent elements. \
It supports MATE, GNOME, Budgie, Xfce, and Cinnamon. \
 \
This package contains the GTK 2 theme."
LICENSE = "GPL-3.0-or-later"

PV = "20221218"

RPM_NAME = "gtk2-metatheme-arc-20221218-1.1.noarch.rpm"
RPM_HASH = "079c90f6e8d14626832c7598a59a0891f99f86214c77872a4d56e7d6c56fbc41111234027b2be1e62c58724da77d9fcb5d5d87bd3d56686713b033d7aaadecb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-arc"
RDEPENDS:${PN} += "gtk2-engine-murrine metatheme-arc-common"

inherit rpm
