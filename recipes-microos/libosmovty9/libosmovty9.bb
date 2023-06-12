SUMMARY = "Osmocom VTY interface library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmovty library implements the interactive command-line on the \
VTY (Virtual TTY), as well as configuration file parsing."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmovty9-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "efd570a435f16ae451a5c3edddbf894ddff20344fbc70bb696c54015511e51cdcb5d148f118b8fad7bffecf1659570bba751889e7bdae6217c3ee1114422f70d"

RPROVIDES:${PN} += "libosmovty.so.9()(64bit) \
libosmovty9 \
libosmovty9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libosmocore.so.20()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
