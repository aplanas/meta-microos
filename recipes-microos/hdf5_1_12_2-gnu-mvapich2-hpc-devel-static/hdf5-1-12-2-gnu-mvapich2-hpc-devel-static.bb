SUMMARY = "Static development files for hdf5_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-mvapich2-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mvapich2-hpc-devel-static-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "9ea2cfe2eab0584e6bd0a54561f0667263b5f5259af021367c8a2cd182a5667a6189463ae42edbdc4a52892c54c978398bf79f14b8b420fa1cabcfbdec56da2f"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-mvapich2-hpc-devel-static hdf5_1_12_2-gnu-mvapich2-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "hdf5_1_12_2-gnu-mvapich2-hpc-devel"

inherit rpm
