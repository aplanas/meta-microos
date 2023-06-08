SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi2-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_1_12_2-gnu-openmpi2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "1cc15eb6d1394dcc71b416c23ba5c2aa40372ec180c2cb83967c5e9d55c0900df63c854d2f9de653fb18194eddb86f13a319f4d858db5bc5767448a8544f5987"

RPROVIDES:${PN} += "libhdf5_1_12_2-gnu-openmpi2-hpc libhdf5_1_12_2-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig hdf5_1_12_2-gnu-openmpi2-hpc-module ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libz.so.1()(64bit)"

inherit rpm
