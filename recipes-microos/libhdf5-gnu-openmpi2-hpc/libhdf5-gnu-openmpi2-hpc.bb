SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-openmpi2-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-openmpi2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "d4835741d617f9f1f937110afad54d866cc0a05f49e19a284a2e373c4d535b7a7f79e286debce9e22cb6390eb03fcf16bc5eae6781c5e4e525aca7867ee81547"

RPROVIDES:${PN} += "libhdf5-gnu-openmpi2-hpc \
libhdf5-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_1_12_2-gnu-openmpi2-hpc"

inherit rpm
