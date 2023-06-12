SUMMARY = "Translations for package kdoctools"
DESCRIPTION = "Provides translations for the 'kdoctools' package."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.106.0"

RPM_NAME = "kdoctools-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "dc0ca33b97b9082836114667ca3f497226a0bc6175f9e799bd747b3ef1e0f081daee5f32941a4f73c8322f2914b2c06ed6576506ec5b7a14842833e9734b4e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdoctools-lang kdoctools-lang-all locale(kdoctools:af) locale(kdoctools:ar) locale(kdoctools:az) locale(kdoctools:be) locale(kdoctools:bg) locale(kdoctools:bn) locale(kdoctools:br) locale(kdoctools:bs) locale(kdoctools:ca) locale(kdoctools:ca@valencia) locale(kdoctools:cs) locale(kdoctools:cy) locale(kdoctools:da) locale(kdoctools:de) locale(kdoctools:el) locale(kdoctools:en_GB) locale(kdoctools:eo) locale(kdoctools:es) locale(kdoctools:et) locale(kdoctools:eu) locale(kdoctools:fa) locale(kdoctools:fi) locale(kdoctools:fr) locale(kdoctools:ga) locale(kdoctools:gd) locale(kdoctools:gl) locale(kdoctools:gu) locale(kdoctools:he) locale(kdoctools:hi) locale(kdoctools:hr) locale(kdoctools:hu) locale(kdoctools:ia) locale(kdoctools:id) locale(kdoctools:is) locale(kdoctools:it) locale(kdoctools:ja) locale(kdoctools:ka) locale(kdoctools:kk) locale(kdoctools:km) locale(kdoctools:kn) locale(kdoctools:ko) locale(kdoctools:lt) locale(kdoctools:lv) locale(kdoctools:mai) locale(kdoctools:mk) locale(kdoctools:ml) locale(kdoctools:mr) locale(kdoctools:ms) locale(kdoctools:nb) locale(kdoctools:nds) locale(kdoctools:ne) locale(kdoctools:nl) locale(kdoctools:nn) locale(kdoctools:oc) locale(kdoctools:pa) locale(kdoctools:pl) locale(kdoctools:pt) locale(kdoctools:pt_BR) locale(kdoctools:ro) locale(kdoctools:ru) locale(kdoctools:sk) locale(kdoctools:sl) locale(kdoctools:sq) locale(kdoctools:sr) locale(kdoctools:sr@ijekavian) locale(kdoctools:sr@ijekavianlatin) locale(kdoctools:sr@latin) locale(kdoctools:sv) locale(kdoctools:ta) locale(kdoctools:th) locale(kdoctools:tr) locale(kdoctools:ug) locale(kdoctools:uk) locale(kdoctools:vi) locale(kdoctools:zh_CN) locale(kdoctools:zh_TW)"
RDEPENDS:${PN} += "kdoctools"

inherit rpm
