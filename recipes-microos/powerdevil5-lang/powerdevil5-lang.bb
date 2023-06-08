SUMMARY = "Translations for package powerdevil5"
DESCRIPTION = "Provides translations for the 'powerdevil5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "powerdevil5-lang-5.27.4-2.1.noarch.rpm"
RPM_HASH = "48ce0799734a13b679f5993449c6609405bd45620711afa76c9aa504658d99fe19ee99ced53662c4f4d37830b08fa524eedb0a9c669a1590f964f459a04dffb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(powerdevil5:ar) locale(powerdevil5:as) locale(powerdevil5:az) locale(powerdevil5:be) locale(powerdevil5:be@latin) locale(powerdevil5:bg) locale(powerdevil5:bn) locale(powerdevil5:bn_IN) locale(powerdevil5:bs) locale(powerdevil5:ca) locale(powerdevil5:ca@valencia) locale(powerdevil5:cs) locale(powerdevil5:da) locale(powerdevil5:de) locale(powerdevil5:el) locale(powerdevil5:en_GB) locale(powerdevil5:eo) locale(powerdevil5:es) locale(powerdevil5:et) locale(powerdevil5:eu) locale(powerdevil5:fi) locale(powerdevil5:fr) locale(powerdevil5:ga) locale(powerdevil5:gl) locale(powerdevil5:gu) locale(powerdevil5:he) locale(powerdevil5:hi) locale(powerdevil5:hr) locale(powerdevil5:hu) locale(powerdevil5:ia) locale(powerdevil5:id) locale(powerdevil5:it) locale(powerdevil5:ja) locale(powerdevil5:ka) locale(powerdevil5:kk) locale(powerdevil5:km) locale(powerdevil5:ko) locale(powerdevil5:lt) locale(powerdevil5:lv) locale(powerdevil5:mai) locale(powerdevil5:ml) locale(powerdevil5:mr) locale(powerdevil5:ms) locale(powerdevil5:nb) locale(powerdevil5:nds) locale(powerdevil5:nl) locale(powerdevil5:nn) locale(powerdevil5:pa) locale(powerdevil5:pl) locale(powerdevil5:pt) locale(powerdevil5:pt_BR) locale(powerdevil5:ro) locale(powerdevil5:ru) locale(powerdevil5:si) locale(powerdevil5:sk) locale(powerdevil5:sl) locale(powerdevil5:sq) locale(powerdevil5:sr) locale(powerdevil5:sr@ijekavian) locale(powerdevil5:sr@ijekavianlatin) locale(powerdevil5:sr@latin) locale(powerdevil5:sv) locale(powerdevil5:ta) locale(powerdevil5:te) locale(powerdevil5:th) locale(powerdevil5:tr) locale(powerdevil5:ug) locale(powerdevil5:uk) locale(powerdevil5:wa) locale(powerdevil5:zh_CN) locale(powerdevil5:zh_TW) powerdevil5-lang powerdevil5-lang-all"
RDEPENDS:${PN} += "powerdevil5"

inherit rpm
