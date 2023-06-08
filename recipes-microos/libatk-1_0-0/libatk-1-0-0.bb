SUMMARY = "An Accessibility Toolkit"
DESCRIPTION = "The ATK library provides a set of accessibility interfaces. By \
supporting the ATK interfaces, an application or toolkit can be used \
with screen readers, magnifiers, and alternate input devices."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.0"

RPM_NAME = "libatk-1_0-0-2.48.0-1.1.aarch64.rpm"
RPM_HASH = "b4ccc1faa1f3781010c2c0b0b8fc3f6de77d3a707a9a79a417b17a76a1be027b2c9e2812941998d1023e9d59b8a9ff0fecfe32f8527516f467e45fd737e33567"

RPROVIDES:${PN} += "atk libatk-1.0.so.0()(64bit) libatk-1_0-0 libatk-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
