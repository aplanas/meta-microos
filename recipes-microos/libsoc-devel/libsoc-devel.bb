SUMMARY = "Development files for libsoc"
DESCRIPTION = "libsoc is a C library to interface with common peripherals found in System \
on Chips (SoC) through generic Linux Kernel interfaces. \
 \
This package contains development files for libsoc."
LICENSE = "LGPL-2.1-only"

PV = "0.8.2"

RPM_NAME = "libsoc-devel-0.8.2-3.13.aarch64.rpm"
RPM_HASH = "6e445dbc6f974f1baf79e14eb5e6a43e487c416c90a29af651b4ae4922b2d3ce148aa53bb64eb84c3c00647751c907890a1c840efd8d5016d3d51595841eea33"

RPROVIDES:${PN} += "libsoc-devel \
libsoc-devel(aarch-64) \
pkgconfig(libsoc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsoc2"

inherit rpm
