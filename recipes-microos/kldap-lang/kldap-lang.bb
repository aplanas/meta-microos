SUMMARY = "Translations for package kldap"
DESCRIPTION = "Provides translations for the 'kldap' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kldap-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "ab77dd8f15bdacea7e95ba94c978b8ee8d4ab1964e58e2ae28d2513c8c837626ba57cab208ca9206c7db2097374063fe41d95952fd2406fe1235a7eea451c473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kldap-lang kldap-lang-all locale(kldap:af) locale(kldap:ar) locale(kldap:be) locale(kldap:bg) locale(kldap:bn) locale(kldap:br) locale(kldap:bs) locale(kldap:ca) locale(kldap:ca@valencia) locale(kldap:cs) locale(kldap:cy) locale(kldap:da) locale(kldap:de) locale(kldap:el) locale(kldap:en_GB) locale(kldap:eo) locale(kldap:es) locale(kldap:et) locale(kldap:eu) locale(kldap:fa) locale(kldap:fi) locale(kldap:fr) locale(kldap:ga) locale(kldap:gl) locale(kldap:he) locale(kldap:hi) locale(kldap:hu) locale(kldap:ia) locale(kldap:is) locale(kldap:it) locale(kldap:ja) locale(kldap:ka) locale(kldap:kk) locale(kldap:km) locale(kldap:kn) locale(kldap:ko) locale(kldap:lt) locale(kldap:lv) locale(kldap:mk) locale(kldap:mr) locale(kldap:ms) locale(kldap:nb) locale(kldap:nds) locale(kldap:ne) locale(kldap:nl) locale(kldap:nn) locale(kldap:pa) locale(kldap:pl) locale(kldap:pt) locale(kldap:pt_BR) locale(kldap:ro) locale(kldap:ru) locale(kldap:sk) locale(kldap:sl) locale(kldap:sq) locale(kldap:sr) locale(kldap:sr@ijekavian) locale(kldap:sr@ijekavianlatin) locale(kldap:sr@latin) locale(kldap:sv) locale(kldap:ta) locale(kldap:th) locale(kldap:tr) locale(kldap:ug) locale(kldap:uk) locale(kldap:vi) locale(kldap:zh_CN) locale(kldap:zh_TW)"
RDEPENDS:${PN} += "kldap"

inherit rpm
