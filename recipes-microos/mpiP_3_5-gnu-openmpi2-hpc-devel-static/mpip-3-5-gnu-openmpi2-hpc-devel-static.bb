SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi2-hpc-devel-static-3.5-3.3.aarch64.rpm"
RPM_HASH = "db7ccfddc0eb64e7bbf8dd88edb72db5f1e3094f05d0ad68b88dbf59420063c6eb5c199dc8f6f4028de6f9ad1a6559c95eed9acbb95f4697cf322947551d1eb9"

RPROVIDES:${PN} += "mpiP_3_5-gnu-openmpi2-hpc-devel-static mpiP_3_5-gnu-openmpi2-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel openmpi2-gnu-hpc-devel"

inherit rpm
