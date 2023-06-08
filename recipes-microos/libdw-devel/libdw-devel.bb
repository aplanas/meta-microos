SUMMARY = "Development files for libdw"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libdw."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdw-devel-0.189-2.3.aarch64.rpm"
RPM_HASH = "b4823370d1a57d8c985eb58333a86fc565c0fe7d687ceaf738ecabc71bdaa2f26c18c25b613aca83555fbef6e6eeaab919be6f0354261305c6431f88d768a492"

RPROVIDES:${PN} += "libdw-devel libdw-devel(aarch-64) pkgconfig(libdw)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libdw1 libelf-devel pkgconfig(libelf) pkgconfig(liblzma) pkgconfig(libzstd) pkgconfig(zlib)"

inherit rpm
