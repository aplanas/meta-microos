SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mpich-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran_1_12_2-gnu-mpich-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "7e7721d28b3ffd88126d48edc6e5865e56c8b79723a0311c0a8394fd83f0d8428b44a72fe4b6307290aede7bf55808697d5a491a5854827cb7d540c06be8dbf9"

RPROVIDES:${PN} += "libhdf5hl_fortran_1_12_2-gnu-mpich-hpc libhdf5hl_fortran_1_12_2-gnu-mpich-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig hdf5_1_12_2-gnu-mpich-hpc-module ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit)"

inherit rpm
