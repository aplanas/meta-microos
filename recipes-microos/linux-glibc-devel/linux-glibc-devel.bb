SUMMARY = "Linux headers for userspace development"
DESCRIPTION = "This package provides Linux kernel headers, the kernel API description \
required for compilation of almost all programs. This is the userspace \
interface; compiling external kernel modules requires \
kernel-(flavor)-devel, or kernel-syms to pull in all kernel-*-devel, \
packages, instead."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "linux-glibc-devel-6.3-1.1.aarch64.rpm"
RPM_HASH = "17634cb8f526381d9c89b11aafe89fb85e5ed626b56fe1828dedbd7d859eddfa48b423f216f366e82e9063e054d3841fff0b8e43b00315ccc1951a2b3a3663eb"

RPROVIDES:${PN} += "kernel-headers linux-glibc-devel linux-glibc-devel(aarch-64) linux-kernel-headers"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
