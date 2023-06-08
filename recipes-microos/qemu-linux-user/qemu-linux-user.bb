SUMMARY = "CPU emulator for user space"
DESCRIPTION = "QEMU provides CPU emulation along with other related capabilities. This package \
provides programs to run user space binaries and libraries meant for another \
architecture. The syscall interface is intercepted and execution below the \
syscall layer occurs on the native hardware and operating system."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-linux-user-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "0cc1e89b2419f2b18e431199e3aa739b396f510ea58714c449f594eccd27f5b655c2cbe308e7f93d3f72315801305727763d03dfe4d898160930621f50bfe2e6"

RPROVIDES:${PN} += "qemu-linux-user qemu-linux-user(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
