SUMMARY = "Translations for package kgpg"
DESCRIPTION = "Provides translations for the 'kgpg' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kgpg-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "9df85ba29785d25b02ac05845ff81cbcf2e0f280200b9d5c44c01fd49b77e7e8060561fa221fb8b5d701fa1f160c9b7a18f0d2e4acff72445542463e9e890848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kgpg-lang kgpg-lang-all locale(kgpg:ar) locale(kgpg:be) locale(kgpg:bg) locale(kgpg:br) locale(kgpg:bs) locale(kgpg:ca) locale(kgpg:ca@valencia) locale(kgpg:cs) locale(kgpg:cy) locale(kgpg:da) locale(kgpg:de) locale(kgpg:el) locale(kgpg:en_GB) locale(kgpg:eo) locale(kgpg:es) locale(kgpg:et) locale(kgpg:eu) locale(kgpg:fa) locale(kgpg:fi) locale(kgpg:fr) locale(kgpg:ga) locale(kgpg:gl) locale(kgpg:he) locale(kgpg:hr) locale(kgpg:hu) locale(kgpg:ia) locale(kgpg:id) locale(kgpg:is) locale(kgpg:it) locale(kgpg:ja) locale(kgpg:ka) locale(kgpg:kk) locale(kgpg:km) locale(kgpg:ko) locale(kgpg:lt) locale(kgpg:lv) locale(kgpg:mk) locale(kgpg:mr) locale(kgpg:ms) locale(kgpg:nb) locale(kgpg:nds) locale(kgpg:ne) locale(kgpg:nl) locale(kgpg:nn) locale(kgpg:oc) locale(kgpg:pa) locale(kgpg:pl) locale(kgpg:pt) locale(kgpg:pt_BR) locale(kgpg:ro) locale(kgpg:ru) locale(kgpg:sk) locale(kgpg:sl) locale(kgpg:sq) locale(kgpg:sr) locale(kgpg:sr@ijekavian) locale(kgpg:sr@ijekavianlatin) locale(kgpg:sr@latin) locale(kgpg:sv) locale(kgpg:ta) locale(kgpg:tr) locale(kgpg:ug) locale(kgpg:uk) locale(kgpg:zh_CN) locale(kgpg:zh_TW)"
RDEPENDS:${PN} += "kgpg"

inherit rpm
