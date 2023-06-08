SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-hpc version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "530a9e8b39e2af2e7101884d6bbf8d818893e9493c0adec05335eeeda6bf990369d555ac5356921c92919f8e4fc3099e00cad58d73e1341ca7f944f353dd076e"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-hpc hdf5_1_12_2-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libhdf5_1_12_2-gnu-hpc libhdf5_cpp_1_12_2-gnu-hpc libhdf5_fortran_1_12_2-gnu-hpc libhdf5_hl_1_12_2-gnu-hpc libhdf5_hl_cpp_1_12_2-gnu-hpc libhdf5hl_fortran_1_12_2-gnu-hpc lua-lmod"

inherit rpm
