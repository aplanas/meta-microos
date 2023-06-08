SUMMARY = "Translations for package kanagram"
DESCRIPTION = "Provides translations for the 'kanagram' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kanagram-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "274cd76443bef9aa4ed5f46bfb85abdf164a46b12e4c67e10f037bae71b9367f4f8207571c9c84c78ad43416b62c7d86cf9fe31f9302a3b9c6eba52f76cebd68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanagram-lang kanagram-lang-all locale(kanagram:ar) locale(kanagram:be) locale(kanagram:bg) locale(kanagram:bn) locale(kanagram:br) locale(kanagram:bs) locale(kanagram:ca) locale(kanagram:ca@valencia) locale(kanagram:cs) locale(kanagram:cy) locale(kanagram:da) locale(kanagram:de) locale(kanagram:el) locale(kanagram:en_GB) locale(kanagram:eo) locale(kanagram:es) locale(kanagram:et) locale(kanagram:eu) locale(kanagram:fa) locale(kanagram:fi) locale(kanagram:fr) locale(kanagram:ga) locale(kanagram:gl) locale(kanagram:gu) locale(kanagram:he) locale(kanagram:hi) locale(kanagram:hr) locale(kanagram:hu) locale(kanagram:id) locale(kanagram:it) locale(kanagram:ja) locale(kanagram:ka) locale(kanagram:kk) locale(kanagram:km) locale(kanagram:ko) locale(kanagram:lt) locale(kanagram:lv) locale(kanagram:mk) locale(kanagram:ml) locale(kanagram:mr) locale(kanagram:ms) locale(kanagram:nb) locale(kanagram:nds) locale(kanagram:ne) locale(kanagram:nl) locale(kanagram:nn) locale(kanagram:oc) locale(kanagram:pa) locale(kanagram:pl) locale(kanagram:pt) locale(kanagram:pt_BR) locale(kanagram:ro) locale(kanagram:ru) locale(kanagram:si) locale(kanagram:sk) locale(kanagram:sl) locale(kanagram:sq) locale(kanagram:sv) locale(kanagram:tr) locale(kanagram:ug) locale(kanagram:uk) locale(kanagram:zh_CN) locale(kanagram:zh_TW)"
RDEPENDS:${PN} += "kanagram"

inherit rpm
