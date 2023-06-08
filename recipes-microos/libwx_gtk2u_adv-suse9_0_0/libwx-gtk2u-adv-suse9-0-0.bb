SUMMARY = "wxWidgets advanced widgets and rarely-used widgets"
DESCRIPTION = "Advanced or rarely-used GUI classes for wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_adv-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "9ae81322a8e0529f036a2c212e70e94d0cb9e883e3fd2e6fe0156892eb2537e8809f19dd414c94b3096caa5d8b5420bb070a9092131076881748b90889b5e032"

RPROVIDES:${PN} += "libwx_gtk2u_adv-suse.so.9.0.0()(64bit) libwx_gtk2u_adv-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_adv-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk2u_adv-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk2u_adv-suse9_0_0 libwx_gtk2u_adv-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
