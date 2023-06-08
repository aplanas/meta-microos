SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi2-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi2-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi2-hpc-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "add388505c7a4e393d0028ac6e976e3a6fe6bc0913a89ba4da71bb5d6ddd1b055acd95cb187247c1e3cf2913dc632c32a150c918e0d7d7b6eef0a64f5b31aa49"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi2-hpc libHYPRE-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libHYPRE_2_20_0-gnu-openmpi2-hpc"

inherit rpm
