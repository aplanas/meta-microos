SUMMARY = "Adapta GTK+4 themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the GTK+4 themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "gtk4-metatheme-adapta-3.95.0.11-3.5.noarch.rpm"
RPM_HASH = "7d0ad5c25c5619c805d2338c4837bbbbdb51f99666b90031d1075ab9d60aef62f27d705d34ab6cb805a35e20438dbf26c57df91304b3beeff2f38c419b9aea5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-adapta"
RDEPENDS:${PN} += "gtk4 metatheme-adapta-common"

inherit rpm
