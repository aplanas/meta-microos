SUMMARY = "Translations for package kamoso"
DESCRIPTION = "Provides translations for the 'kamoso' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kamoso-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "3fd4ac5af0d44a8e93afff534af3455be9b1e405a6068d7959189e43979bbcc82a1e9b5dda9c34951d8204b08216b050a8d618ae6af9e2a69c949bd61229a3f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kamoso-lang kamoso-lang-all locale(kamoso:ar) locale(kamoso:bg) locale(kamoso:bs) locale(kamoso:ca) locale(kamoso:ca@valencia) locale(kamoso:cs) locale(kamoso:da) locale(kamoso:de) locale(kamoso:el) locale(kamoso:en_GB) locale(kamoso:eo) locale(kamoso:es) locale(kamoso:et) locale(kamoso:eu) locale(kamoso:fi) locale(kamoso:fr) locale(kamoso:ga) locale(kamoso:gl) locale(kamoso:hu) locale(kamoso:ia) locale(kamoso:id) locale(kamoso:is) locale(kamoso:it) locale(kamoso:ja) locale(kamoso:ka) locale(kamoso:kk) locale(kamoso:ko) locale(kamoso:lt) locale(kamoso:lv) locale(kamoso:mai) locale(kamoso:mr) locale(kamoso:nb) locale(kamoso:nds) locale(kamoso:nl) locale(kamoso:nn) locale(kamoso:pa) locale(kamoso:pl) locale(kamoso:pt) locale(kamoso:pt_BR) locale(kamoso:ro) locale(kamoso:ru) locale(kamoso:sk) locale(kamoso:sl) locale(kamoso:sv) locale(kamoso:tr) locale(kamoso:ug) locale(kamoso:uk) locale(kamoso:zh_CN) locale(kamoso:zh_TW)"
RDEPENDS:${PN} += "kamoso"

inherit rpm
