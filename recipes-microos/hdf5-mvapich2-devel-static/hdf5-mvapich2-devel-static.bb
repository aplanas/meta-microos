SUMMARY = "Static development files for hdf5-mvapich2"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the mvapich2 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-mvapich2-devel-static-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "8a862dba990b899d903749457977f627538f8961c5b597d5a6c50da6c341a096a20b498de866c8ca9437c6e5a3a2b3e98db2fcaa3924b2b48ff36e14ef8e24ba"

RPROVIDES:${PN} += "hdf5-mvapich2-devel-static \
hdf5-mvapich2-devel-static(aarch-64)"
RDEPENDS:${PN} += "hdf5-mvapich2-devel"

inherit rpm
