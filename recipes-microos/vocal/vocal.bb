SUMMARY = "A podcast client for the desktop"
DESCRIPTION = "A podcast application designed for Elementary OS and other GTK-based \
Linux desktops. Includes a built-in video player, automatic updating, \
smart library management, library importing and exporting, custom \
skip intervals, and more."
LICENSE = "GPL-3.0-only"

PV = "2.4.2"

RPM_NAME = "vocal-2.4.2-5.4.aarch64.rpm"
RPM_HASH = "d88a74cc63ed264dc60648055a6de4eecd5ee256578f7b56db25ea09fc52531aa3ee59b4ffe7571cc0a60babd89b50b971b013b6d3252ed9e2bdd4a182973e2f"

RPROVIDES:${PN} += "application() application(com.github.needleandthread.vocal.desktop) metainfo() metainfo(com.github.needleandthread.vocal.appdata.xml) vocal vocal(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libclutter-1.0.so.0()(64bit) libclutter-gst-3.0.so.0()(64bit) libclutter-gtk-1.0.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgranite.so.6()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libnotify.so.4()(64bit) libsoup-2.4.so.1()(64bit) libsqlite3.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
