SUMMARY = "Static development files for hdf5-openmpi4"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the openmpi4 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi4-devel-static-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "7b36a2992ed94e9bab59f89935fde5d37178020a68f1d46401eed28fd2cbac4ba9844435bbd4e99bec7ee4bfd5b219f99c17e10477236daf83610f8c3b36aad0"

RPROVIDES:${PN} += "hdf5-openmpi4-devel-static hdf5-openmpi4-devel-static(aarch-64)"
RDEPENDS:${PN} += "hdf5-openmpi4-devel"

inherit rpm
