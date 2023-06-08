SUMMARY = "Development files for libproxy, a library to do PAC/WPAD"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
This subpackage contains header files for developing applications \
that want to make use of libproxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy-devel-0.4.18-1.4.aarch64.rpm"
RPM_HASH = "e136b31fea3a5102e3cc40a7b2f054ca576dbade840d2e3302d11f606924bd3183629be1634833aea0e89bc47c4dda36c61fbd38d537d14fe1d262f3967b8811"

RPROVIDES:${PN} += "libproxy-devel libproxy-devel(aarch-64) pkgconfig(libproxy-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libproxy1"

inherit rpm
