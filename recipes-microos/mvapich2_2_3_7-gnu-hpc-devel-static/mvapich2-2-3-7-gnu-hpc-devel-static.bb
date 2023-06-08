SUMMARY = "OSU MVAPICH2 MPI package - static libraries"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-devel-static-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "29128b49de4172192697cbb236e8722862959e3d3b1136781b5315b3417b54ff64e16675d4194956e554c23e89308c5a0497630a8fc7e0a0235db4e8767cdcec"

RPROVIDES:${PN} += "mvapich2_2_3_7-gnu-hpc-devel-static mvapich2_2_3_7-gnu-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "mvapich2_2_3_7-gnu-hpc-devel"

inherit rpm
