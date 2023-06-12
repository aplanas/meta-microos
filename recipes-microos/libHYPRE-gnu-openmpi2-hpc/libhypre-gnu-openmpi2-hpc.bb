SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-openmpi2-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-openmpi2-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-openmpi2-hpc-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "c147cae017b105ecc4da266b99f03e04456d3cdb7f513fee4da5778e8a4d4cbf7612e4b6262cc591b89f546cc0b549012c862f2731d108d8ddecec653d86c5c5"

RPROVIDES:${PN} += "libHYPRE-gnu-openmpi2-hpc libHYPRE-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libHYPRE_2_20_0-gnu-openmpi2-hpc"

inherit rpm
