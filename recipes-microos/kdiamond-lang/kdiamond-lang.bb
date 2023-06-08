SUMMARY = "Translations for package kdiamond"
DESCRIPTION = "Provides translations for the 'kdiamond' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdiamond-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "0fdd7e0f3c089d6a5ea2059a8583951cd6def0a82cf282c06e6b57babe854655ae56e87795afe1f60de4681833ab3acf935518e7059e383cf1d6574bb78fec7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdiamond-lang kdiamond-lang-all locale(kdiamond:ar) locale(kdiamond:bg) locale(kdiamond:bs) locale(kdiamond:ca) locale(kdiamond:ca@valencia) locale(kdiamond:cs) locale(kdiamond:da) locale(kdiamond:de) locale(kdiamond:el) locale(kdiamond:en_GB) locale(kdiamond:eo) locale(kdiamond:es) locale(kdiamond:et) locale(kdiamond:eu) locale(kdiamond:fi) locale(kdiamond:fr) locale(kdiamond:ga) locale(kdiamond:gl) locale(kdiamond:gu) locale(kdiamond:hi) locale(kdiamond:hr) locale(kdiamond:hu) locale(kdiamond:id) locale(kdiamond:is) locale(kdiamond:it) locale(kdiamond:ja) locale(kdiamond:ka) locale(kdiamond:kk) locale(kdiamond:km) locale(kdiamond:ko) locale(kdiamond:lt) locale(kdiamond:lv) locale(kdiamond:mai) locale(kdiamond:ml) locale(kdiamond:mr) locale(kdiamond:nb) locale(kdiamond:nds) locale(kdiamond:nl) locale(kdiamond:nn) locale(kdiamond:pl) locale(kdiamond:pt) locale(kdiamond:pt_BR) locale(kdiamond:ro) locale(kdiamond:ru) locale(kdiamond:sk) locale(kdiamond:sl) locale(kdiamond:sq) locale(kdiamond:sr) locale(kdiamond:sr@ijekavian) locale(kdiamond:sr@ijekavianlatin) locale(kdiamond:sr@latin) locale(kdiamond:sv) locale(kdiamond:th) locale(kdiamond:tr) locale(kdiamond:ug) locale(kdiamond:uk) locale(kdiamond:zh_CN) locale(kdiamond:zh_TW)"
RDEPENDS:${PN} += "kdiamond"

inherit rpm
