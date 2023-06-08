SUMMARY = "Development files for openlibm"
DESCRIPTION = "OpenLibm is an implementation of a standalone C mathematical library \
(libm). It can be used standalone in applications and programming \
language implementations. \
 \
This package provides libraries and header files for developing applications \
that use OpenLIBM."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8.1"

RPM_NAME = "openlibm-devel-0.8.1-1.3.aarch64.rpm"
RPM_HASH = "30d58b103dbe0b32843b18214c60d5a900affe7e1f96c6d470da30447274e9ba7c99f71d92aa86d8174c239f12f756571035767a011735192973a2f25f5caf30"

RPROVIDES:${PN} += "openlibm-devel openlibm-devel(aarch-64) pkgconfig(openlibm)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopenlibm4"

inherit rpm
