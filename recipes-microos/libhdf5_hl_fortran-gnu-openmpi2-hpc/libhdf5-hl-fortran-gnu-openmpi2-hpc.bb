SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-openmpi2-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-openmpi2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "60658ec7bf4df6945456744aba943701f4f4567baf39ab86ad6529be2c984fb3d0c7cd7889a98d966e4b12594fed0339c3390b4d4ebc720af07b566639723c40"

RPROVIDES:${PN} += "libhdf5_hl_fortran-gnu-openmpi2-hpc \
libhdf5_hl_fortran-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5hl_fortran_1_12_2-gnu-openmpi2-hpc"

inherit rpm
