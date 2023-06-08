SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi2-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran_1_12_2-gnu-openmpi2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "933c77840634c59683754ea311b77e16940bdbc3f7748b9b45efb21e577bea3ac06eeb68f43dfad5d8ac8a3e55e565ab88f3701e8153b7c2d0355586213c1ee0"

RPROVIDES:${PN} += "libhdf5hl_fortran_1_12_2-gnu-openmpi2-hpc libhdf5hl_fortran_1_12_2-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig hdf5_1_12_2-gnu-openmpi2-hpc-module ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit)"

inherit rpm
