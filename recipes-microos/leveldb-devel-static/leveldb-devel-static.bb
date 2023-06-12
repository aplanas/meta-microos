SUMMARY = "Development files for statically link leveldb"
DESCRIPTION = "leveldb implements a system for maintaining a persistent key/value store. \
 \
This package holds the development files for statically linking leveldb."
LICENSE = "BSD-3-Clause"

PV = "1.23"

RPM_NAME = "leveldb-devel-static-1.23-2.3.aarch64.rpm"
RPM_HASH = "dfe0e3c5faf713f6870c818c305e8fb6a32f98c640005742e79e31ed52ae712bbdff5de6d5e78d3e342041949482623fa5f9e400cdf3d1d6d0ef47519384ac00"

RPROVIDES:${PN} += "leveldb-devel-static \
leveldb-devel-static(aarch-64)"
RDEPENDS:${PN} += "leveldb-devel"

inherit rpm
