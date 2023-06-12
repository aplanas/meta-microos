SUMMARY = "wxWidgets advanced widgets and rarely-used widgets"
DESCRIPTION = "Advanced or rarely-used GUI classes for wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_adv-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "6edd527e864fd640347cb21e145420603f8f2932458bdb8e718c44aa40ce6286e00b08e09750589e70c83d695dfc42006af82fff1419126057aed1eefd99891a"

RPROVIDES:${PN} += "libwx_gtk2u_adv-suse.so.9.0.0()(64bit) libwx_gtk2u_adv-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_adv-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk2u_adv-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk2u_adv-suse9_0_0 libwx_gtk2u_adv-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
