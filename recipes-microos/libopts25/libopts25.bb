SUMMARY = "Shared library libopts"
DESCRIPTION = "AutoOpts is a tool that virtually eliminates the hassle of processing \
options and keeping man pages, info docs and usage text up to date.  This \
package allows you to specify several program attributes, thousands of \
option types and many option attributes.  From this, it then produces all \
the code necessary to parse and handle the command line and configuration \
file options, and the documentation that should go with your program as \
well. \
 \
This package contains shared library libopts"
LICENSE = "GPL-3.0-or-later"

PV = "5.18.16"

RPM_NAME = "libopts25-5.18.16-7.6.aarch64.rpm"
RPM_HASH = "feff0813b9c1297a6e3d77c280d97f53c6da7159d6f8b76ccc3c2b0b92a305a5eddfd4fd7778db4af153723a6427c589d5f4330f5a56cb635fbbb99acbecea67"

RPROVIDES:${PN} += "libopts.so.25()(64bit) libopts25 libopts25(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
