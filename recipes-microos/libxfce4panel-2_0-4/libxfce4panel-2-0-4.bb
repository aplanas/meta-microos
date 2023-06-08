SUMMARY = "Xfce Panel Shared Library"
DESCRIPTION = "This package contains GTK 3 variant of the xfce4-panel shared library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.3"

RPM_NAME = "libxfce4panel-2_0-4-4.18.3-1.1.aarch64.rpm"
RPM_HASH = "c0c15c402335277ad10182e5fe9676765239b6966722a7cb01547ec2c10e79c81eba8aa5141b8a3301d80bc641bad35695c3402a472898272508917f7fb6d07f"

RPROVIDES:${PN} += "libxfce4panel-2.0.so.4()(64bit) libxfce4panel-2_0-4 libxfce4panel-2_0-4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libxfce4util.so.7()(64bit)"

inherit rpm
