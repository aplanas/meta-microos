SUMMARY = "Translations for package juk"
DESCRIPTION = "Provides translations for the 'juk' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "juk-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "af3f99357ed2218f8e04ac3459446f51fde06a5939cce3007746b054478f6fd5c1762b40eb70b6786c8fc32c5f4313e25be3745713eeec5d1c6449aca05cc623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "juk-lang juk-lang-all locale(juk:ar) locale(juk:be) locale(juk:bg) locale(juk:bn) locale(juk:br) locale(juk:bs) locale(juk:ca) locale(juk:ca@valencia) locale(juk:cs) locale(juk:cy) locale(juk:da) locale(juk:de) locale(juk:el) locale(juk:en_GB) locale(juk:eo) locale(juk:es) locale(juk:et) locale(juk:eu) locale(juk:fa) locale(juk:fi) locale(juk:fr) locale(juk:ga) locale(juk:gl) locale(juk:he) locale(juk:hi) locale(juk:hr) locale(juk:hu) locale(juk:ia) locale(juk:id) locale(juk:is) locale(juk:it) locale(juk:ja) locale(juk:ka) locale(juk:kk) locale(juk:km) locale(juk:ko) locale(juk:lt) locale(juk:lv) locale(juk:mk) locale(juk:mr) locale(juk:ms) locale(juk:nb) locale(juk:nds) locale(juk:ne) locale(juk:nl) locale(juk:nn) locale(juk:oc) locale(juk:pa) locale(juk:pl) locale(juk:pt) locale(juk:pt_BR) locale(juk:ro) locale(juk:ru) locale(juk:sk) locale(juk:sl) locale(juk:sq) locale(juk:sr) locale(juk:sr@ijekavian) locale(juk:sr@ijekavianlatin) locale(juk:sr@latin) locale(juk:sv) locale(juk:ta) locale(juk:th) locale(juk:tr) locale(juk:ug) locale(juk:uk) locale(juk:zh_CN) locale(juk:zh_TW)"
RDEPENDS:${PN} += "juk"

inherit rpm
