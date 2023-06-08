SUMMARY = "Yet Another Screen Library (lib(n)curses alternative)"
DESCRIPTION = "yascreen is a lib(n)curses alternative, oriented towards modern terminals."
LICENSE = "LGPL-3.0-or-later"

PV = "1.97"

RPM_NAME = "libyascreen0-1.97-1.3.aarch64.rpm"
RPM_HASH = "9395a1191bc333e51e00d941dfc553ee274578bc43f50f22a4d19cbf7e71b91215e0a768d0a5bff45336ff89b4d63876ed7e19984bec96b21d71038e9f7cd151"

RPROVIDES:${PN} += "libyascreen.so.0()(64bit) libyascreen.so.0(YASCREEN_1.79)(64bit) libyascreen.so.0(YASCREEN_1.83)(64bit) libyascreen.so.0(YASCREEN_1.93)(64bit) libyascreen.so.0(YASCREEN_1.97)(64bit) libyascreen0 libyascreen0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
