SUMMARY = "Dependency package for hypre_2_20_0-gnu-mpich-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-mpich-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mpich-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-mpich-hpc-devel-2.20.0-1.22.noarch.rpm"
RPM_HASH = "50fd3c9b68c3fc33e07e1fffd58e621e8e5708d919466aa75b9780f018442c06f1653d603439c679d45f203bf41772681fd17065401f91834a4154e5ff17aee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-mpich-hpc-devel"
RDEPENDS:${PN} += "/bin/sh hypre_2_20_0-gnu-mpich-hpc-devel"

inherit rpm
