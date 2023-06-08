SUMMARY = "PETsc SAWs infrastructure"
DESCRIPTION = "This package contains the files to interface with SAWs \
(Scientific Application Web server). SAWs itself is not \
yet supported by openSUSE."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi1-hpc-saws-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "b7f539a6ad2541fb9c0726b20faca686f7149129361f733216ae025c3e0447749c54776a283896bd13a29ef517cdc2e7a64dbdff5c34caedc3ff81b54c231c3b"

RPROVIDES:${PN} += "petsc_3_18_5-gnu-openmpi1-hpc-saws petsc_3_18_5-gnu-openmpi1-hpc-saws(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/python3 libpetsc_3_18_5-gnu-openmpi1-hpc"

inherit rpm
