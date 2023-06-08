SUMMARY = "Translations for package kig"
DESCRIPTION = "Provides translations for the 'kig' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kig-lang-23.04.0-1.2.noarch.rpm"
RPM_HASH = "4ab726639a7e3f3218772b6756d54bb6aa78c2bd2fdad0c2b738e0a70c9a287969a96112380a5a0c0e181d03148a9c8a8e7aa0f6b04e2df0e94b0e595d539fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kig-lang kig-lang-all locale(kig:ar) locale(kig:be) locale(kig:bg) locale(kig:bn) locale(kig:br) locale(kig:bs) locale(kig:ca) locale(kig:ca@valencia) locale(kig:cs) locale(kig:cy) locale(kig:da) locale(kig:de) locale(kig:el) locale(kig:en_GB) locale(kig:eo) locale(kig:es) locale(kig:et) locale(kig:eu) locale(kig:fa) locale(kig:fi) locale(kig:fr) locale(kig:ga) locale(kig:gl) locale(kig:hi) locale(kig:hr) locale(kig:hu) locale(kig:is) locale(kig:it) locale(kig:ja) locale(kig:ka) locale(kig:kk) locale(kig:km) locale(kig:lt) locale(kig:lv) locale(kig:mai) locale(kig:mk) locale(kig:ml) locale(kig:mr) locale(kig:ms) locale(kig:nb) locale(kig:nds) locale(kig:ne) locale(kig:nl) locale(kig:nn) locale(kig:oc) locale(kig:pa) locale(kig:pl) locale(kig:pt) locale(kig:pt_BR) locale(kig:ro) locale(kig:ru) locale(kig:si) locale(kig:sk) locale(kig:sl) locale(kig:sq) locale(kig:sv) locale(kig:ta) locale(kig:tr) locale(kig:ug) locale(kig:uk) locale(kig:zh_CN) locale(kig:zh_TW)"
RDEPENDS:${PN} += "kig"

inherit rpm
