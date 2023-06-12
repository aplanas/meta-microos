SUMMARY = "Translations for package kidentitymanagement"
DESCRIPTION = "Provides translations for the 'kidentitymanagement' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kidentitymanagement-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "8f7e63fa6396794a0f94bc2d4336226f90d265b190a5212d915fa186a32dda383cdd1b3b1dfabf97711e1b3490f4c737e753b3259db6a2d14c632f6ffd999d79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kidentitymanagement-lang \
kidentitymanagement-lang-all \
locale(kidentitymanagement:ar) \
locale(kidentitymanagement:az) \
locale(kidentitymanagement:be) \
locale(kidentitymanagement:bs) \
locale(kidentitymanagement:ca) \
locale(kidentitymanagement:ca@valencia) \
locale(kidentitymanagement:cs) \
locale(kidentitymanagement:da) \
locale(kidentitymanagement:de) \
locale(kidentitymanagement:el) \
locale(kidentitymanagement:en_GB) \
locale(kidentitymanagement:eo) \
locale(kidentitymanagement:es) \
locale(kidentitymanagement:et) \
locale(kidentitymanagement:eu) \
locale(kidentitymanagement:fi) \
locale(kidentitymanagement:fr) \
locale(kidentitymanagement:ga) \
locale(kidentitymanagement:gl) \
locale(kidentitymanagement:hi) \
locale(kidentitymanagement:hu) \
locale(kidentitymanagement:ia) \
locale(kidentitymanagement:it) \
locale(kidentitymanagement:ja) \
locale(kidentitymanagement:ka) \
locale(kidentitymanagement:kk) \
locale(kidentitymanagement:km) \
locale(kidentitymanagement:ko) \
locale(kidentitymanagement:lt) \
locale(kidentitymanagement:lv) \
locale(kidentitymanagement:mr) \
locale(kidentitymanagement:nb) \
locale(kidentitymanagement:nds) \
locale(kidentitymanagement:nl) \
locale(kidentitymanagement:nn) \
locale(kidentitymanagement:pa) \
locale(kidentitymanagement:pl) \
locale(kidentitymanagement:pt) \
locale(kidentitymanagement:pt_BR) \
locale(kidentitymanagement:ro) \
locale(kidentitymanagement:ru) \
locale(kidentitymanagement:sk) \
locale(kidentitymanagement:sl) \
locale(kidentitymanagement:sq) \
locale(kidentitymanagement:sr) \
locale(kidentitymanagement:sr@ijekavian) \
locale(kidentitymanagement:sr@ijekavianlatin) \
locale(kidentitymanagement:sr@latin) \
locale(kidentitymanagement:sv) \
locale(kidentitymanagement:th) \
locale(kidentitymanagement:tr) \
locale(kidentitymanagement:ug) \
locale(kidentitymanagement:uk) \
locale(kidentitymanagement:zh_CN) \
locale(kidentitymanagement:zh_TW)"
RDEPENDS:${PN} += "kidentitymanagement"

inherit rpm
