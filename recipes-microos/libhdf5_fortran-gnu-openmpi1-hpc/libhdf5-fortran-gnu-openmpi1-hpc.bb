SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-openmpi1-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-openmpi1-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "bb534a253f14351fc674c72b052836337b224d2ae9ee18605ce878d9f08194740c13618159ecd806386698c8705f00f63c543dccd1a32d5f909fd5952bc3b539"

RPROVIDES:${PN} += "libhdf5_fortran-gnu-openmpi1-hpc \
libhdf5_fortran-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_fortran_1_12_2-gnu-openmpi1-hpc"

inherit rpm
