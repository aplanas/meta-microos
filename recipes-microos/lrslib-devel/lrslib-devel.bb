SUMMARY = "Development files for Reverse Search Vertex Enumeration"
DESCRIPTION = "lrslib is a library for the reverse search algorithm for vertex \
enumeration/convex hull problems and comes with a choice of three \
arithmetic packages. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of lrslib."
LICENSE = "GPL-2.0-or-later"

PV = "7.2"

RPM_NAME = "lrslib-devel-7.2-1.3.aarch64.rpm"
RPM_HASH = "8c3345fbe23db21485af825aa9e1a2e8d76056d8778ca22138a47854ae4763c5c5399e98bd0667939159ed10f08cdd92b39448b7085c2f719a05ea84736df7f6"

RPROVIDES:${PN} += "lrslib-devel lrslib-devel(aarch-64)"
RDEPENDS:${PN} += "liblrs1"

inherit rpm
