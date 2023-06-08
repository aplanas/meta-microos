SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi4-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "2618713494d3875e042b40bb446f3a996a1f3dda66de7e2fab2c9893f7bc4b662fad62976b9cf14205b9c6a8c0d1c7d50e288985e9209f5c789b82afc64d81f4"

RPROVIDES:${PN} += "ptscotch-openmpi4-devel ptscotch-openmpi4-devel(aarch-64)"
RDEPENDS:${PN} += "gcc-fortran libptscotch0-openmpi4 openmpi4-devel scotch-devel"

inherit rpm
