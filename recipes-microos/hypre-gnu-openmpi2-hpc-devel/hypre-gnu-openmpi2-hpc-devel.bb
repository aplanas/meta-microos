SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi2-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi2-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi2-hpc-devel-2.20.0-1.21.noarch.rpm"
RPM_HASH = "48a4b7249679972fa7474efefef0afa7c5f8d381e2a07285e94a61457dfa121f317474eab63031eb17ddcfe2ff2b36064efadec6b1a8cd44d6b9d842a14815c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi2-hpc-devel"
RDEPENDS:${PN} += "/bin/sh hypre_2_20_0-gnu-openmpi2-hpc-devel"

inherit rpm
