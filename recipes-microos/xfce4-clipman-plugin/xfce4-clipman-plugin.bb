SUMMARY = "Clipboard Manager Plugin for the Xfce Panel"
DESCRIPTION = "This is a clipboard manager which comes with a plugin for the Xfce Panel. It \
stores the X selection (primary and clipboard) contents even after an \
application has quit and is able to handle text and image data. Furthermore, it \
can be configured to execute arbitrary actions when the selection content \
matches specific regular expressions."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.3"

RPM_NAME = "xfce4-clipman-plugin-1.6.3-1.1.aarch64.rpm"
RPM_HASH = "55ad9ecc5cd6a8d440689ba3683f8b4a228cc9b40f0a0a05337cc0d12dfda0c00c7ca5c0342ff5aa3c7b707e48f540706545d7a1bebd4b59afe87288949ee75d"

RPROVIDES:${PN} += "application() application(xfce4-clipman-settings.desktop) application(xfce4-clipman.desktop) config(xfce4-clipman-plugin) libclipman.so()(64bit) metainfo() metainfo(xfce4-clipman.appdata.xml) xfce4-clipman-plugin xfce4-clipman-plugin(aarch-64) xfce4-panel-plugin-clipman"
RDEPENDS:${PN} += "exo-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXtst.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libqrencode.so.4()(64bit) libxfce4panel-2.0.so.4()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit) libxfconf-0.so.3()(64bit) xfce4-panel"

inherit rpm
