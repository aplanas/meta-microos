SUMMARY = "Development files for flickurl, a Flickr Web Service library"
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

RPM_NAME = "libflickcurl-devel-1.26-3.24.aarch64.rpm"
RPM_HASH = "4f8d5f7e1aade94ba881baaa1cb886c74c7766dd1583280092af6966cf8f7576d9558119570b8d25a14478099739f26a1a37bbc99143700a61c560b43f0caa0c"

RPROVIDES:${PN} += "libflickcurl-devel libflickcurl-devel(aarch-64) pkgconfig(flickcurl)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libcurl-devel libflickcurl0 libraptor-devel pkgconfig(libxml-2.0) pkgconfig(raptor2)"

inherit rpm
