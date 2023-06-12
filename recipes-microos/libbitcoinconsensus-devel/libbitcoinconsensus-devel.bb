SUMMARY = "Developmont files for bitcoin consensus library"
DESCRIPTION = "The purpose of this library is to make the verification functionality that \
is critical to Bitcoin’s consensus available to other applications, \
e.g. to language bindings such as python-bitcoinlib or alternative node \
implementations. \
 \
This package contains development files."
LICENSE = "MIT"

PV = "25.0"

RPM_NAME = "libbitcoinconsensus-devel-25.0-1.1.aarch64.rpm"
RPM_HASH = "1a3c31c91a34de80d2a52fe5981cde721a7ad7613b87473a6c05f15c18f6ae80a468172a0681436cb978ed919df35c5032f81d1f5e2b4dffb18ef43b1b67b8eb"

RPROVIDES:${PN} += "libbitcoinconsensus-devel \
libbitcoinconsensus-devel(aarch-64) \
pkgconfig(libbitcoinconsensus)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbitcoinconsensus0"

inherit rpm
