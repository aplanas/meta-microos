SUMMARY = "Translations for package kdialog"
DESCRIPTION = "Provides translations for the 'kdialog' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdialog-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "6d176bca44a2b0b67258e9627643cffaf97a44efd970c5aeb76fedf41c62fb438c3961603e4ba12ce73cb454d70ee73083816fab34252f11534ae090d50e0883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdialog-lang kdialog-lang-all locale(kdialog:af) locale(kdialog:ar) locale(kdialog:be) locale(kdialog:be@latin) locale(kdialog:bg) locale(kdialog:bn) locale(kdialog:bn_IN) locale(kdialog:br) locale(kdialog:bs) locale(kdialog:ca) locale(kdialog:ca@valencia) locale(kdialog:cs) locale(kdialog:cy) locale(kdialog:da) locale(kdialog:de) locale(kdialog:el) locale(kdialog:en_GB) locale(kdialog:eo) locale(kdialog:es) locale(kdialog:et) locale(kdialog:eu) locale(kdialog:fa) locale(kdialog:fi) locale(kdialog:fr) locale(kdialog:ga) locale(kdialog:gl) locale(kdialog:gu) locale(kdialog:he) locale(kdialog:hi) locale(kdialog:hr) locale(kdialog:hu) locale(kdialog:ia) locale(kdialog:id) locale(kdialog:is) locale(kdialog:it) locale(kdialog:ja) locale(kdialog:ka) locale(kdialog:kk) locale(kdialog:km) locale(kdialog:kn) locale(kdialog:ko) locale(kdialog:lt) locale(kdialog:lv) locale(kdialog:mai) locale(kdialog:mk) locale(kdialog:ml) locale(kdialog:mr) locale(kdialog:ms) locale(kdialog:nb) locale(kdialog:nds) locale(kdialog:ne) locale(kdialog:nl) locale(kdialog:nn) locale(kdialog:oc) locale(kdialog:or) locale(kdialog:pa) locale(kdialog:pl) locale(kdialog:pt) locale(kdialog:pt_BR) locale(kdialog:ro) locale(kdialog:ru) locale(kdialog:si) locale(kdialog:sk) locale(kdialog:sl) locale(kdialog:sq) locale(kdialog:sr) locale(kdialog:sr@ijekavian) locale(kdialog:sr@ijekavianlatin) locale(kdialog:sr@latin) locale(kdialog:sv) locale(kdialog:ta) locale(kdialog:te) locale(kdialog:th) locale(kdialog:tr) locale(kdialog:ug) locale(kdialog:uk) locale(kdialog:vi) locale(kdialog:wa) locale(kdialog:zh_CN) locale(kdialog:zh_TW)"
RDEPENDS:${PN} += "kdialog"

inherit rpm
