SUMMARY = "X Font Service client library"
DESCRIPTION = "This library is used by clients of X Font Servers (xfs), such as \
xfsinfo, xfslsfonts, and the X servers themselves."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libFS6-1.0.9-1.2.aarch64.rpm"
RPM_HASH = "31f058a06db98cb184b303e7214f1ed09e3594ec7c3580589b866242b4fd50a69e4d83f79ce84b406f0a2e27fe0c67a50d90cdfb66a82f75aae6d09e671aae31"

RPROVIDES:${PN} += "libFS.so.6()(64bit) libFS6 libFS6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.26)(64bit)"

inherit rpm
