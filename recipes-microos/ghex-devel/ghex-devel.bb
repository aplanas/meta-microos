SUMMARY = "GNOME Binary Editor -- Development Files"
DESCRIPTION = "GHex allows the user to load data from any file and to view and edit it \
in either hex or ASCII. It is a must for anyone playing games that use \
a non-ASCII format for saving."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "ghex-devel-44.1-1.1.aarch64.rpm"
RPM_HASH = "18f201766894ec7da7d265e71e3ab39e975a6b3751a74cf4e3b6be7c1004ff9ad38e2f670114c0e17b1f68e5a4941f0f8632552d71c10c925cabd602ad806c3a"

RPROVIDES:${PN} += "ghex-devel \
ghex-devel(aarch-64) \
pkgconfig(gtkhex-4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkhex-4-1 \
pkgconfig(gtk4)"

inherit rpm
