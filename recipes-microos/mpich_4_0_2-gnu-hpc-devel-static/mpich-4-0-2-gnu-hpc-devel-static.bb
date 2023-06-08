SUMMARY = "Static libraries for MPICH HPC version 4.0.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains the static library files, which are packaged separately from \
the dynamic library and headers."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich_4_0_2-gnu-hpc-devel-static-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "061e9968dd467510f079edc591b3bd57edd1069daaa1087356fe62f5e672321415bf0e381879daf28089ff50ccff12b7a21ae7c08508ad4665d0240ff12ae21a"

RPROVIDES:${PN} += "mpich_4_0_2-gnu-hpc-devel-static mpich_4_0_2-gnu-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "mpich_4_0_2-gnu-hpc-devel"

inherit rpm
