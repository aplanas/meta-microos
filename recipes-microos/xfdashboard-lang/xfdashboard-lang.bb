SUMMARY = "Translations for package xfdashboard"
DESCRIPTION = "Provides translations for the 'xfdashboard' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "xfdashboard-lang-1.0.0-1.4.noarch.rpm"
RPM_HASH = "3f5c46d613bcd469ad843808d9ad5bf2c874bc752e213bc8ac9d35be9f7adf0f30e5cbce783ee3236494969cccbf8c78010960b505530e96537df3fde86f1d3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfdashboard:be) locale(xfdashboard:bg) locale(xfdashboard:ca) locale(xfdashboard:da) locale(xfdashboard:de) locale(xfdashboard:el) locale(xfdashboard:es) locale(xfdashboard:et) locale(xfdashboard:eu) locale(xfdashboard:fr) locale(xfdashboard:gl) locale(xfdashboard:he) locale(xfdashboard:id) locale(xfdashboard:it) locale(xfdashboard:it_IT) locale(xfdashboard:ja) locale(xfdashboard:kk) locale(xfdashboard:ko) locale(xfdashboard:lt) locale(xfdashboard:nb) locale(xfdashboard:nl) locale(xfdashboard:pl) locale(xfdashboard:pt) locale(xfdashboard:pt_BR) locale(xfdashboard:ru) locale(xfdashboard:ru_RU) locale(xfdashboard:sl) locale(xfdashboard:sq) locale(xfdashboard:sr) locale(xfdashboard:sv) locale(xfdashboard:tr) locale(xfdashboard:zh_CN) xfdashboard-lang xfdashboard-lang-all"
RDEPENDS:${PN} += "xfdashboard"

inherit rpm
