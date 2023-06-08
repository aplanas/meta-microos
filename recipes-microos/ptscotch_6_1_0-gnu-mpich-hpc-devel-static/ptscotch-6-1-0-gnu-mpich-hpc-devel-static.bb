SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-mpich-hpc-devel-static-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "6fd36724dd2f92b2600b97db541b6e5bd50027fdcab142dc7f12545ce43440d6baa9fa73664944fe41a0a3c3c143c566df24df282a35be79693e4915116b98d0"

RPROVIDES:${PN} += "ptscotch_6_1_0-gnu-mpich-hpc-devel-static ptscotch_6_1_0-gnu-mpich-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "ptscotch_6_1_0-gnu-mpich-hpc-devel"

inherit rpm
