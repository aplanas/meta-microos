SUMMARY = "Graphical class browser for Xt"
DESCRIPTION = "viewres displays a tree showing the widget class hierarchy of the \
Athena Widget Set (libXaw)."
LICENSE = "X11"

PV = "1.0.7"

RPM_NAME = "viewres-1.0.7-1.2.aarch64.rpm"
RPM_HASH = "986b1d42d726786292a01d893ac77022dcb42fbb559cf950adffa8cfa58247090e41f7877553afe9bc05e2b1b2e05263269045d8b7d0b1b268b574a20ee9fd61"

RPROVIDES:${PN} += "viewres viewres(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXmu.so.6()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
