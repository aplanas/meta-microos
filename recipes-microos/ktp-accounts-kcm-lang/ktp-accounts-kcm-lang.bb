SUMMARY = "Translations for package ktp-accounts-kcm"
DESCRIPTION = "Provides translations for the 'ktp-accounts-kcm' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-accounts-kcm-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "cadab08eedf4db6ffef8606cf8b8d42eddb4abd40325bf7f361c7e16c134e44239ebc475a5891dca87f51f7345acfc59b0189e7cbc93405d15d7455a8589c25a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-accounts-kcm-lang ktp-accounts-kcm-lang-all locale(ktp-accounts-kcm:ar) locale(ktp-accounts-kcm:bs) locale(ktp-accounts-kcm:ca) locale(ktp-accounts-kcm:ca@valencia) locale(ktp-accounts-kcm:cs) locale(ktp-accounts-kcm:da) locale(ktp-accounts-kcm:de) locale(ktp-accounts-kcm:el) locale(ktp-accounts-kcm:en_GB) locale(ktp-accounts-kcm:eo) locale(ktp-accounts-kcm:es) locale(ktp-accounts-kcm:et) locale(ktp-accounts-kcm:eu) locale(ktp-accounts-kcm:fi) locale(ktp-accounts-kcm:fr) locale(ktp-accounts-kcm:ga) locale(ktp-accounts-kcm:gl) locale(ktp-accounts-kcm:hu) locale(ktp-accounts-kcm:ia) locale(ktp-accounts-kcm:it) locale(ktp-accounts-kcm:ja) locale(ktp-accounts-kcm:ka) locale(ktp-accounts-kcm:kk) locale(ktp-accounts-kcm:km) locale(ktp-accounts-kcm:ko) locale(ktp-accounts-kcm:lt) locale(ktp-accounts-kcm:mai) locale(ktp-accounts-kcm:mr) locale(ktp-accounts-kcm:nb) locale(ktp-accounts-kcm:nds) locale(ktp-accounts-kcm:nl) locale(ktp-accounts-kcm:nn) locale(ktp-accounts-kcm:pa) locale(ktp-accounts-kcm:pl) locale(ktp-accounts-kcm:pt) locale(ktp-accounts-kcm:pt_BR) locale(ktp-accounts-kcm:ro) locale(ktp-accounts-kcm:ru) locale(ktp-accounts-kcm:sk) locale(ktp-accounts-kcm:sl) locale(ktp-accounts-kcm:sr) locale(ktp-accounts-kcm:sr@ijekavian) locale(ktp-accounts-kcm:sr@ijekavianlatin) locale(ktp-accounts-kcm:sr@latin) locale(ktp-accounts-kcm:sv) locale(ktp-accounts-kcm:tr) locale(ktp-accounts-kcm:ug) locale(ktp-accounts-kcm:uk) locale(ktp-accounts-kcm:vi) locale(ktp-accounts-kcm:wa) locale(ktp-accounts-kcm:zh_CN) locale(ktp-accounts-kcm:zh_TW)"
RDEPENDS:${PN} += "ktp-accounts-kcm"

inherit rpm
