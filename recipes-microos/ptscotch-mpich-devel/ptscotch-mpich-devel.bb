SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-mpich-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "257f2f81e00dfc9411123e7109af28a2063567df975e93764ca76342b7d587621ea47e4e2abe088ddeadf92d7e407175179da04773282393e4319e573ccc61c1"

RPROVIDES:${PN} += "ptscotch-mpich-devel ptscotch-mpich-devel(aarch-64)"
RDEPENDS:${PN} += "gcc-fortran libptscotch0-mpich mpich-devel scotch-devel"

inherit rpm
