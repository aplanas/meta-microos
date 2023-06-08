SUMMARY = "Translations for package kalarm"
DESCRIPTION = "Provides translations for the 'kalarm' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "kalarm-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "b450dad8cd7ca9b5519f928d044e35fb8af4cd5e3c5266477dec986e3e84648ebc3b3685b0f5943c9260dead185fe0a75e7580e84eb3751234dd73ba44fa2385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalarm-lang kalarm-lang-all locale(kalarm:af) locale(kalarm:ar) locale(kalarm:be) locale(kalarm:bg) locale(kalarm:br) locale(kalarm:bs) locale(kalarm:ca) locale(kalarm:ca@valencia) locale(kalarm:cs) locale(kalarm:cy) locale(kalarm:da) locale(kalarm:de) locale(kalarm:el) locale(kalarm:en_GB) locale(kalarm:eo) locale(kalarm:es) locale(kalarm:et) locale(kalarm:eu) locale(kalarm:fa) locale(kalarm:fi) locale(kalarm:fr) locale(kalarm:ga) locale(kalarm:gl) locale(kalarm:he) locale(kalarm:hi) locale(kalarm:hr) locale(kalarm:hu) locale(kalarm:ia) locale(kalarm:is) locale(kalarm:it) locale(kalarm:ja) locale(kalarm:ka) locale(kalarm:kk) locale(kalarm:km) locale(kalarm:ko) locale(kalarm:lt) locale(kalarm:lv) locale(kalarm:mai) locale(kalarm:mk) locale(kalarm:mr) locale(kalarm:ms) locale(kalarm:nb) locale(kalarm:nds) locale(kalarm:ne) locale(kalarm:nl) locale(kalarm:nn) locale(kalarm:pa) locale(kalarm:pl) locale(kalarm:pt) locale(kalarm:pt_BR) locale(kalarm:ro) locale(kalarm:ru) locale(kalarm:si) locale(kalarm:sk) locale(kalarm:sl) locale(kalarm:sq) locale(kalarm:sr) locale(kalarm:sr@ijekavian) locale(kalarm:sr@ijekavianlatin) locale(kalarm:sr@latin) locale(kalarm:sv) locale(kalarm:ta) locale(kalarm:tr) locale(kalarm:ug) locale(kalarm:uk) locale(kalarm:wa) locale(kalarm:zh_CN) locale(kalarm:zh_TW)"
RDEPENDS:${PN} += "kalarm"

inherit rpm
