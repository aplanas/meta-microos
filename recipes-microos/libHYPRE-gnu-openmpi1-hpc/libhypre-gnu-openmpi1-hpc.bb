SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi1-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi1-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi1-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi1-hpc-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "08d35a364e108ca76b0147ddce2165123421d149fbded00e8a8e305298bd3ff8e6fa6b4725c1f755655d8ca17beada34d8a248701f5f13c8abe4c15865ddde28"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi1-hpc libHYPRE-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libHYPRE_2_20_0-gnu-openmpi1-hpc"

inherit rpm
