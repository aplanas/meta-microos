SUMMARY = "Screenshot Plugin for the Xfce Panel"
DESCRIPTION = "This package contains the xfce4-screenshooter Xfce panel plugin."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.3"

RPM_NAME = "xfce4-screenshooter-plugin-1.10.3-1.3.aarch64.rpm"
RPM_HASH = "4f2ca53a52811e17461a742bbf72d5015854abb2f8775f6d8b07ea9e41b249497f83aa959614d97f3372573169a9a8046d5438eb70c05dd5f8a10d05fc8ef05a"

RPROVIDES:${PN} += "libscreenshooterplugin.so()(64bit) xfce4-panel-plugin-screenshooter xfce4-screenshooter-plugin xfce4-screenshooter-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libexo-2.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libsoup-3.0.so.0()(64bit) libxfce4panel-2.0.so.4()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit) libxfconf-0.so.3()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) xfce4-panel xfce4-screenshooter"

inherit rpm
