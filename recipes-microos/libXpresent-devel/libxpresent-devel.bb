SUMMARY = "Development files for the Xpresent library"
DESCRIPTION = "This package contains header files and documentation for the Xpresent library."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXpresent-devel-1.0.1-1.3.aarch64.rpm"
RPM_HASH = "020619c42d9113b0a4f440e889ab47cb0ace32f3400e7016e464b0810748da90dff44c007efc1ed7a4bc84d20a8fe2add1c4cde0d09a0b624670d5b102512eef"

RPROVIDES:${PN} += "libXpresent-devel libXpresent-devel(aarch-64) pkgconfig(xpresent)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libXpresent1 pkgconfig(presentproto) pkgconfig(x11) pkgconfig(xext) pkgconfig(xfixes) pkgconfig(xproto) pkgconfig(xrandr)"

inherit rpm
