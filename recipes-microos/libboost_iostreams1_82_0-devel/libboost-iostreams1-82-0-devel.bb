SUMMARY = "Development headers for Boost.IOStreans library"
DESCRIPTION = "Boost.IOStreams provides a framework for defining streams, stream \
buffers and IO filters"
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_iostreams1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "8afea135b47a5bf67b72e7a133a251ab64232e401c11dd01bf7d9f60165d90ea5168cffc37b2ee17e775492a72298875d33233ff0b26e45ba4eb5ec6e33fbbc9"

RPROVIDES:${PN} += "libboost_iostreams-devel-impl \
libboost_iostreams1_82_0-devel \
libboost_iostreams1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel \
libboost_iostreams1_82_0 \
pkgconfig(bzip2) \
pkgconfig(liblzma) \
pkgconfig(libzstd) \
pkgconfig(zlib)"

inherit rpm
