SUMMARY = "Utilities for Data Conversions from hdf5"
DESCRIPTION = "h5utils is a set of utilities for visualization and conversion of \
scientific data in the HDF5 format."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.13.2"

RPM_NAME = "h5utils-1.13.2-1.2.aarch64.rpm"
RPM_HASH = "afaa81719ca1bfd43283041149e4fc431ac6fc04b9b9d8cc03799500216c3aa071c4bc0faeebe0ca4622e634ce2439e1ca836e60225d589c50a9c170106a4d13"

RPROVIDES:${PN} += "h5utils \
h5utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhdf5.so.200()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
meep"

inherit rpm
