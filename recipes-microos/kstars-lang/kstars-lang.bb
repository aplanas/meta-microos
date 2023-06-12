SUMMARY = "Translations for package kstars"
DESCRIPTION = "Provides translations for the 'kstars' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "3.6.4"

RPM_NAME = "kstars-lang-3.6.4-1.1.noarch.rpm"
RPM_HASH = "075512c381de809324f0b77364611cba00e7d8e279ac1f20b97d3fe616075b8a773f6a0189eea5453d3eefb5bd135a3126846953c4566eb8e3d0fe8ab32258e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kstars-lang \
kstars-lang-all \
locale(kstars:af) \
locale(kstars:ar) \
locale(kstars:az) \
locale(kstars:be) \
locale(kstars:bg) \
locale(kstars:bn) \
locale(kstars:br) \
locale(kstars:bs) \
locale(kstars:ca) \
locale(kstars:ca@valencia) \
locale(kstars:cs) \
locale(kstars:cy) \
locale(kstars:da) \
locale(kstars:de) \
locale(kstars:el) \
locale(kstars:en_GB) \
locale(kstars:eo) \
locale(kstars:es) \
locale(kstars:et) \
locale(kstars:eu) \
locale(kstars:fa) \
locale(kstars:fi) \
locale(kstars:fr) \
locale(kstars:ga) \
locale(kstars:gl) \
locale(kstars:gu) \
locale(kstars:hi) \
locale(kstars:hr) \
locale(kstars:hu) \
locale(kstars:is) \
locale(kstars:it) \
locale(kstars:ja) \
locale(kstars:ka) \
locale(kstars:kk) \
locale(kstars:km) \
locale(kstars:ko) \
locale(kstars:lt) \
locale(kstars:lv) \
locale(kstars:mai) \
locale(kstars:mk) \
locale(kstars:ml) \
locale(kstars:mr) \
locale(kstars:ms) \
locale(kstars:nb) \
locale(kstars:nds) \
locale(kstars:ne) \
locale(kstars:nl) \
locale(kstars:nn) \
locale(kstars:oc) \
locale(kstars:pa) \
locale(kstars:pl) \
locale(kstars:pt) \
locale(kstars:pt_BR) \
locale(kstars:ro) \
locale(kstars:ru) \
locale(kstars:si) \
locale(kstars:sk) \
locale(kstars:sl) \
locale(kstars:sq) \
locale(kstars:sv) \
locale(kstars:ta) \
locale(kstars:th) \
locale(kstars:tr) \
locale(kstars:ug) \
locale(kstars:uk) \
locale(kstars:zh_CN) \
locale(kstars:zh_TW)"
RDEPENDS:${PN} += "kstars"

inherit rpm
