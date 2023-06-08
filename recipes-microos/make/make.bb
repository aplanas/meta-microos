SUMMARY = "GNU make"
DESCRIPTION = "The GNU make command with extensive documentation."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.1"

RPM_NAME = "make-4.4.1-2.1.aarch64.rpm"
RPM_HASH = "46a890e6fb3f8b45751b7a3cf220ff09bf06bacf2645aa65e069bf41790b0414441d6bbd087ba50f6d52ed5f3439c8dbd61c8fdeaceafae65bf9f092c17db56f"

RPROVIDES:${PN} += "gmake make make(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
