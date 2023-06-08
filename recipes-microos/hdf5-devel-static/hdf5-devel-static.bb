SUMMARY = "Static development files for hdf5"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the serial version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-devel-static-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "734315d4ed6fe0ffd6d106f23aee34e6cc6512e6f0ceb74b607d575a12d88a167756b4a9a077c7edd1caa989074fc1ccac66d87296fc8981a195d11ff9b07953"

RPROVIDES:${PN} += "hdf5-devel-static hdf5-devel-static(aarch-64)"
RDEPENDS:${PN} += "hdf5-devel"

inherit rpm
