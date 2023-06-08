SUMMARY = "MPD Client for the Xfce Desktop Environment"
DESCRIPTION = "Xfmpc is a Music Player Daemon (MPD) client application for the \
Xfce desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "xfmpc-0.3.1-1.1.aarch64.rpm"
RPM_HASH = "b1f365be4f46a4d14f7c5722bb25cae1696693c1ad5137d40951072a8969c3caf577eef352fdc22d74a7e462769b6aaf1bdd2325a6f5a538d4c3e83b8a4a875a"

RPROVIDES:${PN} += "application() application(xfmpc.desktop) xfmpc xfmpc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libmpd.so.1()(64bit) libpango-1.0.so.0()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit)"

inherit rpm
