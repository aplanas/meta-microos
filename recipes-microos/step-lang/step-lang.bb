SUMMARY = "Translations for package step"
DESCRIPTION = "Provides translations for the 'step' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "step-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "22ca9702b6e975fb33de44d5d4fd7b6e5779d18d29f96dc25a15da8590d902a93e2d21081aec33b120ed84ac19cb8bd59fd066e2a0f795dba28d13493ba41b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(step:ar) \
locale(step:be) \
locale(step:bg) \
locale(step:bs) \
locale(step:ca) \
locale(step:ca@valencia) \
locale(step:cs) \
locale(step:da) \
locale(step:de) \
locale(step:el) \
locale(step:en_GB) \
locale(step:eo) \
locale(step:es) \
locale(step:et) \
locale(step:eu) \
locale(step:fi) \
locale(step:fr) \
locale(step:ga) \
locale(step:gl) \
locale(step:gu) \
locale(step:hr) \
locale(step:hu) \
locale(step:ia) \
locale(step:it) \
locale(step:ja) \
locale(step:ka) \
locale(step:kk) \
locale(step:km) \
locale(step:ko) \
locale(step:lt) \
locale(step:lv) \
locale(step:mai) \
locale(step:ml) \
locale(step:mr) \
locale(step:nb) \
locale(step:nds) \
locale(step:nl) \
locale(step:nn) \
locale(step:oc) \
locale(step:pa) \
locale(step:pl) \
locale(step:pt) \
locale(step:pt_BR) \
locale(step:ro) \
locale(step:ru) \
locale(step:si) \
locale(step:sk) \
locale(step:sl) \
locale(step:sq) \
locale(step:sv) \
locale(step:th) \
locale(step:tr) \
locale(step:ug) \
locale(step:uk) \
locale(step:zh_CN) \
locale(step:zh_TW) \
step-lang \
step-lang-all"
RDEPENDS:${PN} += "step"

inherit rpm
