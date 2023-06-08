SUMMARY = "Translations for package kaffeine"
DESCRIPTION = "Provides translations for the 'kaffeine' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.18"

RPM_NAME = "kaffeine-lang-2.0.18-1.25.noarch.rpm"
RPM_HASH = "235c3398214acef0601720c693660a219501aadf757a2b926a5e692cd5f1aad2ba43e795512e62deafea32cdd434e29f5445d594b840ede6f49285ed24019e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaffeine-lang kaffeine-lang-all locale(kaffeine:ar) locale(kaffeine:be) locale(kaffeine:bg) locale(kaffeine:bs) locale(kaffeine:ca) locale(kaffeine:ca@valencia) locale(kaffeine:cs) locale(kaffeine:da) locale(kaffeine:de) locale(kaffeine:el) locale(kaffeine:en_GB) locale(kaffeine:eo) locale(kaffeine:es) locale(kaffeine:et) locale(kaffeine:eu) locale(kaffeine:fi) locale(kaffeine:fr) locale(kaffeine:ga) locale(kaffeine:gl) locale(kaffeine:hr) locale(kaffeine:hu) locale(kaffeine:ia) locale(kaffeine:id) locale(kaffeine:it) locale(kaffeine:ja) locale(kaffeine:km) locale(kaffeine:ko) locale(kaffeine:lt) locale(kaffeine:mai) locale(kaffeine:mr) locale(kaffeine:nb) locale(kaffeine:nds) locale(kaffeine:nl) locale(kaffeine:nn) locale(kaffeine:pa) locale(kaffeine:pl) locale(kaffeine:pt) locale(kaffeine:pt_BR) locale(kaffeine:ro) locale(kaffeine:ru) locale(kaffeine:sk) locale(kaffeine:sl) locale(kaffeine:sq) locale(kaffeine:sr) locale(kaffeine:sr@ijekavian) locale(kaffeine:sr@ijekavianlatin) locale(kaffeine:sr@latin) locale(kaffeine:sv) locale(kaffeine:th) locale(kaffeine:tr) locale(kaffeine:ug) locale(kaffeine:uk) locale(kaffeine:zh_CN) locale(kaffeine:zh_TW)"
RDEPENDS:${PN} += "kaffeine"

inherit rpm
