SUMMARY = "Translations for package ktimer"
DESCRIPTION = "Provides translations for the 'ktimer' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ktimer-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "db87b10568d9d32ffaa9737929f2fc2dfb33be6820f819c5dfcb9d0bb1de9deca93e48480414429d528f19dc2445bd4f2c6339906ea1908acf139d0d3fdb07c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktimer-lang ktimer-lang-all locale(ktimer:af) locale(ktimer:ar) locale(ktimer:be) locale(ktimer:bg) locale(ktimer:br) locale(ktimer:bs) locale(ktimer:ca) locale(ktimer:ca@valencia) locale(ktimer:cs) locale(ktimer:cy) locale(ktimer:da) locale(ktimer:de) locale(ktimer:el) locale(ktimer:en_GB) locale(ktimer:eo) locale(ktimer:es) locale(ktimer:et) locale(ktimer:eu) locale(ktimer:fa) locale(ktimer:fi) locale(ktimer:fr) locale(ktimer:ga) locale(ktimer:gl) locale(ktimer:he) locale(ktimer:hi) locale(ktimer:hr) locale(ktimer:hu) locale(ktimer:ia) locale(ktimer:id) locale(ktimer:is) locale(ktimer:it) locale(ktimer:ja) locale(ktimer:ka) locale(ktimer:kk) locale(ktimer:km) locale(ktimer:ko) locale(ktimer:lt) locale(ktimer:lv) locale(ktimer:mk) locale(ktimer:mr) locale(ktimer:ms) locale(ktimer:nb) locale(ktimer:nds) locale(ktimer:ne) locale(ktimer:nl) locale(ktimer:nn) locale(ktimer:oc) locale(ktimer:pa) locale(ktimer:pl) locale(ktimer:pt) locale(ktimer:pt_BR) locale(ktimer:ro) locale(ktimer:ru) locale(ktimer:sk) locale(ktimer:sl) locale(ktimer:sq) locale(ktimer:sr) locale(ktimer:sr@ijekavian) locale(ktimer:sr@ijekavianlatin) locale(ktimer:sr@latin) locale(ktimer:sv) locale(ktimer:ta) locale(ktimer:th) locale(ktimer:tr) locale(ktimer:ug) locale(ktimer:uk) locale(ktimer:vi) locale(ktimer:zh_CN) locale(ktimer:zh_TW)"
RDEPENDS:${PN} += "ktimer"

inherit rpm
