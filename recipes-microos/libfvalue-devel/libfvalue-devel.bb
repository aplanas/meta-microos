SUMMARY = "Development files for libfvalue"
DESCRIPTION = "Library to provide generic file value functions for the libyal family of libraries. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfvalue."
LICENSE = "LGPL-3.0-or-later"

PV = "20220120"

RPM_NAME = "libfvalue-devel-20220120-3.4.aarch64.rpm"
RPM_HASH = "3c0942205f73b9f243330432c2eb5de74abc8a4c616bd41c8a0b863fe7e6edab4679af4a69e800d225303126298ba85e13a79568feb6f7012cdbb938bc0979b5"

RPROVIDES:${PN} += "libfvalue-devel libfvalue-devel(aarch-64) pkgconfig(libfvalue)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libfvalue1"

inherit rpm
