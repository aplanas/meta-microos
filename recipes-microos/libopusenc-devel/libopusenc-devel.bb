SUMMARY = "Development package for libopusenc"
DESCRIPTION = "Files for development with libopusenc."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "libopusenc-devel-0.2.1-1.16.aarch64.rpm"
RPM_HASH = "fe772cd002ec3685ca6b0cb11f15d434e6f1c9f0bf985bba41d95d0c8f93eea138683df9e1b1b214f2f48db8631351b3768ba9d0018d3c6b27c4853da8820304"

RPROVIDES:${PN} += "libopusenc-devel libopusenc-devel(aarch-64) pkgconfig(libopusenc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopusenc0 pkgconfig(opus)"

inherit rpm
