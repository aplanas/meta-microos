SUMMARY = "IBus input method support for gtk2 applications"
DESCRIPTION = "This package contains ibus im module for use by gtk2."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-gtk-1.5.28-2.1.aarch64.rpm"
RPM_HASH = "a68cf937fbfcc8dd1f0df7b721fd9bfbb158fa5f0447fce24417899d16360709b06d8ba244fa0f167fb2d3b97ef01825895dbf9e1aaa76e1be0ea6b7faafc91f"

RPROVIDES:${PN} += "ibus-gtk ibus-gtk(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gtk2-tools ibus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-x11-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libibus-1.0.so.5()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
