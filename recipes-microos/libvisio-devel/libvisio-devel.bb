SUMMARY = "Files for Developing with libvisio"
DESCRIPTION = "libvisio is a library for parsing the MS Visio file format structure. It is \
cross-platform, at the moment it can be build on Microsoft Windows and Linux. \
 \
This package contains the libvisio development files."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libvisio-devel-0.1.7-1.27.aarch64.rpm"
RPM_HASH = "7d0f45440bad6ac5292c8cd762552bfbd1d1caf99fea451d9390ca28c27ccc74be37dd418efb6e956ad8fa3ae8cd479890340a07db9dc238e13fdaea04015a03"

RPROVIDES:${PN} += "libvisio-devel libvisio-devel(aarch-64) pkgconfig(libvisio-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvisio-0_1-1 pkgconfig(icu-i18n) pkgconfig(librevenge-0.0) pkgconfig(libxml-2.0)"

inherit rpm
