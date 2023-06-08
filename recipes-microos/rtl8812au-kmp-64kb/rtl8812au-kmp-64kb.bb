SUMMARY = "Kernel driver for Realtek 802.11ac rtl8812au wifi cards"
DESCRIPTION = "Kernel driver for Realtek 802.11ac 8812au wifi cards \
 \
The sources were obtained from https://github.com/gordboy/rtl8812au, which adaptes the official driver \
released by Realtek to build on recent kernels. \
 \
The previous sources were obtained from https://github.com/morrownr/8812au-20210629, https://github.com/diederikdehaas/rtl8812AU and \
https://github.com/maurossi/rtl8812au/ ."
LICENSE = "GPL-2.0-only"

PV = "5.13.6+git20220905.a8450b0_k6.2.12_1"

RPM_NAME = "rtl8812au-kmp-64kb-5.13.6+git20220905.a8450b0_k6.2.12_1-2.14.aarch64.rpm"
RPM_HASH = "b57784b3d678ee35e2ff23ff5537178cc1b626ce6b25de4baf0508ca5b07ab0970798b94979d6d351abfe6a40e1ed6dd7a606b280b6c419d3f7609418c423902"

RPROVIDES:${PN} += "kmod(8812au.ko) multiversion(kernel) rtl8812au-kmp rtl8812au-kmp-64kb rtl8812au-kmp-64kb(aarch-64) rtl8812au-kmp-64kb-k6.2.12_1"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-64kb kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
