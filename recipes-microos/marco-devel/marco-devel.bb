SUMMARY = "MATE window manager development files"
DESCRIPTION = "Marco is a small window manager, using GTK+ to do everything. It is \
developed mainly for the MATE Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "marco-devel-1.26.1-1.3.aarch64.rpm"
RPM_HASH = "97139d84411f733c607bb1808c1f41469134e92fb2ff40be4be66efe6f14c4e6906a77f193fb7e40e9c7c1846b7d226cf2b27662c79a3072f230d673fde0e2ca"

RPROVIDES:${PN} += "marco-devel marco-devel(aarch-64) mate-window-manager-devel pkgconfig(libmarco-private)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmarco-private2 pkgconfig(gtk+-3.0)"

inherit rpm
