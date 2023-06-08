SUMMARY = "Matcha common theme files"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains common files for all Matcha themes."
LICENSE = "GPL-3.0-only"

PV = "20221115"

RPM_NAME = "metatheme-matcha-common-20221115-1.1.noarch.rpm"
RPM_HASH = "74fde318542879a65448d0bcd6b20a33f838805781de57b929dca8d66f24c38ca2ce809cb0bba8d35801171778b21111428a73bc2d0c74ccf0260f0dd1579d82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "matcha-gtk-theme metatheme-matcha-common"
RDEPENDS:${PN} += "google-roboto-fonts noto-sans-fonts"

inherit rpm
