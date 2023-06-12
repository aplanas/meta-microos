SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi1-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi1-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi1-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi1-hpc-devel-2.20.0-1.22.noarch.rpm"
RPM_HASH = "fa6a564c0e628b5fb7b57200337bf8191318622d0cf84bb1bc48ec1c927ca3887f894d93c6aa668e01d84206455f3cfd8c66ff1401a0f45026f3bd0fd96732f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi1-hpc-devel"
RDEPENDS:${PN} += "/bin/sh hypre_2_20_0-gnu-openmpi1-hpc-devel"

inherit rpm
