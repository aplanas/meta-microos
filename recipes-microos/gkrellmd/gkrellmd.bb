SUMMARY = "Multiple Stacked Monitors daemon"
DESCRIPTION = "The GNU Grell Monitors daemon service, independent from any GUI library."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.11"

RPM_NAME = "gkrellmd-2.3.11-2.10.aarch64.rpm"
RPM_HASH = "975d64883cf681becfa4e7ac43d425e2bf39e616f85a5ab743b599dbe4eb15edcd012cc39ec8188610b2efbc2344e9890044a5af27f8a2891b12f3fcd3dc0b6b"

RPROVIDES:${PN} += "config(gkrellmd) \
gkrellmd \
gkrellmd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libsensors.so.4()(64bit)"

inherit rpm
