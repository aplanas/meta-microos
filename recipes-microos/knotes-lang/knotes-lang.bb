SUMMARY = "Translations for package knotes"
DESCRIPTION = "Provides translations for the 'knotes' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "knotes-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "2caf1983dae372c47c006bcfdcc2b46eb87602375689ea7947c8fb1a06c3b66f8d1d053ff09af506f8ee0dc4487ba72286fcdbc649cf1af827f005b0259c4f79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "knotes-lang knotes-lang-all locale(knotes:af) locale(knotes:ar) locale(knotes:be) locale(knotes:bg) locale(knotes:br) locale(knotes:bs) locale(knotes:ca) locale(knotes:ca@valencia) locale(knotes:cs) locale(knotes:cy) locale(knotes:da) locale(knotes:de) locale(knotes:el) locale(knotes:en_GB) locale(knotes:eo) locale(knotes:es) locale(knotes:et) locale(knotes:eu) locale(knotes:fa) locale(knotes:fi) locale(knotes:fr) locale(knotes:ga) locale(knotes:gl) locale(knotes:he) locale(knotes:hi) locale(knotes:hr) locale(knotes:hu) locale(knotes:ia) locale(knotes:is) locale(knotes:it) locale(knotes:ja) locale(knotes:ka) locale(knotes:kk) locale(knotes:km) locale(knotes:ko) locale(knotes:lt) locale(knotes:lv) locale(knotes:mai) locale(knotes:mk) locale(knotes:mr) locale(knotes:ms) locale(knotes:nb) locale(knotes:nds) locale(knotes:ne) locale(knotes:nl) locale(knotes:nn) locale(knotes:pa) locale(knotes:pl) locale(knotes:pt) locale(knotes:pt_BR) locale(knotes:ro) locale(knotes:ru) locale(knotes:si) locale(knotes:sk) locale(knotes:sl) locale(knotes:sq) locale(knotes:sr) locale(knotes:sr@ijekavian) locale(knotes:sr@ijekavianlatin) locale(knotes:sr@latin) locale(knotes:sv) locale(knotes:ta) locale(knotes:th) locale(knotes:tr) locale(knotes:ug) locale(knotes:uk) locale(knotes:zh_CN) locale(knotes:zh_TW)"
RDEPENDS:${PN} += "knotes"

inherit rpm
