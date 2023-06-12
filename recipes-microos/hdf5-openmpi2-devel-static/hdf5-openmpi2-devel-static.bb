SUMMARY = "Static development files for hdf5-openmpi2"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the openmpi2 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi2-devel-static-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "d764581b4f9dc6fa4a50d270cdb004d2817ccbbc2c710b666c4ea099e004c23141846e8964c3b43870e65a337de72b1f6148b1441fa181bd2b2bdfd6007d98f6"

RPROVIDES:${PN} += "hdf5-openmpi2-devel-static \
hdf5-openmpi2-devel-static(aarch-64)"
RDEPENDS:${PN} += "hdf5-openmpi2-devel"

inherit rpm
