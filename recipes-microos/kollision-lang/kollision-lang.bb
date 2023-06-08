SUMMARY = "Translations for package kollision"
DESCRIPTION = "Provides translations for the 'kollision' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kollision-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "34152ba6541bd9f69f4b8239a606864e7df8f9d9950c087e122ddfce392b93400d6763c8ceaa5e5d84b55ffe680ded028a3aab99992e095367775ddaf44d2b8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kollision-lang kollision-lang-all locale(kollision:ar) locale(kollision:bg) locale(kollision:bs) locale(kollision:ca) locale(kollision:ca@valencia) locale(kollision:cs) locale(kollision:da) locale(kollision:de) locale(kollision:el) locale(kollision:en_GB) locale(kollision:eo) locale(kollision:es) locale(kollision:et) locale(kollision:eu) locale(kollision:fi) locale(kollision:fr) locale(kollision:ga) locale(kollision:gl) locale(kollision:gu) locale(kollision:hr) locale(kollision:hu) locale(kollision:id) locale(kollision:is) locale(kollision:it) locale(kollision:ja) locale(kollision:ka) locale(kollision:kk) locale(kollision:km) locale(kollision:ko) locale(kollision:lt) locale(kollision:lv) locale(kollision:mai) locale(kollision:ml) locale(kollision:mr) locale(kollision:nb) locale(kollision:nds) locale(kollision:nl) locale(kollision:nn) locale(kollision:pa) locale(kollision:pl) locale(kollision:pt) locale(kollision:pt_BR) locale(kollision:ro) locale(kollision:ru) locale(kollision:sk) locale(kollision:sl) locale(kollision:sq) locale(kollision:sr) locale(kollision:sr@ijekavian) locale(kollision:sr@ijekavianlatin) locale(kollision:sr@latin) locale(kollision:sv) locale(kollision:th) locale(kollision:tr) locale(kollision:ug) locale(kollision:uk) locale(kollision:zh_CN) locale(kollision:zh_TW)"
RDEPENDS:${PN} += "kollision"

inherit rpm
