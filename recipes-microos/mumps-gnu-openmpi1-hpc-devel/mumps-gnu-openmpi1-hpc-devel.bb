SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi1-hpc-devel"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi1-hpc-devel provides the dependency to get binary package mumps_5_3_5-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi1-hpc-devel-5.3.5-3.3.noarch.rpm"
RPM_HASH = "1acdf2c6354cb64d6441bdd6912a533ed7dfd4dea9abe0e55db20e8278be9d5dc5eb6a57a77936e0aba7cfbdcfe4ee3fa7a8bdeadd756a17a945dd6b0f1cddb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi1-hpc-devel"
RDEPENDS:${PN} += "/bin/sh \
mumps_5_3_5-gnu-openmpi1-hpc-devel"

inherit rpm
