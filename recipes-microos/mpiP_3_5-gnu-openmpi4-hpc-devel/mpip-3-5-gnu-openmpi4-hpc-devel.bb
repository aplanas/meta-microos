SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi4-hpc-devel-3.5-3.2.aarch64.rpm"
RPM_HASH = "bc025cda4a8fbb59a622ce348df8806c672afd63fd0309967add73ea0cc0d75b1a845551068853e3f407bec51b7523d7aa5f8f242581eab71b2b7c3d7b1bbf70"

RPROVIDES:${PN} += "mpiP_3_5-gnu-openmpi4-hpc-devel mpiP_3_5-gnu-openmpi4-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel openmpi4-gnu-hpc-devel"

inherit rpm
