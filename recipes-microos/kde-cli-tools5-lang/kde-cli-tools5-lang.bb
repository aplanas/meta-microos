SUMMARY = "Translations for package kde-cli-tools5"
DESCRIPTION = "Provides translations for the 'kde-cli-tools5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "kde-cli-tools5-lang-5.27.4-1.1.noarch.rpm"
RPM_HASH = "ff4aca87b4b7477aa7a092c985c5c9863ef2cb11f31cc9ad22a3a6056ca06235316850f847f2121ed9e826b6de5f5162888ec8a2d6ef54ce7effac7556068a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kde-cli-tools5-lang kde-cli-tools5-lang-all locale(kde-cli-tools5:af) locale(kde-cli-tools5:ar) locale(kde-cli-tools5:ast) locale(kde-cli-tools5:az) locale(kde-cli-tools5:be) locale(kde-cli-tools5:be@latin) locale(kde-cli-tools5:bg) locale(kde-cli-tools5:bn) locale(kde-cli-tools5:bn_IN) locale(kde-cli-tools5:br) locale(kde-cli-tools5:bs) locale(kde-cli-tools5:ca) locale(kde-cli-tools5:ca@valencia) locale(kde-cli-tools5:cs) locale(kde-cli-tools5:cy) locale(kde-cli-tools5:da) locale(kde-cli-tools5:de) locale(kde-cli-tools5:el) locale(kde-cli-tools5:en_GB) locale(kde-cli-tools5:eo) locale(kde-cli-tools5:es) locale(kde-cli-tools5:et) locale(kde-cli-tools5:eu) locale(kde-cli-tools5:fa) locale(kde-cli-tools5:fi) locale(kde-cli-tools5:fr) locale(kde-cli-tools5:ga) locale(kde-cli-tools5:gl) locale(kde-cli-tools5:gu) locale(kde-cli-tools5:he) locale(kde-cli-tools5:hi) locale(kde-cli-tools5:hr) locale(kde-cli-tools5:hu) locale(kde-cli-tools5:ia) locale(kde-cli-tools5:id) locale(kde-cli-tools5:is) locale(kde-cli-tools5:it) locale(kde-cli-tools5:ja) locale(kde-cli-tools5:ka) locale(kde-cli-tools5:kk) locale(kde-cli-tools5:km) locale(kde-cli-tools5:kn) locale(kde-cli-tools5:ko) locale(kde-cli-tools5:lt) locale(kde-cli-tools5:lv) locale(kde-cli-tools5:mai) locale(kde-cli-tools5:mk) locale(kde-cli-tools5:ml) locale(kde-cli-tools5:mr) locale(kde-cli-tools5:ms) locale(kde-cli-tools5:nb) locale(kde-cli-tools5:nds) locale(kde-cli-tools5:ne) locale(kde-cli-tools5:nl) locale(kde-cli-tools5:nn) locale(kde-cli-tools5:oc) locale(kde-cli-tools5:pa) locale(kde-cli-tools5:pl) locale(kde-cli-tools5:pt) locale(kde-cli-tools5:pt_BR) locale(kde-cli-tools5:ro) locale(kde-cli-tools5:ru) locale(kde-cli-tools5:si) locale(kde-cli-tools5:sk) locale(kde-cli-tools5:sl) locale(kde-cli-tools5:sq) locale(kde-cli-tools5:sr) locale(kde-cli-tools5:sr@ijekavian) locale(kde-cli-tools5:sr@ijekavianlatin) locale(kde-cli-tools5:sr@latin) locale(kde-cli-tools5:sv) locale(kde-cli-tools5:ta) locale(kde-cli-tools5:te) locale(kde-cli-tools5:th) locale(kde-cli-tools5:tr) locale(kde-cli-tools5:ug) locale(kde-cli-tools5:uk) locale(kde-cli-tools5:vi) locale(kde-cli-tools5:wa) locale(kde-cli-tools5:zh_CN) locale(kde-cli-tools5:zh_TW)"
RDEPENDS:${PN} += "kde-cli-tools5"

inherit rpm
