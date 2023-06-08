SUMMARY = "Development environment for the ZBar Qt bindings library"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools needed to compile and link \
applications using the zbar-qt library."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "libzbarqt-devel-0.23.90-3.1.aarch64.rpm"
RPM_HASH = "abba3bf94220ef5c5dc83531014fb636ccb8c3693c828fa4e802556a879b3954dcfe7a0d5f54886ca67e117eef7a0fc05487d14d2073326b5835ae11471491e1"

RPROVIDES:${PN} += "libzbarqt-devel libzbarqt-devel(aarch-64) pkgconfig(zbar-qt)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libzbar-devel libzbarqt0 pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(zbar)"

inherit rpm
