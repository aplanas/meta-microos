SUMMARY = "Wayland support for the GNOME Session Manager"
DESCRIPTION = "This package contains the definition of the default GNOME session on Wayland."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-session-wayland-44.0-2.1.aarch64.rpm"
RPM_HASH = "5139efc6b727bdf01c34973ede0272dc4e21d5a173e3fa4fcdd2c96dd3cb230c60dd1cf7ea5042336e9fed9a5752aa091988b799f162582c7d4bb243f0de52bb"

RPROVIDES:${PN} += "gnome-session-wayland \
gnome-session-wayland(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gnome-session \
gnome-settings-daemon \
xorg-x11-server-wayland"

inherit rpm
