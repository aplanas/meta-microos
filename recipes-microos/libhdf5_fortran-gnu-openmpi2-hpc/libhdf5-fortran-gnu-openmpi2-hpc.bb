SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-openmpi2-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-openmpi2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "8e72b30c730a027ffba7be9fd0ca3ddd80d426e355ec7e52ca18dc2c74b654a19cd3f2b8b11b6659ad56de6b4128dbf99b4c68556aad312b48795b058df2303c"

RPROVIDES:${PN} += "libhdf5_fortran-gnu-openmpi2-hpc \
libhdf5_fortran-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_fortran_1_12_2-gnu-openmpi2-hpc"

inherit rpm
