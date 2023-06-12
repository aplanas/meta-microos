SUMMARY = "Development files for the CVT library"
DESCRIPTION = "libxcvt is a library providing a standalone version of the X server \
implementation of the VESA Coordinated Video Timings (CVT) standard \
timing modelines generator. \
 \
This package contains the development headers for the library found \
in libxcvt0."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "libxcvt-devel-0.1.2-1.3.aarch64.rpm"
RPM_HASH = "784e87192d751f0c54a3f36d275db07f936596b28731e1d290fe6978d73f1b0a1751c564d0321c7dd765ad576c84017c7b870eda23c96df53e171a881b57b397"

RPROVIDES:${PN} += "libxcvt-devel \
libxcvt-devel(aarch-64) \
pkgconfig(libxcvt)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcvt0"

inherit rpm
