SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi3-hpc version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi3-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "be367fe4c48d0de964b6d4163c2d4eccc70e77e23014b25c521234d822e6b0b3fd6749d379a107dec8856c88edc11b683b02c689e322c1c430aedb9bd0f6cdab"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-openmpi3-hpc hdf5_1_12_2-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libhdf5_1_12_2-gnu-openmpi3-hpc libhdf5_fortran_1_12_2-gnu-openmpi3-hpc libhdf5_hl_1_12_2-gnu-openmpi3-hpc libhdf5hl_fortran_1_12_2-gnu-openmpi3-hpc libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libopenmpi3-gnu-hpc lua-lmod"

inherit rpm
