SUMMARY = "Tcl bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "tcl-Hamlib-4.5.5-1.1.aarch64.rpm"
RPM_HASH = "c7f1641f912081b0ea6eb4cc9cbad79fdf3a7c7a5384e230a47024e2e197aec020e241abf97be85dc99a2b2642662b39b0db1b50ce9447275f1b83efb76f0c98"

RPROVIDES:${PN} += "tcl-Hamlib tcl-Hamlib(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libhamlib.so.4()(64bit) libtcl8.6.so()(64bit) tcl"

inherit rpm
