SUMMARY = "Translations for package kmag"
DESCRIPTION = "Provides translations for the 'kmag' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "kmag-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "e391029a65ae79cfccad81d3b3e969e49a362bb4e7f2821423dc3a0a329e50fe56450707db2822e233543950e35111a3537d8884c638fd658f6dff3d0385bc90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmag-lang kmag-lang-all locale(kmag:ar) locale(kmag:be) locale(kmag:bg) locale(kmag:br) locale(kmag:bs) locale(kmag:ca) locale(kmag:ca@valencia) locale(kmag:cs) locale(kmag:cy) locale(kmag:da) locale(kmag:de) locale(kmag:el) locale(kmag:en_GB) locale(kmag:eo) locale(kmag:es) locale(kmag:et) locale(kmag:eu) locale(kmag:fa) locale(kmag:fi) locale(kmag:fr) locale(kmag:ga) locale(kmag:gl) locale(kmag:he) locale(kmag:hi) locale(kmag:hr) locale(kmag:hu) locale(kmag:ia) locale(kmag:is) locale(kmag:it) locale(kmag:ja) locale(kmag:ka) locale(kmag:kk) locale(kmag:km) locale(kmag:ko) locale(kmag:lt) locale(kmag:lv) locale(kmag:mk) locale(kmag:ml) locale(kmag:mr) locale(kmag:ms) locale(kmag:nb) locale(kmag:nds) locale(kmag:ne) locale(kmag:nl) locale(kmag:nn) locale(kmag:oc) locale(kmag:pa) locale(kmag:pl) locale(kmag:pt) locale(kmag:pt_BR) locale(kmag:ro) locale(kmag:ru) locale(kmag:sk) locale(kmag:sl) locale(kmag:sq) locale(kmag:sr) locale(kmag:sr@ijekavian) locale(kmag:sr@ijekavianlatin) locale(kmag:sr@latin) locale(kmag:sv) locale(kmag:ta) locale(kmag:th) locale(kmag:tr) locale(kmag:ug) locale(kmag:uk) locale(kmag:vi) locale(kmag:zh_CN) locale(kmag:zh_TW)"
RDEPENDS:${PN} += "kmag"

inherit rpm
