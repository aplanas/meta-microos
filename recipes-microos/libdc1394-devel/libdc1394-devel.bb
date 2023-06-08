SUMMARY = "Development libraries and header files for dc1394"
DESCRIPTION = "This package contains the header files and libraries for building \
programs using the dc1394 library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.6"

RPM_NAME = "libdc1394-devel-2.2.6-3.13.aarch64.rpm"
RPM_HASH = "2d4b3ec456050738bd81af619306ae77154c8a9ef613bfd485b5744b8bb8f0c1adfcc128812835cd5260934f25a8258142530514ba6b54422f2cf479e3ec0bdf"

RPROVIDES:${PN} += "libdc1394-devel libdc1394-devel(aarch-64) pkgconfig(libdc1394-2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdc1394-25 libdc1394-tools pkgconfig(libraw1394)"

inherit rpm
