SUMMARY = "Translations for package icewm"
DESCRIPTION = "Provides translations for the 'icewm' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.2"

RPM_NAME = "icewm-lang-3.3.2-1.3.noarch.rpm"
RPM_HASH = "06475f3462f082fffa7d4a5f39caf697efaff5bef2f03d82ce98530e514641473f8ce8d923882d6e05dfb861e527b9a2d2af1d061860849e285803f0a4cc19a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icewm-lang icewm-lang-all locale(icewm:ar) locale(icewm:be) locale(icewm:bg) locale(icewm:ca) locale(icewm:cs) locale(icewm:da) locale(icewm:de) locale(icewm:el) locale(icewm:en) locale(icewm:es) locale(icewm:fi) locale(icewm:fr) locale(icewm:he) locale(icewm:hr) locale(icewm:hu) locale(icewm:id) locale(icewm:it) locale(icewm:ja) locale(icewm:ko) locale(icewm:lt) locale(icewm:lv) locale(icewm:mk) locale(icewm:nb) locale(icewm:nl) locale(icewm:pl) locale(icewm:pt) locale(icewm:pt_BR) locale(icewm:ro) locale(icewm:ru) locale(icewm:sk) locale(icewm:sl) locale(icewm:sv) locale(icewm:tr) locale(icewm:uk) locale(icewm:vi) locale(icewm:zh_CN) locale(icewm:zh_TW)"
RDEPENDS:${PN} += "icewm"

inherit rpm
