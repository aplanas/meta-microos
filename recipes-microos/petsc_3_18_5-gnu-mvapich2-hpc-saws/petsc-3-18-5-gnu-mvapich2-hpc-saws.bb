SUMMARY = "PETsc SAWs infrastructure"
DESCRIPTION = "This package contains the files to interface with SAWs \
(Scientific Application Web server). SAWs itself is not \
yet supported by openSUSE."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-mvapich2-hpc-saws-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "d127e29fcfe0c86093703f48925f6d1493dfe256ccc215e1ed6d39ee961df2613ccfa22d3bc5de495d313e57ed50a8e54055c59a983eee9d0adfbdf489166aaf"

RPROVIDES:${PN} += "petsc_3_18_5-gnu-mvapich2-hpc-saws \
petsc_3_18_5-gnu-mvapich2-hpc-saws(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
libpetsc_3_18_5-gnu-mvapich2-hpc"

inherit rpm
