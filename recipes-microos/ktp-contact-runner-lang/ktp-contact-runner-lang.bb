SUMMARY = "Translations for package ktp-contact-runner"
DESCRIPTION = "Provides translations for the 'ktp-contact-runner' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-contact-runner-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "82504d1b1e46d89f9fe976347ee15e878e363d3a38fc9a1d8450514e1e3ee01d940a3731e0036773ceed2ee59810cb2787d8f15764b1b8d289c52b6dcb4c656a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-contact-runner-lang ktp-contact-runner-lang-all locale(ktp-contact-runner:bs) locale(ktp-contact-runner:ca) locale(ktp-contact-runner:ca@valencia) locale(ktp-contact-runner:cs) locale(ktp-contact-runner:da) locale(ktp-contact-runner:de) locale(ktp-contact-runner:el) locale(ktp-contact-runner:en_GB) locale(ktp-contact-runner:es) locale(ktp-contact-runner:et) locale(ktp-contact-runner:eu) locale(ktp-contact-runner:fi) locale(ktp-contact-runner:fr) locale(ktp-contact-runner:ga) locale(ktp-contact-runner:gl) locale(ktp-contact-runner:hu) locale(ktp-contact-runner:ia) locale(ktp-contact-runner:it) locale(ktp-contact-runner:ja) locale(ktp-contact-runner:ka) locale(ktp-contact-runner:kk) locale(ktp-contact-runner:km) locale(ktp-contact-runner:ko) locale(ktp-contact-runner:lt) locale(ktp-contact-runner:mr) locale(ktp-contact-runner:nb) locale(ktp-contact-runner:nds) locale(ktp-contact-runner:nl) locale(ktp-contact-runner:nn) locale(ktp-contact-runner:pa) locale(ktp-contact-runner:pl) locale(ktp-contact-runner:pt) locale(ktp-contact-runner:pt_BR) locale(ktp-contact-runner:ro) locale(ktp-contact-runner:ru) locale(ktp-contact-runner:sk) locale(ktp-contact-runner:sl) locale(ktp-contact-runner:sr) locale(ktp-contact-runner:sr@ijekavian) locale(ktp-contact-runner:sr@ijekavianlatin) locale(ktp-contact-runner:sr@latin) locale(ktp-contact-runner:sv) locale(ktp-contact-runner:tr) locale(ktp-contact-runner:ug) locale(ktp-contact-runner:uk) locale(ktp-contact-runner:vi) locale(ktp-contact-runner:zh_CN) locale(ktp-contact-runner:zh_TW)"
RDEPENDS:${PN} += "ktp-contact-runner"

inherit rpm
