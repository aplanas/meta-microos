SUMMARY = "C Library API to the Flickr Web Service"
DESCRIPTION = "Flickcurl is a C library for calling the Flickr Web service API. It handles the \
API signing, token management, and parameter encoding and decoding, resulting \
in C functions for the Web services APIs. It... uses libcurl to call the REST \
Web service, and libxml2 to manipulate the XML responses. The library supports \
reading photo, tag, and comments information, the photo upload and searching \
APIs, and writing tags and comments. It provides utilities such as 'flickcurl' \
to exercise the API and 'flickrdf' to get RDF metadata descriptions out of \
photos, tags, and machine tags."
LICENSE = "LGPL-2.1"

PV = "1.26"

RPM_NAME = "libflickcurl0-1.26-3.24.aarch64.rpm"
RPM_HASH = "79e133ee78883d3a2ba6a1d6791ab072db968583a6294fe127e18e3bc8bb1a902dbd96e228ed7dd43a81358ba170c2f78ba486e185194a9b3e5ac314f9c6b115"

RPROVIDES:${PN} += "libflickcurl.so.0()(64bit) libflickcurl0 libflickcurl0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcurl.so.4()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.23)(64bit) libxml2.so.2(LIBXML2_2.6.8)(64bit)"

inherit rpm
