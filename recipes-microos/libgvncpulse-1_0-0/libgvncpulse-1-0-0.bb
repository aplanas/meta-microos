SUMMARY = "Pulse audio bridge for VNC client connections"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package contains the Pulse audio bridge for VNC client connections."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "libgvncpulse-1_0-0-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "03cca5390165ffa15d32c06b7a7265d52b263bd654d9d7542dc1273ee3610c0699338ef74727c5187b7ec60f3e566fc3ad9955af1102c3eea5257283b0f738d0"

RPROVIDES:${PN} += "libgvncpulse-1.0.so.0()(64bit) libgvncpulse-1_0-0 libgvncpulse-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgvnc-1.0.so.0()(64bit) libpulse-simple.so.0()(64bit) libpulse-simple.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
