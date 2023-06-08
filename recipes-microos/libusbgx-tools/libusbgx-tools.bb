SUMMARY = "Utilities to show and configure USB gadget devices"
DESCRIPTION = "libusbgx is a C library encapsulating the kernel USB gadget-configfs \
userspace API functionality. \
 \
This subpackage contains utilities to display and configure USB \
gadget devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "libusbgx-tools-0.2.0-1.13.aarch64.rpm"
RPM_HASH = "ff2c188565c11363f8a6e3119c26ae0b12087e35827ab7e864ecfa135d8ee5847eda4e382327a79ee8caf66a943b8e4f89859ebd6f043f4ab9133dfcf4dd105b"

RPROVIDES:${PN} += "libusbgx-tools libusbgx-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libusbgx.so.2()(64bit)"

inherit rpm
