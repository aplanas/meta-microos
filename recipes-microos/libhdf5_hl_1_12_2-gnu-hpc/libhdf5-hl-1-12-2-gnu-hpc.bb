SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_1_12_2-gnu-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "494091269035e8bcc358c1c787d12e6818afa59111c33d466d5df4d35f4c78bd0f108ce7238ef0036acc8b79678faf147d409ea00bb1ecd629ec31a2fc4ab1c1"

RPROVIDES:${PN} += "libhdf5_hl_1_12_2-gnu-hpc \
libhdf5_hl_1_12_2-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
