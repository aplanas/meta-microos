SUMMARY = "Wayland core client library"
DESCRIPTION = "Wayland is a protocol for a compositor to talk to its clients as well \
as a C library implementation of that protocol. The compositor can be \
a standalone display server running on Linux kernel modesetting and \
evdev input devices, an X application, or a wayland client itself. \
The clients can be traditional applications, X servers (rootless or \
fullscreen) or other display servers."
LICENSE = "MIT"

PV = "1.22.0"

RPM_NAME = "libwayland-client0-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "d21f487d88da96de869f3b14f776d7401b734a0ae8dbd2d18b03a910b71b9c9b902d4fb46cd48e2dd543f13500d974f2e8dc40443c761e43c4037411aaa46d1a"

RPROVIDES:${PN} += "libwayland-client.so.0()(64bit) libwayland-client0 libwayland-client0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit)"

inherit rpm
