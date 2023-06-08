SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi1-hpc-devel-static-3.5-3.3.aarch64.rpm"
RPM_HASH = "509beeb9726fe2750b78d1cf757e435d6bd105b0244cdefd98fa273de7a0b98c95e7c78add37ff6806e5a70b185e21ae302130cd91fbd244acaef86b952da5d3"

RPROVIDES:${PN} += "mpiP_3_5-gnu-openmpi1-hpc-devel-static mpiP_3_5-gnu-openmpi1-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel openmpi1-gnu-hpc-devel"

inherit rpm
