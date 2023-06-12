SUMMARY = "Translations for package kdevplatform"
DESCRIPTION = "Provides translations for the 'kdevplatform' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdevplatform-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "8f5804aca0cb500b8c80add98c735fa82bb3aefb0b696ddc52685b4295f5f47cdc36f17c984d4db8d15ed9e19b5ecb3120bb7baad67592d3b6eb71702734d28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdevplatform-lang kdevplatform-lang-all locale(kdevplatform:ar) locale(kdevplatform:az) locale(kdevplatform:bg) locale(kdevplatform:bs) locale(kdevplatform:ca) locale(kdevplatform:ca@valencia) locale(kdevplatform:cs) locale(kdevplatform:da) locale(kdevplatform:de) locale(kdevplatform:el) locale(kdevplatform:en_GB) locale(kdevplatform:eo) locale(kdevplatform:es) locale(kdevplatform:et) locale(kdevplatform:eu) locale(kdevplatform:fi) locale(kdevplatform:fr) locale(kdevplatform:ga) locale(kdevplatform:gl) locale(kdevplatform:hr) locale(kdevplatform:hu) locale(kdevplatform:it) locale(kdevplatform:ja) locale(kdevplatform:ka) locale(kdevplatform:kk) locale(kdevplatform:ko) locale(kdevplatform:lt) locale(kdevplatform:mr) locale(kdevplatform:ms) locale(kdevplatform:nb) locale(kdevplatform:nds) locale(kdevplatform:nl) locale(kdevplatform:nn) locale(kdevplatform:pa) locale(kdevplatform:pl) locale(kdevplatform:pt) locale(kdevplatform:pt_BR) locale(kdevplatform:ro) locale(kdevplatform:ru) locale(kdevplatform:sk) locale(kdevplatform:sl) locale(kdevplatform:sv) locale(kdevplatform:tr) locale(kdevplatform:ug) locale(kdevplatform:uk) locale(kdevplatform:zh_CN) locale(kdevplatform:zh_TW)"
RDEPENDS:${PN} += "kdevplatform"

inherit rpm
