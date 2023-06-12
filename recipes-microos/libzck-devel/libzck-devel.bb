SUMMARY = "Headers for building against zchunk"
DESCRIPTION = "zchunk is a compressed file format that splits the file into independent \
chunks.  This allows you to only download the differences when downloading a \
new version of the file, and also makes zchunk files efficient over rsync. \
zchunk files are protected with strong checksums to verify that the file you \
downloaded is in fact the file you wanted. \
 \
This package contains the headers necessary for building against the zchunk \
library, libzck."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.3.0"

RPM_NAME = "libzck-devel-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "b4d7d7876bb19634fea589da6fa4963ee5fca5e21039464f067406fa0fcecbaa65bf26ada3006a6cd6ea6cafd83b8722c6f78c0ce56ef215a83fa123e9f2e25f"

RPROVIDES:${PN} += "libzck-devel \
libzck-devel(aarch-64) \
pkgconfig(zck) \
zchunk-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzck1 \
pkgconfig(libzstd) \
pkgconfig(openssl)"

inherit rpm
