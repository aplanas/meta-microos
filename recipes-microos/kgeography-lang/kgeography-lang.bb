SUMMARY = "Translations for package kgeography"
DESCRIPTION = "Provides translations for the 'kgeography' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kgeography-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "a2feb5899812c82db7402f8fe09516facce73c8985eba985f685f55137aac2d74a9e2c669abfc791a1ca2db7e4af4fec86a9503377d981f68630cd687bf3c194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kgeography-lang \
kgeography-lang-all \
locale(kgeography:ar) \
locale(kgeography:be) \
locale(kgeography:bg) \
locale(kgeography:br) \
locale(kgeography:bs) \
locale(kgeography:ca) \
locale(kgeography:ca@valencia) \
locale(kgeography:cs) \
locale(kgeography:cy) \
locale(kgeography:da) \
locale(kgeography:de) \
locale(kgeography:el) \
locale(kgeography:en_GB) \
locale(kgeography:eo) \
locale(kgeography:es) \
locale(kgeography:et) \
locale(kgeography:eu) \
locale(kgeography:fa) \
locale(kgeography:fi) \
locale(kgeography:fr) \
locale(kgeography:ga) \
locale(kgeography:gl) \
locale(kgeography:gu) \
locale(kgeography:he) \
locale(kgeography:hi) \
locale(kgeography:hr) \
locale(kgeography:hu) \
locale(kgeography:is) \
locale(kgeography:it) \
locale(kgeography:ja) \
locale(kgeography:ka) \
locale(kgeography:kk) \
locale(kgeography:km) \
locale(kgeography:ko) \
locale(kgeography:lt) \
locale(kgeography:lv) \
locale(kgeography:mai) \
locale(kgeography:mk) \
locale(kgeography:ml) \
locale(kgeography:mr) \
locale(kgeography:ms) \
locale(kgeography:nb) \
locale(kgeography:nds) \
locale(kgeography:ne) \
locale(kgeography:nl) \
locale(kgeography:nn) \
locale(kgeography:oc) \
locale(kgeography:pa) \
locale(kgeography:pl) \
locale(kgeography:pt) \
locale(kgeography:pt_BR) \
locale(kgeography:ro) \
locale(kgeography:ru) \
locale(kgeography:si) \
locale(kgeography:sk) \
locale(kgeography:sl) \
locale(kgeography:sq) \
locale(kgeography:sv) \
locale(kgeography:ta) \
locale(kgeography:th) \
locale(kgeography:tr) \
locale(kgeography:ug) \
locale(kgeography:uk) \
locale(kgeography:zh_CN) \
locale(kgeography:zh_TW)"
RDEPENDS:${PN} += "kgeography"

inherit rpm
