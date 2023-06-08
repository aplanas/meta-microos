SUMMARY = "Shared library for Raven"
DESCRIPTION = "Budgie Desktop Notification Center."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.1+20"

RPM_NAME = "libraven0-10.7.1+20-1.1.aarch64.rpm"
RPM_HASH = "dfc88c33c82a5381a5a69a0527563ea103d5baab8c68e50dce17f684d0a9fbd0f76cf8e96ac00afbd7d5933a821075699f4d88c7c68acf4a4137975673553136"

RPROVIDES:${PN} += "libraven.so.0()(64bit) libraven0 libraven0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbudgie-private.so.0()(64bit) libbudgie-raven-plugin.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libgirepository-1.0.so.1()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpeas-1.0.so.0()(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
