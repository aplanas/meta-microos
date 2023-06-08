SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_1_12_2-gnu-openmpi1-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "27375b834466a43c3ba873161a807eb1cc92520689815c4dbbf6b87d1c50eccbf2c0dc5675d23343606a73b423b014a9a17e7f7afc2c5dff52d5925ee1c12606"

RPROVIDES:${PN} += "libhdf5_hl_1_12_2-gnu-openmpi1-hpc libhdf5_hl_1_12_2-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig hdf5_1_12_2-gnu-openmpi1-hpc-module ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
