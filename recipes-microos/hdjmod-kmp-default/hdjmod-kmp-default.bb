SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.34_k6.3.4_1"

RPM_NAME = "hdjmod-kmp-default-1.34_k6.3.4_1-1.4.aarch64.rpm"
RPM_HASH = "05bd4f14b83f8290de209e51f2fa8adffb2f5564a68532e7d757ad48ad8c254c636dba0a6665583b9abeba95263f85957c4f97a3d583a2bd172f3d448c578489"

RPROVIDES:${PN} += "hdjmod-kmp \
hdjmod-kmp-default \
hdjmod-kmp-default(aarch-64) \
hdjmod-kmp-default-k6.3.4_1 \
kmod(hdj_mod.ko) \
multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
