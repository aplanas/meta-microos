SUMMARY = "Tools from libxfce4ui"
DESCRIPTION = "This package provides tools from libxfce4ui."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.4"

RPM_NAME = "libxfce4ui-tools-4.18.4-1.1.aarch64.rpm"
RPM_HASH = "1d1bec50b65013a982f29e5665499ee286de4879be7e579d967c1e914068dfe533c7e10e917a7dfc18af0b29ee77bff7807651127648cd2c99775e741af54a3c"

RPROVIDES:${PN} += "application() application(xfce4-about.desktop) libxfce4ui-tools libxfce4ui-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libepoxy.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtop-2.0.so.11()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit)"

inherit rpm
