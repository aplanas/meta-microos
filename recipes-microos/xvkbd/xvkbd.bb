SUMMARY = "Virtual Keyboard for the X Window System"
DESCRIPTION = "Xvkbd is a virtual (graphical) keyboard program for the X Window System \
which provides a facility to enter characters onto other clients \
(software) by clicking on an on-screen keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "4.1"

RPM_NAME = "xvkbd-4.1-1.11.aarch64.rpm"
RPM_HASH = "fcdbab5d22d575ec15d343abd71a565ff8d83c1a54432f134ab86fb9c934736ed1a4e367ace017e99dbaf292ca3a58248761a36082dfa97541aa9e87c5f7a9d8"

RPROVIDES:${PN} += "application() \
application(xvkbd.desktop) \
xvkbd \
xvkbd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw3d.so.8()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
