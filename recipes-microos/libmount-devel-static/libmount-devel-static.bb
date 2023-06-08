SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libmount-devel-static-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "db095f97f1627bfc6faa91ac10f1b206f8d3f732052ff6eea9d1becea4cd5696c6835e7188f4ff2cae839f4f2c534c962dfbd4f90f105d4ef0c3ffbd78a46a56"

RPROVIDES:${PN} += "libmount-devel-static libmount-devel-static(aarch-64)"
RDEPENDS:${PN} += "libmount-devel"

inherit rpm
