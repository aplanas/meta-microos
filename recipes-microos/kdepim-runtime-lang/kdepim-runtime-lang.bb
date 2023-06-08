SUMMARY = "Translations for package kdepim-runtime"
DESCRIPTION = "Provides translations for the 'kdepim-runtime' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdepim-runtime-lang-23.04.0-2.1.noarch.rpm"
RPM_HASH = "c19c73462c25c5837b54222d9249b0e47478ce1d4e7e03db11b13d9b1f3cee9041380daddaa19fb81dee0c9c5ca0dc0e3f4e41f7f39e665c08250370d5912099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdepim-runtime-lang kdepim-runtime-lang-all locale(kdepim-runtime:ar) locale(kdepim-runtime:bg) locale(kdepim-runtime:bs) locale(kdepim-runtime:ca) locale(kdepim-runtime:ca@valencia) locale(kdepim-runtime:cs) locale(kdepim-runtime:da) locale(kdepim-runtime:de) locale(kdepim-runtime:el) locale(kdepim-runtime:en_GB) locale(kdepim-runtime:eo) locale(kdepim-runtime:es) locale(kdepim-runtime:et) locale(kdepim-runtime:eu) locale(kdepim-runtime:fi) locale(kdepim-runtime:fr) locale(kdepim-runtime:ga) locale(kdepim-runtime:gl) locale(kdepim-runtime:he) locale(kdepim-runtime:hr) locale(kdepim-runtime:hu) locale(kdepim-runtime:ia) locale(kdepim-runtime:id) locale(kdepim-runtime:it) locale(kdepim-runtime:ja) locale(kdepim-runtime:ka) locale(kdepim-runtime:kk) locale(kdepim-runtime:km) locale(kdepim-runtime:ko) locale(kdepim-runtime:lt) locale(kdepim-runtime:lv) locale(kdepim-runtime:mai) locale(kdepim-runtime:mr) locale(kdepim-runtime:nb) locale(kdepim-runtime:nds) locale(kdepim-runtime:nl) locale(kdepim-runtime:nn) locale(kdepim-runtime:pa) locale(kdepim-runtime:pl) locale(kdepim-runtime:pt) locale(kdepim-runtime:pt_BR) locale(kdepim-runtime:ro) locale(kdepim-runtime:ru) locale(kdepim-runtime:sk) locale(kdepim-runtime:sl) locale(kdepim-runtime:sq) locale(kdepim-runtime:sr) locale(kdepim-runtime:sr@ijekavian) locale(kdepim-runtime:sr@ijekavianlatin) locale(kdepim-runtime:sr@latin) locale(kdepim-runtime:sv) locale(kdepim-runtime:th) locale(kdepim-runtime:tr) locale(kdepim-runtime:ug) locale(kdepim-runtime:uk) locale(kdepim-runtime:zh_CN) locale(kdepim-runtime:zh_TW)"
RDEPENDS:${PN} += "kdepim-runtime"

inherit rpm
