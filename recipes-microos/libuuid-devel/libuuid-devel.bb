SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.38.1"

RPM_NAME = "libuuid-devel-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "349997c3d85d5e19a82a6bd840f6362a41e63ca19fe292cd7a53729b4afdd85bfec10340e4fc622ea305a7b67bc651d3c3679081aba1f61f8ab5e72816bf3b15"

RPROVIDES:${PN} += "libuuid-devel libuuid-devel(aarch-64) pkgconfig(uuid)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libuuid1"

inherit rpm
