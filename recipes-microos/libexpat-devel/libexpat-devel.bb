SUMMARY = "Development files for expat, an XML parser toolkit"
DESCRIPTION = "Expat is an XML parser library written in C. It is a stream-oriented \
parser in which an application registers handlers for things the \
parser might find in the XML document (like start tags). \
 \
This package contains the development headers for the library found \
in libexpat."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "libexpat-devel-2.5.0-2.3.aarch64.rpm"
RPM_HASH = "10f43af2388b7f4876b13ff9f7e2b9e8368cf0a735d1313089d2d232bd9df7eaa16cfaead2ce23160ed46dccb1f69315f55e09f47af254a145350335e8e0b7dc"

RPROVIDES:${PN} += "libexpat-devel \
libexpat-devel(aarch-64) \
pkgconfig(expat)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libexpat1"

inherit rpm
