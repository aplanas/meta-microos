SUMMARY = "XFCE keyboard library for xfwm"
DESCRIPTION = "The libxfce4kbd-private library provides helper functions for xfwm4."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.4"

RPM_NAME = "libxfce4kbd-private-3-0-4.18.4-1.1.aarch64.rpm"
RPM_HASH = "677d42bd2eebddb7a70e98bbb432c89c497ff2498ff1d42fc933a4509e7350db5e75b10507e88517e61dbafef8cb3df92a5a342d9cff6e72b99c69102da6906b"

RPROVIDES:${PN} += "libxfce4kbd-private-3-0 \
libxfce4kbd-private-3-0(aarch-64) \
libxfce4kbd-private-3.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit)"

inherit rpm
