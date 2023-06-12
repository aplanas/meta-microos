SUMMARY = "OSU MVAPICH2 MPI package - static libraries"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-devel-static-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "eee51c0c113d1a12d61f6ce4ee274834fad91e0d74ed99e8105c389c7850ad9d42222a2740b79d82f8184ccde4cc733b447067f978a18cb97935baf35b0af9a4"

RPROVIDES:${PN} += "mvapich2-devel-static \
mvapich2-devel-static(aarch-64)"
RDEPENDS:${PN} += "mvapich2-devel"

inherit rpm
