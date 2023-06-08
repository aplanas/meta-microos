SUMMARY = "ATK/D-Bus bridging library"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
The package contains a ATK/D-Bus bridge library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.0"

RPM_NAME = "libatk-bridge-2_0-0-2.48.0-1.1.aarch64.rpm"
RPM_HASH = "8933d71b34c1d98a1d85ebcf10eeb2c9256d58033623037452e0f529105ca3537b00375075886b08b409499a2909ae97c53a295cd31dbd4d13b690428c848bae"

RPROVIDES:${PN} += "libatk-bridge-2.0.so.0()(64bit) libatk-bridge-2_0-0 libatk-bridge-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libatspi.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
