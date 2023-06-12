SUMMARY = "Brasero composition utility function library"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
 \
This subpackage contains a library of Brasero with utility functions related to \
abstract disc image composition (files and audio tracks)."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "libbrasero-burn3-1-3.12.3-2.7.aarch64.rpm"
RPM_HASH = "654bfa2f99dbf2402f658e03270e4e816745c74c1a84c3685fe91b99842be168c4ac8540520d365f88077a0a3e80435589941fbf9839294b564b05abc06e2559"

RPROVIDES:${PN} += "libbrasero-burn3-1 \
libbrasero-burn3-1(aarch-64) \
libbrasero-burn3.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbrasero-media3.so.1()(64bit) \
libbrasero-utils3.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
