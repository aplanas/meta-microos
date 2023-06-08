SUMMARY = "Translations for package lskat"
DESCRIPTION = "Provides translations for the 'lskat' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "lskat-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "832c06c44df7ab22b3386bc31f21d000cb837b7d3ac946af305627c1eba8e735c667583d194686fee69c6591b9ee348a85c1f96f4a387a8e12bcc0a3a4909230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(lskat:af) locale(lskat:ar) locale(lskat:be) locale(lskat:bg) locale(lskat:br) locale(lskat:bs) locale(lskat:ca) locale(lskat:ca@valencia) locale(lskat:cs) locale(lskat:cy) locale(lskat:da) locale(lskat:de) locale(lskat:el) locale(lskat:en_GB) locale(lskat:eo) locale(lskat:es) locale(lskat:et) locale(lskat:eu) locale(lskat:fa) locale(lskat:fi) locale(lskat:fr) locale(lskat:ga) locale(lskat:gl) locale(lskat:he) locale(lskat:hi) locale(lskat:hr) locale(lskat:hu) locale(lskat:id) locale(lskat:is) locale(lskat:it) locale(lskat:ja) locale(lskat:ka) locale(lskat:kk) locale(lskat:km) locale(lskat:ko) locale(lskat:lt) locale(lskat:lv) locale(lskat:mai) locale(lskat:mk) locale(lskat:ml) locale(lskat:mr) locale(lskat:ms) locale(lskat:nb) locale(lskat:nds) locale(lskat:ne) locale(lskat:nl) locale(lskat:nn) locale(lskat:oc) locale(lskat:pa) locale(lskat:pl) locale(lskat:pt) locale(lskat:pt_BR) locale(lskat:ro) locale(lskat:ru) locale(lskat:sk) locale(lskat:sl) locale(lskat:sq) locale(lskat:sr) locale(lskat:sr@ijekavian) locale(lskat:sr@ijekavianlatin) locale(lskat:sr@latin) locale(lskat:sv) locale(lskat:ta) locale(lskat:tr) locale(lskat:ug) locale(lskat:uk) locale(lskat:zh_CN) locale(lskat:zh_TW) lskat-lang lskat-lang-all"
RDEPENDS:${PN} += "lskat"

inherit rpm
