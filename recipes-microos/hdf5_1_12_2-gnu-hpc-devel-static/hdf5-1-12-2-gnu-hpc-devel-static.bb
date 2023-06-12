SUMMARY = "Static development files for hdf5_1_12_2-gnu-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-hpc-devel-static-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "8368d3922c59fdc38043b8ac7ec8720a3870459031fa466a4e4ce672d9d696b5912c54b06d9ea2716aab9b0b1c0732dc44be4b70e51557c91a041e284c6d0599"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-hpc-devel-static \
hdf5_1_12_2-gnu-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "hdf5_1_12_2-gnu-hpc-devel"

inherit rpm
