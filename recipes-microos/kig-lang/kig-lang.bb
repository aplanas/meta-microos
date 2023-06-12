SUMMARY = "Translations for package kig"
DESCRIPTION = "Provides translations for the 'kig' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kig-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "c1ef34cb53c113712051d53cae87a8c7c8e3a82bc8cba9780da060bb5f07e62b5a66b053466897dfef93e92c8397a275229c64c401636d219583e82ec567aaa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kig-lang \
kig-lang-all \
locale(kig:ar) \
locale(kig:be) \
locale(kig:bg) \
locale(kig:bn) \
locale(kig:br) \
locale(kig:bs) \
locale(kig:ca) \
locale(kig:ca@valencia) \
locale(kig:cs) \
locale(kig:cy) \
locale(kig:da) \
locale(kig:de) \
locale(kig:el) \
locale(kig:en_GB) \
locale(kig:eo) \
locale(kig:es) \
locale(kig:et) \
locale(kig:eu) \
locale(kig:fa) \
locale(kig:fi) \
locale(kig:fr) \
locale(kig:ga) \
locale(kig:gl) \
locale(kig:hi) \
locale(kig:hr) \
locale(kig:hu) \
locale(kig:is) \
locale(kig:it) \
locale(kig:ja) \
locale(kig:ka) \
locale(kig:kk) \
locale(kig:km) \
locale(kig:lt) \
locale(kig:lv) \
locale(kig:mai) \
locale(kig:mk) \
locale(kig:ml) \
locale(kig:mr) \
locale(kig:ms) \
locale(kig:nb) \
locale(kig:nds) \
locale(kig:ne) \
locale(kig:nl) \
locale(kig:nn) \
locale(kig:oc) \
locale(kig:pa) \
locale(kig:pl) \
locale(kig:pt) \
locale(kig:pt_BR) \
locale(kig:ro) \
locale(kig:ru) \
locale(kig:si) \
locale(kig:sk) \
locale(kig:sl) \
locale(kig:sq) \
locale(kig:sv) \
locale(kig:ta) \
locale(kig:tr) \
locale(kig:ug) \
locale(kig:uk) \
locale(kig:zh_CN) \
locale(kig:zh_TW)"
RDEPENDS:${PN} += "kig"

inherit rpm
