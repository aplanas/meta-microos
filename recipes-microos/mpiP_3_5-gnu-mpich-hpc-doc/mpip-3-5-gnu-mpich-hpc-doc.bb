SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-mpich-hpc-doc-3.5-3.3.aarch64.rpm"
RPM_HASH = "dc177fb4e2db9f86f2867e09e9f814620b28bd1f0430e943be74b2580aed5c9711ba1c962a82f2942c1e97a770de7792fe5fd933c83f912d5b175acee4da7b77"

RPROVIDES:${PN} += "mpiP_3_5-gnu-mpich-hpc-doc \
mpiP_3_5-gnu-mpich-hpc-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
