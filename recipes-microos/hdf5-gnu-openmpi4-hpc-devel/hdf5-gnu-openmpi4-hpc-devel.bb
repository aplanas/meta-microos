SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi4-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi4-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi4-hpc-devel-1.12.2-5.1.noarch.rpm"
RPM_HASH = "4b37e627605cf01da1c9b167f3b7f7880868853a8f26a96ce61dd6e63918f5ab22445a4ebb76f7391078594259f953dbcf17ebebb599bb919aa26218f7c18ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi4-hpc-devel"
RDEPENDS:${PN} += "hdf5_1_12_2-gnu-openmpi4-hpc-devel"

inherit rpm
