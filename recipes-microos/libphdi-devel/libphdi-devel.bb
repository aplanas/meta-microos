SUMMARY = "Development files for libphdi"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libphdi."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi-devel-20221025-3.8.aarch64.rpm"
RPM_HASH = "18041965eecd3a46295e3b806feebc78cc2037cb00eb71ce31d99766808287a174ad4af9c2eb6c602d97f972e9b5af5f11473372aa83bc0ebde54a736b968de5"

RPROVIDES:${PN} += "libphdi-devel libphdi-devel(aarch-64) pkgconfig(libphdi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbfio-devel libphdi1"

inherit rpm
