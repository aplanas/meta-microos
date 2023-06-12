SUMMARY = "Remote control program for Pentax DSLR cameras"
DESCRIPTION = "pkTriggerCord is a remote control program for Pentax DSLR cameras."
LICENSE = "LGPL-3.0-only"

PV = "0.85.00+git.20220806"

RPM_NAME = "pkTriggerCord-0.85.00+git.20220806-1.3.aarch64.rpm"
RPM_HASH = "d00504e19115e81a014e93071f4f5905aecacc9293e26058600771681377e3049d11e024ae563ebc6471b6a25e384a84fc332d036176f91115ceaa100c8877bb"

RPROVIDES:${PN} += "pkTriggerCord \
pkTriggerCord(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
