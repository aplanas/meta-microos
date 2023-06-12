SUMMARY = "Module files for hdf5_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi1-hpc-module-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "5e5ab71a35dfc4aa251017488eeae4649c1535e0a7ef836ffc03332c97fb14476bb7fdcc0b165720e9a466fc7dc1de01f85860923dbef80153677bc9ccfc6f65"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-openmpi1-hpc-module \
hdf5_1_12_2-gnu-openmpi1-hpc-module(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
lua-lmod"

inherit rpm
