SUMMARY = "Header files for the GNOME Control Center"
DESCRIPTION = "The control center is GNOME's main interface for configuration of \
various aspects of your desktop."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-control-center-devel-44.2-1.1.noarch.rpm"
RPM_HASH = "213416283c63768b2d133881091d6f7f13ce029920193a761b2f39e6d7cb7a3045933149feb8b639f31bdcc8845b91879c38d4b183afc96946cc3e23f6cb697c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-devel \
pkgconfig(gnome-keybindings)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-control-center"

inherit rpm
