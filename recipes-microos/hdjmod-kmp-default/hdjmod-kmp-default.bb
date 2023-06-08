SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.33_k6.3.1_1"

RPM_NAME = "hdjmod-kmp-default-1.33_k6.3.1_1-1.47.aarch64.rpm"
RPM_HASH = "d84760ec189a0f54928b874228d23eef17b0b6a0a8786347463d5d737aaf926087647eb21044fbf8eb739fec238ada743d7fd34622fbf00934dd8ce779901522"

RPROVIDES:${PN} += "hdjmod-kmp hdjmod-kmp-default hdjmod-kmp-default(aarch-64) hdjmod-kmp-default-k6.3.1_1 kmod(hdj_mod.ko) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-default kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
