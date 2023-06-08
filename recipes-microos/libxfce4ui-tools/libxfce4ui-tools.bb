SUMMARY = "Tools from libxfce4ui"
DESCRIPTION = "This package provides tools from libxfce4ui."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.3"

RPM_NAME = "libxfce4ui-tools-4.18.3-1.1.aarch64.rpm"
RPM_HASH = "5a04a01bc2b1952362eb4f772ff64ca2acfb6651942b9d573184d5529a9c55c6a63370d16978a076ffad8893c4071df5971f269dc2327be17ea4be6b2eef6f92"

RPROVIDES:${PN} += "application() application(xfce4-about.desktop) libxfce4ui-tools libxfce4ui-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libepoxy.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtop-2.0.so.11()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit)"

inherit rpm
