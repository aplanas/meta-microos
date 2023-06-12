SUMMARY = "wxWidgets advanced widgets and rarely-used widgets"
DESCRIPTION = "Advanced or rarely-used GUI classes for wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_adv-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "4e3e6c7f10debbf69adda2da1ae7e71da8a7b362cd8476e45c926a4853edb52dfdfbadd6f6b2c8925c07ae3f770f4c8f00d3e83341b3060d3968ca7ca8486a12"

RPROVIDES:${PN} += "libwx_gtk3u_adv-suse.so.9.0.0()(64bit) \
libwx_gtk3u_adv-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_adv-suse.so.9.0.0(WXU_3.2.1)(64bit) \
libwx_gtk3u_adv-suse.so.9.0.0(WXU_3.2.2)(64bit) \
libwx_gtk3u_adv-suse9_0_0 \
libwx_gtk3u_adv-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
