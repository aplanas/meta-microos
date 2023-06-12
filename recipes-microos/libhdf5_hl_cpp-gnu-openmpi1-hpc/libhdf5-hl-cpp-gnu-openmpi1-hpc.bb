SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-openmpi1-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-openmpi1-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "e912e23e7164b785594c7564435b93c1e1bc02545acc5cc15b468ade22955a4cd84a4f5f455eb66d51bb2320ddf45d73a397747e01b26f18373bde66e78d650d"

RPROVIDES:${PN} += "libhdf5_hl_cpp-gnu-openmpi1-hpc \
libhdf5_hl_cpp-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_hl_cpp_1_12_2-gnu-openmpi1-hpc"

inherit rpm
