SUMMARY = "MATE window manager development files"
DESCRIPTION = "Marco is a small window manager, using GTK+ to do everything. It is \
developed mainly for the MATE Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.2"

RPM_NAME = "marco-devel-1.26.2-1.1.aarch64.rpm"
RPM_HASH = "fd002641e5dd0151f31e1d855404657636dbd5d2d80c09eba53332ff3b5abf88138057fb49f4d4dcf7a8edf6bb01e498ded337aecca877604e1f5108546121e0"

RPROVIDES:${PN} += "marco-devel marco-devel(aarch-64) mate-window-manager-devel pkgconfig(libmarco-private)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmarco-private2 pkgconfig(gtk+-3.0)"

inherit rpm
