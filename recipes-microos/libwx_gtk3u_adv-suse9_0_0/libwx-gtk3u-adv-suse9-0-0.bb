SUMMARY = "wxWidgets advanced widgets and rarely-used widgets"
DESCRIPTION = "Advanced or rarely-used GUI classes for wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_adv-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "b1294bba0ad63dc29dc1ca4acb65b3e0232757ad0cb40af265f1cd9e2cf490e7efb518079eb0e6c03bb9d5d4aa571fc382d93cc1e2644b9cd4ea93b8ff5e37d2"

RPROVIDES:${PN} += "libwx_gtk3u_adv-suse.so.9.0.0()(64bit) libwx_gtk3u_adv-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_adv-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_adv-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_adv-suse9_0_0 libwx_gtk3u_adv-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
