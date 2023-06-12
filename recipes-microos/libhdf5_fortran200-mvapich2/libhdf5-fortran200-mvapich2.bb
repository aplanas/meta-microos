SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran200-mvapich2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "d69c94997283c2a6db9df7645cd40c5c82a3172ab502404930a21354dbdf1c74dfab4593f2745c749507b3454fc525691627126fff5c6c75b74ff0511f182a59"

RPROVIDES:${PN} += "libhdf5_fortran-mvapich2 \
libhdf5_fortran.so.200()(64bit) \
libhdf5_fortran200-mvapich2 \
libhdf5_fortran200-mvapich2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libhdf5.so.200()(64bit) \
libmpi.so.12()(64bit)"

inherit rpm
