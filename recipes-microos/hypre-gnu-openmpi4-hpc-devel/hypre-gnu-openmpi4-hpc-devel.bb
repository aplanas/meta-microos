SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi4-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi4-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi4-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi4-hpc-devel-2.20.0-1.21.noarch.rpm"
RPM_HASH = "636d9fc3d7a18ac281b961ad18aa47ef13120e43e56665ba9af0b74696af07f0e623541fbfb505cb1d192113bbf954891e137efb88eeffd633fb18c101e02114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi4-hpc-devel"
RDEPENDS:${PN} += "/bin/sh hypre_2_20_0-gnu-openmpi4-hpc-devel"

inherit rpm
