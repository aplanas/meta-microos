SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_1_10_7-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-macros-devel-1.10.7-7.5.noarch.rpm"
RPM_HASH = "2d1e2f808d40524df2c0f862476e2baf59c9178b738896d4673cdb63fe03624f8e347c6da5048269dae69ab92372b18bfaf42600629f16d9844080533fcff25c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi1-gnu-hpc-macros-devel"
RDEPENDS:${PN} += "openmpi_1_10_7-gnu-hpc-macros-devel"

inherit rpm
