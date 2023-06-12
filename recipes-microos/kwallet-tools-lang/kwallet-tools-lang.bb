SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "Provides translations to the package kwallet-tools-lang"
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kwallet-tools-lang-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "973d1e3b184923e040bd61b12925f30fb44a4ec60f8024c2d9e0149915b7075371bb080266c37db31a500c0ab2a489d25c432d5bb6a805c63589453c90eebd40"

RPROVIDES:${PN} += "kwallet-tools-lang kwallet-tools-lang(aarch-64) locale(kwallet-tools:ar) locale(kwallet-tools:az) locale(kwallet-tools:bg) locale(kwallet-tools:ca) locale(kwallet-tools:ca@valencia) locale(kwallet-tools:cs) locale(kwallet-tools:da) locale(kwallet-tools:de) locale(kwallet-tools:el) locale(kwallet-tools:en_GB) locale(kwallet-tools:es) locale(kwallet-tools:et) locale(kwallet-tools:eu) locale(kwallet-tools:fi) locale(kwallet-tools:fr) locale(kwallet-tools:gd) locale(kwallet-tools:gl) locale(kwallet-tools:hu) locale(kwallet-tools:ia) locale(kwallet-tools:id) locale(kwallet-tools:it) locale(kwallet-tools:ja) locale(kwallet-tools:ka) locale(kwallet-tools:ko) locale(kwallet-tools:lt) locale(kwallet-tools:ml) locale(kwallet-tools:nl) locale(kwallet-tools:nn) locale(kwallet-tools:pa) locale(kwallet-tools:pl) locale(kwallet-tools:pt) locale(kwallet-tools:pt_BR) locale(kwallet-tools:ro) locale(kwallet-tools:ru) locale(kwallet-tools:sk) locale(kwallet-tools:sl) locale(kwallet-tools:sr) locale(kwallet-tools:sr@ijekavian) locale(kwallet-tools:sr@ijekavianlatin) locale(kwallet-tools:sr@latin) locale(kwallet-tools:sv) locale(kwallet-tools:tr) locale(kwallet-tools:uk) locale(kwallet-tools:vi) locale(kwallet-tools:zh_CN) locale(kwallet-tools:zh_TW)"
RDEPENDS:${PN} += "kwallet-tools"

inherit rpm
