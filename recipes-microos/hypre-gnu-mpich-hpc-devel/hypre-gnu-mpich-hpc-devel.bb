SUMMARY = "Dependency package for hypre_2_20_0-gnu-mpich-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-mpich-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mpich-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-mpich-hpc-devel-2.20.0-1.23.noarch.rpm"
RPM_HASH = "097ca9f5947c1eebf99cbec45e0ca1bc41b82ef842eee0b5d3ca7e777cabb626ff088addfeed6a300fef2cca0e1bdab849a4e5ca181890b2b7df54b1dc63bc09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-mpich-hpc-devel"
RDEPENDS:${PN} += "/bin/sh hypre_2_20_0-gnu-mpich-hpc-devel"

inherit rpm
