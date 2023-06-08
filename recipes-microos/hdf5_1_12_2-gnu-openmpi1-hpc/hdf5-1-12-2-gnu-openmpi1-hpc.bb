SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi-hpc version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi1-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "6f56db1672bd12e1ae5c31496814e69221f95448aaa94ba4fd0208c9019f3cdc74e6bcbe9b43db31c73ddb46ebaa9d1119ea282e2b8f35beed9c17870ca19eb4"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-openmpi1-hpc hdf5_1_12_2-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libhdf5_1_12_2-gnu-openmpi1-hpc libhdf5_fortran_1_12_2-gnu-openmpi1-hpc libhdf5_hl_1_12_2-gnu-openmpi1-hpc libhdf5hl_fortran_1_12_2-gnu-openmpi1-hpc libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libopenmpi1-gnu-hpc lua-lmod"

inherit rpm
