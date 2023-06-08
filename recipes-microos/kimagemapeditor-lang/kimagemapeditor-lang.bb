SUMMARY = "Translations for package kimagemapeditor"
DESCRIPTION = "Provides translations for the 'kimagemapeditor' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kimagemapeditor-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "39a825f5c6f67eaa82b6acde41cad9385221e5363a975c8c0c7db5e8d701d9a938f514011a455deff0e567b5f07854cacd9dc57d92baa14c0285392f864187bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kimagemapeditor-lang kimagemapeditor-lang-all locale(kimagemapeditor:ar) locale(kimagemapeditor:be) locale(kimagemapeditor:bg) locale(kimagemapeditor:br) locale(kimagemapeditor:bs) locale(kimagemapeditor:ca) locale(kimagemapeditor:ca@valencia) locale(kimagemapeditor:cs) locale(kimagemapeditor:cy) locale(kimagemapeditor:da) locale(kimagemapeditor:de) locale(kimagemapeditor:el) locale(kimagemapeditor:en_GB) locale(kimagemapeditor:eo) locale(kimagemapeditor:es) locale(kimagemapeditor:et) locale(kimagemapeditor:eu) locale(kimagemapeditor:fa) locale(kimagemapeditor:fi) locale(kimagemapeditor:fr) locale(kimagemapeditor:ga) locale(kimagemapeditor:gl) locale(kimagemapeditor:hi) locale(kimagemapeditor:hr) locale(kimagemapeditor:hu) locale(kimagemapeditor:it) locale(kimagemapeditor:ja) locale(kimagemapeditor:ka) locale(kimagemapeditor:kk) locale(kimagemapeditor:km) locale(kimagemapeditor:ko) locale(kimagemapeditor:lt) locale(kimagemapeditor:lv) locale(kimagemapeditor:mr) locale(kimagemapeditor:ms) locale(kimagemapeditor:nb) locale(kimagemapeditor:nds) locale(kimagemapeditor:ne) locale(kimagemapeditor:nl) locale(kimagemapeditor:nn) locale(kimagemapeditor:oc) locale(kimagemapeditor:pa) locale(kimagemapeditor:pl) locale(kimagemapeditor:pt) locale(kimagemapeditor:pt_BR) locale(kimagemapeditor:ro) locale(kimagemapeditor:ru) locale(kimagemapeditor:sk) locale(kimagemapeditor:sl) locale(kimagemapeditor:sv) locale(kimagemapeditor:ta) locale(kimagemapeditor:tr) locale(kimagemapeditor:ug) locale(kimagemapeditor:uk) locale(kimagemapeditor:zh_CN) locale(kimagemapeditor:zh_HK) locale(kimagemapeditor:zh_TW)"
RDEPENDS:${PN} += "kimagemapeditor"

inherit rpm
