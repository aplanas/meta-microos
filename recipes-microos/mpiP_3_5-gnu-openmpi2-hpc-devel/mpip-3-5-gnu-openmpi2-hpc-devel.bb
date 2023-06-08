SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi2-hpc-devel-3.5-3.3.aarch64.rpm"
RPM_HASH = "f320d6125df4fbd6a893f1aa7d776336341dc5a84e92eed6f207c5ce2ab841c6a444b7a51be2c222ed85bc96b99dfad792002bee37dc4240b9cb1163d10cc95f"

RPROVIDES:${PN} += "mpiP_3_5-gnu-openmpi2-hpc-devel mpiP_3_5-gnu-openmpi2-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel openmpi2-gnu-hpc-devel"

inherit rpm
