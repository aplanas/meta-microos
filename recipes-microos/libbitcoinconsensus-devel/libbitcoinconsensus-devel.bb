SUMMARY = "Developmont files for bitcoin consensus library"
DESCRIPTION = "The purpose of this library is to make the verification functionality that \
is critical to Bitcoin’s consensus available to other applications, \
e.g. to language bindings such as python-bitcoinlib or alternative node \
implementations. \
 \
This package contains development files."
LICENSE = "MIT"

PV = "24.0.1"

RPM_NAME = "libbitcoinconsensus-devel-24.0.1-2.1.aarch64.rpm"
RPM_HASH = "89ba30512f99b1c81a33ebfb1d66ff374ef9c145e79c06934a03295c87f53d5d6fc4c0a9b140e7f53d96696e78d78a99290af538db2dc1e074c3b3c847443e9e"

RPROVIDES:${PN} += "libbitcoinconsensus-devel libbitcoinconsensus-devel(aarch-64) pkgconfig(libbitcoinconsensus)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbitcoinconsensus0"

inherit rpm
