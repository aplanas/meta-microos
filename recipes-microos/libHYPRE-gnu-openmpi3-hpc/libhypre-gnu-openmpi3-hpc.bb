SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi3-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi3-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi3-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi3-hpc-2.20.0-1.20.aarch64.rpm"
RPM_HASH = "450cb5a210bb969cd5b70f4cc1aac1b723ba7867b0ddbc8818847387aeb6cd756f9d2c7bd1cc26a7433e70cc351d57e5b0b4a811c4ca3a8c9552bf58824ec57d"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi3-hpc libHYPRE-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libHYPRE_2_20_0-gnu-openmpi3-hpc"

inherit rpm
