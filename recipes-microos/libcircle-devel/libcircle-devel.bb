SUMMARY = "Development headers and libraries for libcircle"
DESCRIPTION = "A simple interface for processing workloads using an automatically distributed global queue. \
 \
This package contains development headers and libraries for libcircle"
LICENSE = "BSD-3-Clause-LBNL"

PV = "0.3"

RPM_NAME = "libcircle-devel-0.3-1.9.aarch64.rpm"
RPM_HASH = "63e0b233aa3926fac784313eee61d350c4120b0bc2e5a14f258ead676a6ae8738756bcc03f0ca2d6fdc117436d4fc9fdd84bb0aa67041ddb62456b31855fb996"

RPROVIDES:${PN} += "libcircle-devel \
libcircle-devel(aarch-64) \
pkgconfig(libcircle)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcircle2"

inherit rpm
