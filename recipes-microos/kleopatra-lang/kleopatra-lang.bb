SUMMARY = "Translations for package kleopatra"
DESCRIPTION = "Provides translations for the 'kleopatra' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kleopatra-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "b2e9aea29f12f4c590a6be1d29c47fe26abbb968992544289b224e00132f30971545420a6628bcbbffe9be01f6c477d51bb3945e793727718dd7282105c1feb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kleopatra-lang kleopatra-lang-all locale(kleopatra:af) locale(kleopatra:ar) locale(kleopatra:be) locale(kleopatra:bg) locale(kleopatra:br) locale(kleopatra:bs) locale(kleopatra:ca) locale(kleopatra:ca@valencia) locale(kleopatra:cs) locale(kleopatra:cy) locale(kleopatra:da) locale(kleopatra:de) locale(kleopatra:el) locale(kleopatra:en_GB) locale(kleopatra:eo) locale(kleopatra:es) locale(kleopatra:et) locale(kleopatra:eu) locale(kleopatra:fa) locale(kleopatra:fi) locale(kleopatra:fr) locale(kleopatra:ga) locale(kleopatra:gl) locale(kleopatra:he) locale(kleopatra:hi) locale(kleopatra:hr) locale(kleopatra:hu) locale(kleopatra:ia) locale(kleopatra:is) locale(kleopatra:it) locale(kleopatra:ja) locale(kleopatra:ka) locale(kleopatra:kk) locale(kleopatra:km) locale(kleopatra:ko) locale(kleopatra:lt) locale(kleopatra:lv) locale(kleopatra:mk) locale(kleopatra:mr) locale(kleopatra:ms) locale(kleopatra:nb) locale(kleopatra:nds) locale(kleopatra:ne) locale(kleopatra:nl) locale(kleopatra:nn) locale(kleopatra:pa) locale(kleopatra:pl) locale(kleopatra:pt) locale(kleopatra:pt_BR) locale(kleopatra:ro) locale(kleopatra:ru) locale(kleopatra:sk) locale(kleopatra:sl) locale(kleopatra:sq) locale(kleopatra:sr) locale(kleopatra:sr@ijekavian) locale(kleopatra:sr@ijekavianlatin) locale(kleopatra:sr@latin) locale(kleopatra:sv) locale(kleopatra:ta) locale(kleopatra:th) locale(kleopatra:tr) locale(kleopatra:ug) locale(kleopatra:uk) locale(kleopatra:zh_CN) locale(kleopatra:zh_TW)"
RDEPENDS:${PN} += "kleopatra"

inherit rpm
