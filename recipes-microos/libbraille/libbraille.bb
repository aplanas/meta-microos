SUMMARY = "Access to Braille Displays and Terminals"
DESCRIPTION = "Libbraille is a computer shared library which makes it possible to \
develop for Braille displays. It provides an API to \
write text on the display, directly draw dots, or get the value of \
keys pressed on the Braille keyboard."
LICENSE = "LGPL-2.1-only"

PV = "0.19.0"

RPM_NAME = "libbraille-0.19.0-24.9.aarch64.rpm"
RPM_HASH = "f506b0f5ebde34602501f878e2fb0a1f313dd8823fc0de291681ad222f5a02e321eb8e689b0571467f2f9dc2548f59839147d7130a90ab90710b0b2356f168eb"

RPROVIDES:${PN} += "config(libbraille) libbraille libbraille(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbraille-0.so.14()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
