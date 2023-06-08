SUMMARY = "Translations for package nemo"
DESCRIPTION = "Provides translations for the 'nemo' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.1"

RPM_NAME = "nemo-lang-5.6.1-1.2.noarch.rpm"
RPM_HASH = "153e2fb604dd595e244be9116f5dffe1dc0b81431fb54870cb99547ec068e6932e6c4e61f8b2748ec38ce702144a4a4b2e09150fae1b30609cbe7ce53fa8d5b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(nemo:af) locale(nemo:ar) locale(nemo:as) locale(nemo:ast) locale(nemo:az) locale(nemo:be) locale(nemo:bg) locale(nemo:bn) locale(nemo:bs) locale(nemo:ca) locale(nemo:ca@valencia) locale(nemo:cs) locale(nemo:cy) locale(nemo:da) locale(nemo:de) locale(nemo:el) locale(nemo:en_AU) locale(nemo:en_CA) locale(nemo:en_GB) locale(nemo:eo) locale(nemo:es) locale(nemo:et) locale(nemo:eu) locale(nemo:fa) locale(nemo:fi) locale(nemo:fr) locale(nemo:fr_CA) locale(nemo:ga) locale(nemo:gd) locale(nemo:gl) locale(nemo:he) locale(nemo:hi) locale(nemo:hr) locale(nemo:hu) locale(nemo:ia) locale(nemo:id) locale(nemo:is) locale(nemo:it) locale(nemo:ja) locale(nemo:ka) locale(nemo:kk) locale(nemo:km) locale(nemo:kn) locale(nemo:ko) locale(nemo:lt) locale(nemo:lv) locale(nemo:ml) locale(nemo:mr) locale(nemo:ms) locale(nemo:nb) locale(nemo:nds) locale(nemo:ne) locale(nemo:nl) locale(nemo:nn) locale(nemo:oc) locale(nemo:pa) locale(nemo:pl) locale(nemo:pt) locale(nemo:pt_BR) locale(nemo:ro) locale(nemo:ru) locale(nemo:si) locale(nemo:sk) locale(nemo:sl) locale(nemo:sq) locale(nemo:sr) locale(nemo:sr@latin) locale(nemo:sv) locale(nemo:ta) locale(nemo:th) locale(nemo:tr) locale(nemo:uk) locale(nemo:vi) locale(nemo:zh_CN) locale(nemo:zh_HK) locale(nemo:zh_TW) nemo-lang nemo-lang-all"
RDEPENDS:${PN} += "nemo"

inherit rpm
