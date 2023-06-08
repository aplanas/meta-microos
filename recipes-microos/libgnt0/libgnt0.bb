SUMMARY = "TUI Toolkit based on GLib and ncurses"
DESCRIPTION = "GNT is an ncurses toolkit for creating text-mode graphical user \
interfaces."
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "libgnt0-2.14.3-1.7.aarch64.rpm"
RPM_HASH = "7eaa279a3d6809a8b015a7ee80c38a524d1bf51053435d7e636c3f85dd08db6334b413e6491fd90140091b02b33356c0089ed01da5b5c5e98c8398b2cf5c4439"

RPROVIDES:${PN} += "libgnt.so.0()(64bit) libgnt0 libgnt0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libpanelw.so.6()(64bit) libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
