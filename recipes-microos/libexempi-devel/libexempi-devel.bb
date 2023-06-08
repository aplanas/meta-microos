SUMMARY = "Development files for the Exempi XMP support library"
DESCRIPTION = "Exempi is a library for XMP metadata parsing and doing I/O with it. \
 \
This subpackage contains the header files for building applications \
with Exempi."
LICENSE = "BSD-3-Clause"

PV = "2.6.3"

RPM_NAME = "libexempi-devel-2.6.3-1.3.aarch64.rpm"
RPM_HASH = "5e79f866afe9182ff6ed319713a75ad8e5694587d989689a95c76081761834512c5637f9b1b4243f21cae0c448bcfd3d2795bf8405b9630dd57084830579cc0e"

RPROVIDES:${PN} += "libexempi-devel libexempi-devel(aarch-64) pkgconfig(exempi-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libexempi8"

inherit rpm
