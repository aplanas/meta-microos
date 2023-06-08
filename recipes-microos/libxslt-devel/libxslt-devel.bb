SUMMARY = "Development files for libxslt"
DESCRIPTION = "libxslt allows you to transform XML files into other XML files \
(or HTML, text, and more) using the standard XSLT stylesheet \
transformation mechanism. \
 \
This subpackage contains the header files for developing \
applications that want to make use of the XSLT libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.37"

RPM_NAME = "libxslt-devel-1.1.37-1.3.aarch64.rpm"
RPM_HASH = "d58e97236fa0861a4cfbb3bdc11189a1a4d58ca10d9904e059fe97fdfbe10e0d367697d86950d6dcd03dfbd71107a8ff81db9937863bf6b3dd6f738c8eed9e18"

RPROVIDES:${PN} += "libxslt-devel libxslt-devel(aarch-64) pkgconfig(libexslt) pkgconfig(libxslt)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config glibc-devel libexslt0 libgcrypt-devel libxslt-tools libxslt1 pkgconfig(libxml-2.0) pkgconfig(libxslt)"

inherit rpm
