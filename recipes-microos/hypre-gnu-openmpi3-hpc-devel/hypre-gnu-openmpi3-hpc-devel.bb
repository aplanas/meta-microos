SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi3-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi3-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi3-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi3-hpc-devel-2.20.0-1.20.noarch.rpm"
RPM_HASH = "4b6e1ccf743b0a3f929c5eccf2a042e8ead63695a58197f6a1bf8eb57e1f7f94aa049d19dc00ddde2bfde0eae617f27aff6ea786455218ce243d18e05920fdbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi3-hpc-devel"
RDEPENDS:${PN} += "/bin/sh hypre_2_20_0-gnu-openmpi3-hpc-devel"

inherit rpm
