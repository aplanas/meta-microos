SUMMARY = "Examples for hdf5"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides examples of HDF5 library use."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-examples-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "00555d4051f504ca65d7e2b6a7e0d2bf5acfe9e650eb3f1c564420585ffcb194617672108d6104d15aca866ffebb8b5f15d723749e082a2644616bcd963c6577"

RPROVIDES:${PN} += "hdf5-examples hdf5-examples(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
