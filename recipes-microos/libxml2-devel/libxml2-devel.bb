SUMMARY = "Development files for libxml2, an XML manipulation library"
DESCRIPTION = "The XML C library can load and save extensible data structures \
or manipulate any kind of XML files. \
 \
This subpackage contains header files for developing \
applications that want to make use of libxml."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "libxml2-devel-2.10.4-2.1.aarch64.rpm"
RPM_HASH = "06be27a84b0d7be88e68749e58ab8a42f626099e4e62b44c785eab9aecc0267460780f84367e6df7818bbef69130d4bfd618ca578c33cb24bb86c4266f4f449d"

RPROVIDES:${PN} += "libxml2-devel \
libxml2-devel(aarch-64) \
pkgconfig(libxml-2.0)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
glibc-devel \
libxml2 \
libxml2-2 \
libxml2-tools \
pkgconfig(liblzma) \
pkgconfig(zlib) \
readline-devel \
xz-devel"

inherit rpm
