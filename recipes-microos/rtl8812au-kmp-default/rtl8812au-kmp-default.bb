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

RPM_NAME = "rtl8812au-kmp-default-5.13.6+git20220905.a8450b0_k6.2.12_1-2.14.aarch64.rpm"
RPM_HASH = "87db32fba0621dc0c80c81a7185376cd38b64dad05fbec6f1a263c483d506bfa5804d74f25776552e408eb393e8f9f4aacd32fac10062e350276fd5fb4d0cc7e"

RPROVIDES:${PN} += "kmod(8812au.ko) multiversion(kernel) rtl8812au-kmp rtl8812au-kmp-default rtl8812au-kmp-default(aarch-64) rtl8812au-kmp-default-k6.2.12_1"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-default kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
