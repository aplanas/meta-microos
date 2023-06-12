SUMMARY = "Static development files for hdf5_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-openmpi-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi1-hpc-devel-static-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "5f607aa78b282c1ffade2799b6877ff2022e03adaeec7d0ca0e10417e45ebb0c0f7e063337f10c95bc151c107d1acdcbed61af11f36bb2c1689222e02a553a9b"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-openmpi1-hpc-devel-static \
hdf5_1_12_2-gnu-openmpi1-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "hdf5_1_12_2-gnu-openmpi1-hpc-devel"

inherit rpm
