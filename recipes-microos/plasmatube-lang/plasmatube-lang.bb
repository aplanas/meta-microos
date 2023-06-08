SUMMARY = "Translations for package plasmatube"
DESCRIPTION = "Provides translations for the 'plasmatube' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "plasmatube-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "02f0ee3e7b9702d54dcbb8d02d1ddf652467a0d074e572199ad7e1381e5f671138092b84a67e6aa5237f14da8f9882dd4f7380f82e7e7f18cf69cd14a7c2c2d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasmatube:ar) locale(plasmatube:az) locale(plasmatube:be) locale(plasmatube:ca) locale(plasmatube:ca@valencia) locale(plasmatube:cs) locale(plasmatube:de) locale(plasmatube:en_GB) locale(plasmatube:es) locale(plasmatube:eu) locale(plasmatube:fi) locale(plasmatube:fr) locale(plasmatube:hi) locale(plasmatube:hu) locale(plasmatube:ia) locale(plasmatube:id) locale(plasmatube:it) locale(plasmatube:ja) locale(plasmatube:ka) locale(plasmatube:ko) locale(plasmatube:lt) locale(plasmatube:nl) locale(plasmatube:nn) locale(plasmatube:pa) locale(plasmatube:pl) locale(plasmatube:pt) locale(plasmatube:pt_BR) locale(plasmatube:ru) locale(plasmatube:sk) locale(plasmatube:sl) locale(plasmatube:sv) locale(plasmatube:tr) locale(plasmatube:uk) locale(plasmatube:zh_CN) locale(plasmatube:zh_TW) plasmatube-lang plasmatube-lang-all"
RDEPENDS:${PN} += "plasmatube"

inherit rpm
