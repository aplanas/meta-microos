SUMMARY = "Library for client-side Wayland decorations"
DESCRIPTION = "A client-side decorations library for Wayland client."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "libdecor-0-0-0.1.1-1.2.aarch64.rpm"
RPM_HASH = "a507019c43a45273bfcfa0b334d7f14bf0b26f53ff02292f023bcdb4cea29a4c1b83112a48c856f8cc66a8114f076c22d293b05b1891640aefa8de8730b41b24"

RPROVIDES:${PN} += "libdecor-0-0 libdecor-0-0(aarch-64) libdecor-0.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdecor libwayland-client.so.0()(64bit)"

inherit rpm
