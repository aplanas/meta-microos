SUMMARY = "Header files for the GNOME Control Center"
DESCRIPTION = "The control center is GNOME's main interface for configuration of \
various aspects of your desktop."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-control-center-devel-44.1-1.1.noarch.rpm"
RPM_HASH = "da6da21ee2deced1162af970a3a0e613b5239f0d442a07043f2f194138e399458dd95bf92058669236bac990b8f036d0960cc254463bd1081f75690b5b6cdbfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-devel pkgconfig(gnome-keybindings)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnome-control-center"

inherit rpm
