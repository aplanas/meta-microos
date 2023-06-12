SUMMARY = "Kernel driver for Realtek 802.11ac 8812au wifi cards"
DESCRIPTION = "Kernel driver for Realtek 802.11ac 8812au wifi cards \
 \
The sources were obtained from https://github.com/morrownr/8812au-20210629, which adaptes the official driver \
released by Realtek to build on recent kernels. \
 \
The previous sources were obtained from https://github.com/morrownr/8812au-20210629, https://github.com/diederikdehaas/rtl8812AU and \
https://github.com/maurossi/rtl8812au/ ."
LICENSE = "GPL-2.0-only"

PV = "5.13.6+git20230511.765d4e4"

RPM_NAME = "rtl8812au-5.13.6+git20230511.765d4e4-1.2.aarch64.rpm"
RPM_HASH = "09aad264e22a9b52d48f62daab7a93ccfbb8f46c93506e8553953f9688d06b411cf348924b5f0b76f011a3d7d0b95d710d52f0475fcd6cf46cf004058125b017"

RPROVIDES:${PN} += "rtl8812au rtl8812au(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
