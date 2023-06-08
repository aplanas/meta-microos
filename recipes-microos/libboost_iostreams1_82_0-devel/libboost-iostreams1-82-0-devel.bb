SUMMARY = "Development headers for Boost.IOStreans library"
DESCRIPTION = "Boost.IOStreams provides a framework for defining streams, stream \
buffers and IO filters"
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_iostreams1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "8b64c5f4e4d96deb4a38bb7f44f6ef2c9baf355842d8a0a4c1dd521227a8ec3f61a4606a7f2b3b8f6eb1e443a81d1a7819d2f3d7f4a27b4a23751f893cb4eb1a"

RPROVIDES:${PN} += "libboost_iostreams-devel-impl libboost_iostreams1_82_0-devel libboost_iostreams1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel libboost_iostreams1_82_0 pkgconfig(bzip2) pkgconfig(liblzma) pkgconfig(libzstd) pkgconfig(zlib)"

inherit rpm
