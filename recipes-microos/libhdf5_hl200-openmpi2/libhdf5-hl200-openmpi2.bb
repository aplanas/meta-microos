SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi2 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl200-openmpi2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "c8f29ede0576e9bc40ba0200c5fd169bd663f5c2a3269d5678bce12f075b00dd0b4950f010f337187f5a41170cfa7a0375ec05fb2c5df98749d89469de826438"

RPROVIDES:${PN} += "libhdf5_hl-openmpi2 \
libhdf5_hl.so.200()(64bit) \
libhdf5_hl200-openmpi2 \
libhdf5_hl200-openmpi2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhdf5.so.200()(64bit)"

inherit rpm
