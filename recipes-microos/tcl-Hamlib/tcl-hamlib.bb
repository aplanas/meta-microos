SUMMARY = "Tcl bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "tcl-Hamlib-4.5.5-2.1.aarch64.rpm"
RPM_HASH = "b77b275783d8ff965dca42ce443ebb7dbf85728eba9fe6e75d617081ad50b1cc86a81cd167f897cede53ea6087f5c85e26256045ebeb896f18c288bc314daa71"

RPROVIDES:${PN} += "tcl-Hamlib tcl-Hamlib(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libhamlib.so.4()(64bit) libtcl8.6.so()(64bit) tcl"

inherit rpm
