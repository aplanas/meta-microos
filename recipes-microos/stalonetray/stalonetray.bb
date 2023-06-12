SUMMARY = "Stand-alone freedesktop.org system tray"
DESCRIPTION = "Stalonetray is a stand-alone freedesktop.org and KDE system tray (notification \
area) for X Window System/X11 (e.g. X.Org or XFree 86). It has full XEMBED \
support and minimal dependencies: an X11 lib only. Stalonetray works with \
virtually any EWMH-compliant window manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.4"

RPM_NAME = "stalonetray-0.8.4-1.8.aarch64.rpm"
RPM_HASH = "9f05501a861d5e4b28ea59ed455eb01c7e71b86edea8c18fc633c8788f688ec4a15cfac5bcc60a3ff404749ccf71b967258911e3a50f58c871e2a8e39af98d32"

RPROVIDES:${PN} += "stalonetray \
stalonetray(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXpm.so.4()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
