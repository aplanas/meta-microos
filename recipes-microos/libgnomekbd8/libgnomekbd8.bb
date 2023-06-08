SUMMARY = "GNOME Keyboard Library"
DESCRIPTION = "GNOME keyboard shared library. \
 \
This package provides the shared library of libgnomekbd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "libgnomekbd8-3.28.1-1.3.aarch64.rpm"
RPM_HASH = "68d1fe0f2c8d2fdffcd9f477d22b9544e029669d4cab14a469607eef6218df3593682c534c59a310ff56a0a53d86e5b87ebf9575d33c29879bd9ef6da8882afc"

RPROVIDES:${PN} += "libgnomekbd libgnomekbd.so.8()(64bit) libgnomekbd8 libgnomekbd8(aarch-64) libgnomekbdui.so.8()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libxklavier.so.16()(64bit)"

inherit rpm
