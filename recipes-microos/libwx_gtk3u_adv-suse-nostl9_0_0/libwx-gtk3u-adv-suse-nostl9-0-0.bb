SUMMARY = "wxWidgets advanced widgets and rarely-used widgets"
DESCRIPTION = "Advanced or rarely-used GUI classes for wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_adv-suse-nostl9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "41c4f45b288039b24cc5ac0f4f25ff972c61258e68d0463afc269ffe24916720b1b9fda899a993e090185e93a37bb780376d8238b6d7c1dc98fc5fc59ab17a34"

RPROVIDES:${PN} += "libwx_gtk3u_adv-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_adv-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_adv-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_adv-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_adv-suse-nostl9_0_0 libwx_gtk3u_adv-suse-nostl9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
