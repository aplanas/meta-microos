SUMMARY = "Dependency package for mpiP_3_5-gnu-mpich-hpc-devel"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-mpich-hpc-devel provides the dependency to get binary package mpiP_3_5-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-mpich-hpc-devel-3.5-3.3.noarch.rpm"
RPM_HASH = "0c21048f47728c65f792e4e039840fa752bc2d53e2de8ef2f60cb0753a394c5cf4ccc9bf71b95b29d9fd860f49d2c1c92e9e0bdc3fc7c7b76201e975ce4b829e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-mpich-hpc-devel"
RDEPENDS:${PN} += "mpiP_3_5-gnu-mpich-hpc-devel"

inherit rpm
