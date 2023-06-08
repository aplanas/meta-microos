SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi2-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi2-hpc-1.12.2-5.2.noarch.rpm"
RPM_HASH = "338579ea78eedc3a3f1b1cc87b572bd4aa9584790552aa8742749cbe2db37bed25c4e44a98e460689f80ef1a6bfe6b4902c29fa0735dae15d9e91f22b6ec9d1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi2-hpc"
RDEPENDS:${PN} += "hdf5_1_12_2-gnu-openmpi2-hpc"

inherit rpm
