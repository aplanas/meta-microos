SUMMARY = "Translations for package klickety"
DESCRIPTION = "Provides translations for the 'klickety' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "klickety-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "24321f642342359a4a18cc4db5ec71a851a7ca9dba4de9c7b15f695e84637aaf8ce93b3b92e51a4e2a5f18d263abb83cf3943d1fbb3de5e83649e9a26cb9e1ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klickety-lang klickety-lang-all locale(klickety:bg) locale(klickety:bs) locale(klickety:ca) locale(klickety:ca@valencia) locale(klickety:cs) locale(klickety:da) locale(klickety:de) locale(klickety:el) locale(klickety:en_GB) locale(klickety:es) locale(klickety:et) locale(klickety:eu) locale(klickety:fi) locale(klickety:fr) locale(klickety:ga) locale(klickety:gl) locale(klickety:hu) locale(klickety:id) locale(klickety:is) locale(klickety:it) locale(klickety:ja) locale(klickety:ka) locale(klickety:kk) locale(klickety:ko) locale(klickety:lt) locale(klickety:lv) locale(klickety:mai) locale(klickety:ml) locale(klickety:mr) locale(klickety:nb) locale(klickety:nds) locale(klickety:nl) locale(klickety:nn) locale(klickety:pl) locale(klickety:pt) locale(klickety:pt_BR) locale(klickety:ro) locale(klickety:ru) locale(klickety:sk) locale(klickety:sl) locale(klickety:sr) locale(klickety:sr@ijekavian) locale(klickety:sr@ijekavianlatin) locale(klickety:sr@latin) locale(klickety:sv) locale(klickety:tr) locale(klickety:ug) locale(klickety:uk) locale(klickety:zh_CN) locale(klickety:zh_TW)"
RDEPENDS:${PN} += "klickety"

inherit rpm
