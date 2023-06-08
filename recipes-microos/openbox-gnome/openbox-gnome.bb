SUMMARY = "Openbox GNOME integration"
DESCRIPTION = "This package provides openbox GNOME integration and tools"
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "openbox-gnome-3.6.1-3.31.aarch64.rpm"
RPM_HASH = "834a2d9b1d39d89cd5e4443fe5aeacf47bd1d3d0644eb224ad6fa55b344ab5b623793d9b3f336e33c908f94bfa169bf9f0948b03e8f2a42dc49aa85913bff961"

RPROVIDES:${PN} += "openbox-gnome openbox-gnome(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXau.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) openbox"

inherit rpm
