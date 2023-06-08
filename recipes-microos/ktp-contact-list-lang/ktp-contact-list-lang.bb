SUMMARY = "Translations for package ktp-contact-list"
DESCRIPTION = "Provides translations for the 'ktp-contact-list' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-contact-list-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "6a437c8e71e4200301788f236f7079e72ff19c194f7d5a0e32110244e8536888463b2a575e1af150f88935e2055cfd0f0919f28dcbdc1dbc322ad904252776d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-contact-list-lang ktp-contact-list-lang-all locale(ktp-contact-list:ar) locale(ktp-contact-list:bs) locale(ktp-contact-list:ca) locale(ktp-contact-list:ca@valencia) locale(ktp-contact-list:cs) locale(ktp-contact-list:da) locale(ktp-contact-list:de) locale(ktp-contact-list:el) locale(ktp-contact-list:en_GB) locale(ktp-contact-list:es) locale(ktp-contact-list:et) locale(ktp-contact-list:eu) locale(ktp-contact-list:fi) locale(ktp-contact-list:fr) locale(ktp-contact-list:ga) locale(ktp-contact-list:gl) locale(ktp-contact-list:hu) locale(ktp-contact-list:ia) locale(ktp-contact-list:it) locale(ktp-contact-list:ja) locale(ktp-contact-list:ka) locale(ktp-contact-list:kk) locale(ktp-contact-list:km) locale(ktp-contact-list:ko) locale(ktp-contact-list:lt) locale(ktp-contact-list:mr) locale(ktp-contact-list:nb) locale(ktp-contact-list:nds) locale(ktp-contact-list:nl) locale(ktp-contact-list:nn) locale(ktp-contact-list:pa) locale(ktp-contact-list:pl) locale(ktp-contact-list:pt) locale(ktp-contact-list:pt_BR) locale(ktp-contact-list:ro) locale(ktp-contact-list:ru) locale(ktp-contact-list:sk) locale(ktp-contact-list:sl) locale(ktp-contact-list:sr) locale(ktp-contact-list:sr@ijekavian) locale(ktp-contact-list:sr@ijekavianlatin) locale(ktp-contact-list:sr@latin) locale(ktp-contact-list:sv) locale(ktp-contact-list:tr) locale(ktp-contact-list:ug) locale(ktp-contact-list:uk) locale(ktp-contact-list:vi) locale(ktp-contact-list:zh_CN) locale(ktp-contact-list:zh_TW)"
RDEPENDS:${PN} += "ktp-contact-list"

inherit rpm
