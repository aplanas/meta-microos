SUMMARY = "Screenshot Tool for the Xfce Desktop"
DESCRIPTION = "Xfce4 Screenshooter is a tool for taking screenshots, it can capture the entire \
screen, the active window or a selected region. Screenshots may be taken with a \
user-specified delay and the resulting images can be saved to a PNG file, \
copied it to the clipboard, opened with another application, or uploaded to \
ZimageZ, a free online image hosting service."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.3"

RPM_NAME = "xfce4-screenshooter-1.10.3-1.3.aarch64.rpm"
RPM_HASH = "3246836f956a42c42d5ce3fc9cd43fc68d83a09c32d85396296651e499a3a85fe91596b9e2365ec8047b0cc8f505f85986aeab884709a2e508988f1c6472d9dc"

RPROVIDES:${PN} += "application() application(xfce4-screenshooter.desktop) metainfo() metainfo(xfce4-screenshooter.appdata.xml) xfce4-screenshooter xfce4-screenshooter(aarch-64) xfce4-screenshooter-doc"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libexo-2.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libsoup-3.0.so.0()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4ui-tools libxfce4util.so.7()(64bit) libxfconf-0.so.3()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
