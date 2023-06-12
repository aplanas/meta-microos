SUMMARY = "Translations for package rocs"
DESCRIPTION = "Provides translations for the 'rocs' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "rocs-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "e66936b5530f78ca4da8003aee994079b865190a0cb89c786721f3457803ea7ec1f8a8108da42ac4d3e75ddbb76d8318b816ab127ba9e1df4f794e87f185e33f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(rocs:ar) locale(rocs:bg) locale(rocs:bs) locale(rocs:ca) locale(rocs:ca@valencia) locale(rocs:cs) locale(rocs:da) locale(rocs:de) locale(rocs:el) locale(rocs:en_GB) locale(rocs:eo) locale(rocs:es) locale(rocs:et) locale(rocs:fi) locale(rocs:fr) locale(rocs:ga) locale(rocs:gl) locale(rocs:hr) locale(rocs:hu) locale(rocs:it) locale(rocs:ja) locale(rocs:ka) locale(rocs:kk) locale(rocs:ko) locale(rocs:lt) locale(rocs:lv) locale(rocs:ml) locale(rocs:mr) locale(rocs:nb) locale(rocs:nds) locale(rocs:nl) locale(rocs:nn) locale(rocs:pa) locale(rocs:pl) locale(rocs:pt) locale(rocs:pt_BR) locale(rocs:ro) locale(rocs:ru) locale(rocs:sk) locale(rocs:sl) locale(rocs:sv) locale(rocs:th) locale(rocs:tr) locale(rocs:ug) locale(rocs:uk) locale(rocs:zh_CN) locale(rocs:zh_TW) rocs-lang rocs-lang-all"
RDEPENDS:${PN} += "rocs"

inherit rpm
