SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran200-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "5d489e4dea60b8b7db93c2b5dcfe912189a8bea31abb3318d5d98ec136e9f13b10373400088be1425555666368521a0d098df0a26df396732d5e01e77b377fe8"

RPROVIDES:${PN} += "libhdf5_fortran \
libhdf5_fortran.so.200()(64bit) \
libhdf5_fortran200 \
libhdf5_fortran200(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libhdf5.so.200()(64bit)"

inherit rpm
