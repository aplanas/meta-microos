SUMMARY = "Use wayland as a client"
DESCRIPTION = "Using wayland as a client (uwac) is a library to provide common \
functionality for wayland clients."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "libuwac0-0-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "d9cc818f5da2ef85d5bcde8b2a05f494f96cf630a3a7796e4590d1d01e52c6becdaf7f04644a38ff478717b204baa3acb94fd11ef7255e4249ea2594cafc57b8"

RPROVIDES:${PN} += "libuwac0-0 libuwac0-0(aarch-64) libuwac0.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) libfreerdp2.so.2()(64bit) libwayland-client.so.0()(64bit) libwayland-cursor.so.0()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
