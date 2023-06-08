SUMMARY = "Eyes Plugin for the Xfce Panel"
DESCRIPTION = "The Eyes plugin adds moving eyes to the panel which watch your activities."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "xfce4-eyes-plugin-4.6.0-1.7.aarch64.rpm"
RPM_HASH = "cd64de31805644604560ab6476d86320db7cbc2ae4f583a2326ed9fff6f21e3807af8dec340e90068bd2a0f9bd4cc09932f0af3a1bc83c65369d59d96a2a0a25"

RPROVIDES:${PN} += "libeyes.so()(64bit) xfce4-eyes-plugin xfce4-eyes-plugin(aarch-64) xfce4-panel-plugin-eyes"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libxfce4panel-2.0.so.4()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit) xfce4-panel"

inherit rpm
