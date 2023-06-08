SUMMARY = "Translations for package umbrello"
DESCRIPTION = "Provides translations for the 'umbrello' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "umbrello-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "56e563a94c663371cdd9a71b8e17b40c659d7f337bd2c5d4d74c30807ecc6e55acfca54ab269e27aa219699cf0ab8dff0fbec55a587a2d3124ee3b526865e6ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(umbrello:ar) locale(umbrello:be) locale(umbrello:bg) locale(umbrello:br) locale(umbrello:bs) locale(umbrello:ca) locale(umbrello:ca@valencia) locale(umbrello:cs) locale(umbrello:cy) locale(umbrello:da) locale(umbrello:de) locale(umbrello:el) locale(umbrello:en_GB) locale(umbrello:eo) locale(umbrello:es) locale(umbrello:et) locale(umbrello:eu) locale(umbrello:fa) locale(umbrello:fi) locale(umbrello:fr) locale(umbrello:ga) locale(umbrello:gl) locale(umbrello:hi) locale(umbrello:hr) locale(umbrello:hu) locale(umbrello:ia) locale(umbrello:it) locale(umbrello:ja) locale(umbrello:ka) locale(umbrello:kk) locale(umbrello:km) locale(umbrello:ko) locale(umbrello:lt) locale(umbrello:mai) locale(umbrello:mk) locale(umbrello:mr) locale(umbrello:ms) locale(umbrello:nb) locale(umbrello:nds) locale(umbrello:ne) locale(umbrello:nl) locale(umbrello:nn) locale(umbrello:oc) locale(umbrello:pl) locale(umbrello:pt) locale(umbrello:pt_BR) locale(umbrello:ro) locale(umbrello:ru) locale(umbrello:sk) locale(umbrello:sl) locale(umbrello:sq) locale(umbrello:sv) locale(umbrello:ta) locale(umbrello:th) locale(umbrello:tr) locale(umbrello:ug) locale(umbrello:uk) locale(umbrello:zh_CN) locale(umbrello:zh_TW) umbrello-lang umbrello-lang-all"
RDEPENDS:${PN} += "umbrello"

inherit rpm
