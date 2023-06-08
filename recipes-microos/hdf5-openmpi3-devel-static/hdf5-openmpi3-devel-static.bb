SUMMARY = "Static development files for hdf5-openmpi3"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the openmpi3 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi3-devel-static-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "8445d25a6fb929056af99895d6c0d2d32ed5f9f3c89f4d86afe0a3803cfbf40906c4978f04ca3f7df6e49e5a0a53febace252621bec23e6c6906e4316a69dd6e"

RPROVIDES:${PN} += "hdf5-openmpi3-devel-static hdf5-openmpi3-devel-static(aarch-64)"
RDEPENDS:${PN} += "hdf5-openmpi3-devel"

inherit rpm
