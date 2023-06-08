SUMMARY = "Translations for package kompare"
DESCRIPTION = "Provides translations for the 'kompare' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.0"

RPM_NAME = "kompare-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "7b2a1f155a0144ff92ca9695f9204b6c55d7fe11bf1e83595325ac906648abecca3591b0497c958751b14ea05b9911dde2e019cf93efbd36c301a8c731daa87d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kompare-lang kompare-lang-all locale(kompare:af) locale(kompare:ar) locale(kompare:be) locale(kompare:bg) locale(kompare:br) locale(kompare:bs) locale(kompare:ca) locale(kompare:ca@valencia) locale(kompare:cs) locale(kompare:cy) locale(kompare:da) locale(kompare:de) locale(kompare:el) locale(kompare:en_GB) locale(kompare:eo) locale(kompare:es) locale(kompare:et) locale(kompare:eu) locale(kompare:fa) locale(kompare:fi) locale(kompare:fr) locale(kompare:ga) locale(kompare:gl) locale(kompare:hi) locale(kompare:hr) locale(kompare:hu) locale(kompare:is) locale(kompare:it) locale(kompare:ja) locale(kompare:ka) locale(kompare:kk) locale(kompare:km) locale(kompare:ko) locale(kompare:lt) locale(kompare:lv) locale(kompare:mai) locale(kompare:mk) locale(kompare:mr) locale(kompare:ms) locale(kompare:nb) locale(kompare:nds) locale(kompare:ne) locale(kompare:nl) locale(kompare:nn) locale(kompare:oc) locale(kompare:pa) locale(kompare:pl) locale(kompare:pt) locale(kompare:pt_BR) locale(kompare:ro) locale(kompare:ru) locale(kompare:sk) locale(kompare:sl) locale(kompare:sq) locale(kompare:sr) locale(kompare:sr@ijekavian) locale(kompare:sr@ijekavianlatin) locale(kompare:sr@latin) locale(kompare:sv) locale(kompare:ta) locale(kompare:tr) locale(kompare:ug) locale(kompare:uk) locale(kompare:zh_CN) locale(kompare:zh_TW)"
RDEPENDS:${PN} += "kompare"

inherit rpm
