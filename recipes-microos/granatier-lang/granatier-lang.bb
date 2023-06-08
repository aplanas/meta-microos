SUMMARY = "Translations for package granatier"
DESCRIPTION = "Provides translations for the 'granatier' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "granatier-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "0591e78cbcc7886a9802b146a973c81357470d05d01a086081859d88b0311d62a4c17fbb829d12a482731985f92cc3c923bfc5cad26867cfb1fd2befbce2cea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "granatier-lang granatier-lang-all locale(granatier:ar) locale(granatier:bg) locale(granatier:bs) locale(granatier:ca) locale(granatier:ca@valencia) locale(granatier:cs) locale(granatier:da) locale(granatier:de) locale(granatier:el) locale(granatier:en_GB) locale(granatier:eo) locale(granatier:es) locale(granatier:et) locale(granatier:eu) locale(granatier:fi) locale(granatier:fr) locale(granatier:ga) locale(granatier:gl) locale(granatier:hr) locale(granatier:hu) locale(granatier:id) locale(granatier:is) locale(granatier:it) locale(granatier:ja) locale(granatier:ka) locale(granatier:kk) locale(granatier:km) locale(granatier:ko) locale(granatier:lt) locale(granatier:lv) locale(granatier:mai) locale(granatier:ml) locale(granatier:mr) locale(granatier:ms) locale(granatier:nb) locale(granatier:nds) locale(granatier:nl) locale(granatier:nn) locale(granatier:pl) locale(granatier:pt) locale(granatier:pt_BR) locale(granatier:ro) locale(granatier:ru) locale(granatier:sk) locale(granatier:sl) locale(granatier:sr) locale(granatier:sr@ijekavian) locale(granatier:sr@ijekavianlatin) locale(granatier:sr@latin) locale(granatier:sv) locale(granatier:th) locale(granatier:tr) locale(granatier:ug) locale(granatier:uk) locale(granatier:zh_CN) locale(granatier:zh_TW)"
RDEPENDS:${PN} += "granatier"

inherit rpm
