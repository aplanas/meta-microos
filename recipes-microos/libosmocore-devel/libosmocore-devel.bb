SUMMARY = "Development files for the Osmocom core library"
DESCRIPTION = "libosmocore is a library with various utility functions shared \
between OpenBSC and OsmocomBB. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmocore."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmocore-devel-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "edc79cc50cb75bf7afbae6e10b61ed7e32de6dd48d784f5ad4a36461654d03b7025c3f3476f043dc91e392b12e13e4302c1cf189ac52560b8aeebe8a7914679a"

RPROVIDES:${PN} += "libosmocore-devel libosmocore-devel(aarch-64) pkgconfig(libosmocore)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmocore19 libtalloc-devel pkgconfig(libsctp) pkgconfig(talloc)"

inherit rpm
