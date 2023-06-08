SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi3-hpc-devel"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi3-hpc-devel provides the dependency to get binary package mumps_5_3_5-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi3-hpc-devel-5.3.5-3.2.noarch.rpm"
RPM_HASH = "e1e480c8647a18c0c8d64d32f93a50d6b44b7dadb5c9c2270e0fa7d11cad326d00e828ad15bd303b810b20c0f24e1e0cee55b1f74b00db1dc5a6f4c6eb3d3194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi3-hpc-devel"
RDEPENDS:${PN} += "/bin/sh mumps_5_3_5-gnu-openmpi3-hpc-devel"

inherit rpm
