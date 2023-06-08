SUMMARY = "Kernel driver for Realtek 802.11ac 8812au wifi cards"
DESCRIPTION = "Kernel driver for Realtek 802.11ac 8812au wifi cards \
 \
The sources were obtained from https://github.com/morrownr/8812au-20210629, which adaptes the official driver \
released by Realtek to build on recent kernels. \
 \
The previous sources were obtained from https://github.com/morrownr/8812au-20210629, https://github.com/diederikdehaas/rtl8812AU and \
https://github.com/maurossi/rtl8812au/ ."
LICENSE = "GPL-2.0-only"

PV = "5.13.6+git20220905.a8450b0"

RPM_NAME = "rtl8812au-5.13.6+git20220905.a8450b0-2.14.aarch64.rpm"
RPM_HASH = "838242d65d210b14b2fcb7c851fb103cad5c353badfaa307560e3bd1e420da1c1335b13837cb387cd52349ab052ccda5c97d016b888f734b289127150032f3a7"

RPROVIDES:${PN} += "rtl8812au rtl8812au(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
