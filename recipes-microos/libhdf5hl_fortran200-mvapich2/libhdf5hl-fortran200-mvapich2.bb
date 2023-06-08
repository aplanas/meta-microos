SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran200-mvapich2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "506df5e3f527efc3d5585959c20b95cf7e99ef35459ddd290b7fc8ccd0bcc32d624b2dcf7bb38ccbd7b0d8df8c05aba0aed2f882a6a54ccefc255fb2b4e48f1b"

RPROVIDES:${PN} += "libhdf5hl_fortran-mvapich2 libhdf5hl_fortran.so.200()(64bit) libhdf5hl_fortran200-mvapich2 libhdf5hl_fortran200-mvapich2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libhdf5.so.200()(64bit) libhdf5_fortran.so.200()(64bit) libhdf5_hl.so.200()(64bit) libmpi.so.12()(64bit)"

inherit rpm
