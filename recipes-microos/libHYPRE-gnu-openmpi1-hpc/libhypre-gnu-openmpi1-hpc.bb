SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi1-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi1-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi1-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi1-hpc-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "f6760d671d60a9f68729ead2bcb95412effd7f11d252bf3c9f25ee9e53dd3a636231b4563898a033883f23cd628962beb2421a88706bd4fefe6667268cdac3df"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi1-hpc libHYPRE-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libHYPRE_2_20_0-gnu-openmpi1-hpc"

inherit rpm
