SUMMARY = "Translations for package kajongg"
DESCRIPTION = "Provides translations for the 'kajongg' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kajongg-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "fced5ad3a9a4945a8c033351feed09037acf881e2f3fc3ab8cdab70b7651e90ebc6e32c00b00967fecc9ccbbb9af7466f381f2d1fd523dc53070223f8da10ef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kajongg-lang kajongg-lang-all locale(kajongg:ar) locale(kajongg:bg) locale(kajongg:bs) locale(kajongg:ca) locale(kajongg:ca@valencia) locale(kajongg:cs) locale(kajongg:da) locale(kajongg:de) locale(kajongg:el) locale(kajongg:en_GB) locale(kajongg:eo) locale(kajongg:es) locale(kajongg:et) locale(kajongg:eu) locale(kajongg:fi) locale(kajongg:fr) locale(kajongg:ga) locale(kajongg:gl) locale(kajongg:hu) locale(kajongg:is) locale(kajongg:it) locale(kajongg:ja) locale(kajongg:ka) locale(kajongg:kk) locale(kajongg:km) locale(kajongg:lt) locale(kajongg:mai) locale(kajongg:ml) locale(kajongg:mr) locale(kajongg:nb) locale(kajongg:nds) locale(kajongg:nl) locale(kajongg:nn) locale(kajongg:pl) locale(kajongg:pt) locale(kajongg:pt_BR) locale(kajongg:ro) locale(kajongg:ru) locale(kajongg:sk) locale(kajongg:sl) locale(kajongg:sr) locale(kajongg:sr@ijekavian) locale(kajongg:sr@ijekavianlatin) locale(kajongg:sr@latin) locale(kajongg:sv) locale(kajongg:tr) locale(kajongg:ug) locale(kajongg:uk) locale(kajongg:zh_CN) locale(kajongg:zh_TW)"
RDEPENDS:${PN} += "kajongg"

inherit rpm
