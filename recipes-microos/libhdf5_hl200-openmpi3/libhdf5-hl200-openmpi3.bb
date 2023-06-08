SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi3 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl200-openmpi3-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "54bb9fa8ac3e25e3060126b1ed4a21b7b1ad643e5f3ab2b74f6240f99423581c28fa44a4e4a11d78eeb81afad7be1ba17881831044c975f4b74a33b994826970"

RPROVIDES:${PN} += "libhdf5_hl-openmpi3 libhdf5_hl.so.200()(64bit) libhdf5_hl200-openmpi3 libhdf5_hl200-openmpi3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libhdf5.so.200()(64bit)"

inherit rpm
