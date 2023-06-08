SUMMARY = "Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.0"

RPM_NAME = "libatspi0-2.48.0-1.1.aarch64.rpm"
RPM_HASH = "dd551356c146b3e47fcee0a661bf2e8bf52dc8d920581ca7231d78c7cc3adf505f3c4982d90288cd8f956c67cf3bf9cd698a79cd6d4cbe48b4a72f4695536b7b"

RPROVIDES:${PN} += "libatspi.so.0()(64bit) libatspi0 libatspi0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXi.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
