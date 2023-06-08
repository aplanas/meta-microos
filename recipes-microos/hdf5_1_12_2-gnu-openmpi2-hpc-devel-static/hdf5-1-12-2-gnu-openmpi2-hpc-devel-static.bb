SUMMARY = "Static development files for hdf5_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-openmpi2-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi2-hpc-devel-static-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "2e3f76846490a89ccc96d517d830f219aa0c336171c9f3e16f2b80cdee0f61c45cc83f40344bcee82500b82bdb6cceb7f370fff313769acceed70afcb665b687"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-openmpi2-hpc-devel-static hdf5_1_12_2-gnu-openmpi2-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "hdf5_1_12_2-gnu-openmpi2-hpc-devel"

inherit rpm
