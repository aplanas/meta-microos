SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi4-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi4-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi4-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi4-hpc-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "dbb93b4600a0e89c3eddb99495cee08475bb69219f006ae4dd92c23528328b04484687fc768e9c0a6cda5369c184db3e6e258323cfadd9bf67604d5a58bbea0a"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi4-hpc libHYPRE-gnu-openmpi4-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libHYPRE_2_20_0-gnu-openmpi4-hpc"

inherit rpm
