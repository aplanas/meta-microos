SUMMARY = "Development files for matio"
DESCRIPTION = "matio is an open-source library for reading and writing MATLAB MAT files. \
This library is designed for use by programs/libraries that do not have \
access or do not want to rely on MATLAB's shared library."
LICENSE = "BSD-2-Clause"

PV = "1.5.23"

RPM_NAME = "libmatio-devel-1.5.23-2.2.aarch64.rpm"
RPM_HASH = "7b199f9176f9882720ac1327efde6ea1c1acc6046bb0745c21c2613e072f77363d8ab95dc1268703f61a1c9e3047cd6af13a00e0f984d583da171149bec6b11f"

RPROVIDES:${PN} += "libmatio-devel libmatio-devel(aarch-64) pkgconfig(matio)"
RDEPENDS:${PN} += "/usr/bin/pkg-config hdf5-devel libmatio11 pkgconfig zlib-devel"

inherit rpm
