SUMMARY = "wxWidgets advanced widgets and rarely-used widgets"
DESCRIPTION = "Advanced or rarely-used GUI classes for wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_adv-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "01a6183857ea6ea5549127b28d7e6e1db439c437836ee10e47c1cb4dbe6fe0d2fcaca08723e5540634be5813e988a9e9a097cf52145bb6f65b619f7f393be3e6"

RPROVIDES:${PN} += "libwx_qtu_adv-suse.so.9.0.0()(64bit) libwx_qtu_adv-suse.so.9.0.0(WXU_3.2)(64bit) libwx_qtu_adv-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_qtu_adv-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_qtu_adv-suse9_0_0 libwx_qtu_adv-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
