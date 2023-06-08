SUMMARY = "Development environment for the ZBar library"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools needed to compile and link \
applications using the zbar library."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "libzbar-devel-0.23.90-3.1.aarch64.rpm"
RPM_HASH = "c6f8d3d3a4e69fabe9f3c567c5c9c9cf9946f7264602773c1d59fddb674fa2daf288f00cc42c8fb117fae46f42826f74e8d1c6c9ee56161f9da59b88e251422d"

RPROVIDES:${PN} += "libzbar-devel libzbar-devel(aarch-64) pkgconfig(zbar)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libzbar0"

inherit rpm
