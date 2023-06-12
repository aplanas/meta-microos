SUMMARY = "Translations for package ksnakeduel"
DESCRIPTION = "Provides translations for the 'ksnakeduel' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ksnakeduel-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "82a4459f2acf22ccf5dce05448b72f20d138c2d4de594d53a482285ca035885ae73694ba1a877fce96cf1d4402d5687f02435eed58b0615fda2d879daf15af4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksnakeduel-lang ksnakeduel-lang-all locale(ksnakeduel:ar) locale(ksnakeduel:bg) locale(ksnakeduel:bs) locale(ksnakeduel:ca) locale(ksnakeduel:ca@valencia) locale(ksnakeduel:cs) locale(ksnakeduel:da) locale(ksnakeduel:de) locale(ksnakeduel:el) locale(ksnakeduel:en_GB) locale(ksnakeduel:eo) locale(ksnakeduel:es) locale(ksnakeduel:et) locale(ksnakeduel:eu) locale(ksnakeduel:fi) locale(ksnakeduel:fr) locale(ksnakeduel:ga) locale(ksnakeduel:gl) locale(ksnakeduel:hr) locale(ksnakeduel:hu) locale(ksnakeduel:is) locale(ksnakeduel:it) locale(ksnakeduel:ja) locale(ksnakeduel:ka) locale(ksnakeduel:kk) locale(ksnakeduel:km) locale(ksnakeduel:ko) locale(ksnakeduel:lt) locale(ksnakeduel:lv) locale(ksnakeduel:mai) locale(ksnakeduel:ml) locale(ksnakeduel:mr) locale(ksnakeduel:ms) locale(ksnakeduel:nb) locale(ksnakeduel:nds) locale(ksnakeduel:nl) locale(ksnakeduel:nn) locale(ksnakeduel:pl) locale(ksnakeduel:pt) locale(ksnakeduel:pt_BR) locale(ksnakeduel:ro) locale(ksnakeduel:ru) locale(ksnakeduel:sk) locale(ksnakeduel:sl) locale(ksnakeduel:sq) locale(ksnakeduel:sr) locale(ksnakeduel:sr@ijekavian) locale(ksnakeduel:sr@ijekavianlatin) locale(ksnakeduel:sr@latin) locale(ksnakeduel:sv) locale(ksnakeduel:tr) locale(ksnakeduel:ug) locale(ksnakeduel:uk) locale(ksnakeduel:zh_CN) locale(ksnakeduel:zh_TW)"
RDEPENDS:${PN} += "ksnakeduel"

inherit rpm
