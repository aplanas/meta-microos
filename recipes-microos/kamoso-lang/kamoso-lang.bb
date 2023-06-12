SUMMARY = "Translations for package kamoso"
DESCRIPTION = "Provides translations for the 'kamoso' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kamoso-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "4cc8430b5d8bc53f074eef7edadc8fe843b97158f443a7bfbe19ef8a2e270af1b1148b612687bfa01c2224fc6b97917a2b06621ac9a21f4b274976b9025d5b08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kamoso-lang \
kamoso-lang-all \
locale(kamoso:ar) \
locale(kamoso:bg) \
locale(kamoso:bs) \
locale(kamoso:ca) \
locale(kamoso:ca@valencia) \
locale(kamoso:cs) \
locale(kamoso:da) \
locale(kamoso:de) \
locale(kamoso:el) \
locale(kamoso:en_GB) \
locale(kamoso:eo) \
locale(kamoso:es) \
locale(kamoso:et) \
locale(kamoso:eu) \
locale(kamoso:fi) \
locale(kamoso:fr) \
locale(kamoso:ga) \
locale(kamoso:gl) \
locale(kamoso:hu) \
locale(kamoso:ia) \
locale(kamoso:id) \
locale(kamoso:is) \
locale(kamoso:it) \
locale(kamoso:ja) \
locale(kamoso:ka) \
locale(kamoso:kk) \
locale(kamoso:ko) \
locale(kamoso:lt) \
locale(kamoso:lv) \
locale(kamoso:mai) \
locale(kamoso:mr) \
locale(kamoso:nb) \
locale(kamoso:nds) \
locale(kamoso:nl) \
locale(kamoso:nn) \
locale(kamoso:pa) \
locale(kamoso:pl) \
locale(kamoso:pt) \
locale(kamoso:pt_BR) \
locale(kamoso:ro) \
locale(kamoso:ru) \
locale(kamoso:sk) \
locale(kamoso:sl) \
locale(kamoso:sv) \
locale(kamoso:tr) \
locale(kamoso:ug) \
locale(kamoso:uk) \
locale(kamoso:zh_CN) \
locale(kamoso:zh_TW)"
RDEPENDS:${PN} += "kamoso"

inherit rpm
