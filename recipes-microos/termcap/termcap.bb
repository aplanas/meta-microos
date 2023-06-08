SUMMARY = "The Termcap Library"
DESCRIPTION = "The termcap library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.8"

RPM_NAME = "termcap-2.0.8-1047.14.aarch64.rpm"
RPM_HASH = "f561490274641f522b0298dcb628969cf6d3bfa6de39f821f7202c7ee5d8f9ddf0ac71846d79c9112fd1cc66a63459adecf4380c3f54ec26ee6d66143c8ddb69"

RPROVIDES:${PN} += "libcurses.so.1()(64bit) libtermcap.so.2()(64bit) termcap termcap(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
