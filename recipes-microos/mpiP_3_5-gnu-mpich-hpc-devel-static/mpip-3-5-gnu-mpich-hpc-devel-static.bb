SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-mpich-hpc-devel-static-3.5-3.3.aarch64.rpm"
RPM_HASH = "5f5566abfeabc6181de85cf53d1e26e5795a65e222cecc49d7c5b35250894bc5e4181773859eaa8d4c10ff87fed64c3578a4cff8d103499423bdfdd7bc9e59ee"

RPROVIDES:${PN} += "mpiP_3_5-gnu-mpich-hpc-devel-static mpiP_3_5-gnu-mpich-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel mpich-gnu-hpc-devel"

inherit rpm
