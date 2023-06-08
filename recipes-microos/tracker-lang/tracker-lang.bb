SUMMARY = "Translations for package tracker"
DESCRIPTION = "Provides translations for the 'tracker' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "tracker-lang-3.5.1-1.1.noarch.rpm"
RPM_HASH = "292c1e22fcb87c5b3bf86d254429cc00303752afbfdcd8b7bb3afc1c66cb6c2c07bda3c8768c434c75612e1d397c9fa93dc15391f71016d9f378f6fb2b72653b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tracker:ar) locale(tracker:as) locale(tracker:be) locale(tracker:be@latin) locale(tracker:bg) locale(tracker:bs) locale(tracker:ca) locale(tracker:ca@valencia) locale(tracker:cs) locale(tracker:da) locale(tracker:de) locale(tracker:dz) locale(tracker:el) locale(tracker:en_GB) locale(tracker:eo) locale(tracker:es) locale(tracker:et) locale(tracker:eu) locale(tracker:fi) locale(tracker:fr) locale(tracker:fur) locale(tracker:gl) locale(tracker:he) locale(tracker:hr) locale(tracker:hu) locale(tracker:id) locale(tracker:is) locale(tracker:it) locale(tracker:ja) locale(tracker:ka) locale(tracker:kk) locale(tracker:ko) locale(tracker:lt) locale(tracker:lv) locale(tracker:mk) locale(tracker:ml) locale(tracker:ms) locale(tracker:nb) locale(tracker:nds) locale(tracker:ne) locale(tracker:nl) locale(tracker:oc) locale(tracker:pa) locale(tracker:pl) locale(tracker:pt) locale(tracker:pt_BR) locale(tracker:ro) locale(tracker:ru) locale(tracker:sk) locale(tracker:sl) locale(tracker:sr) locale(tracker:sr@latin) locale(tracker:sv) locale(tracker:te) locale(tracker:th) locale(tracker:tr) locale(tracker:uk) locale(tracker:vi) locale(tracker:zh_CN) locale(tracker:zh_HK) locale(tracker:zh_TW) tracker-lang tracker-lang-all"
RDEPENDS:${PN} += "tracker"

inherit rpm
