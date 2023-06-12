SUMMARY = "Translations for package skanlite"
DESCRIPTION = "Provides translations for the 'skanlite' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "skanlite-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "5eb9c36b05f8db2980aa2911dbcbfb1251726e36741f3343008b1bdb3afcf13cda3b80f5836128b51c052027727ada03f5f8cbfdb8984e84b43e67e7a46a8c66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(skanlite:ar) locale(skanlite:az) locale(skanlite:be) locale(skanlite:bg) locale(skanlite:bs) locale(skanlite:ca) locale(skanlite:ca@valencia) locale(skanlite:cs) locale(skanlite:da) locale(skanlite:de) locale(skanlite:el) locale(skanlite:en_GB) locale(skanlite:eo) locale(skanlite:es) locale(skanlite:et) locale(skanlite:eu) locale(skanlite:fi) locale(skanlite:fr) locale(skanlite:ga) locale(skanlite:gl) locale(skanlite:hi) locale(skanlite:hr) locale(skanlite:hu) locale(skanlite:ia) locale(skanlite:id) locale(skanlite:is) locale(skanlite:it) locale(skanlite:ja) locale(skanlite:ka) locale(skanlite:km) locale(skanlite:ko) locale(skanlite:lt) locale(skanlite:lv) locale(skanlite:mai) locale(skanlite:mr) locale(skanlite:nb) locale(skanlite:nds) locale(skanlite:nl) locale(skanlite:nn) locale(skanlite:pa) locale(skanlite:pl) locale(skanlite:pt) locale(skanlite:pt_BR) locale(skanlite:ro) locale(skanlite:ru) locale(skanlite:sk) locale(skanlite:sl) locale(skanlite:sq) locale(skanlite:sv) locale(skanlite:tr) locale(skanlite:ug) locale(skanlite:uk) locale(skanlite:wa) locale(skanlite:zh_CN) locale(skanlite:zh_TW) skanlite-lang skanlite-lang-all"
RDEPENDS:${PN} += "skanlite"

inherit rpm
