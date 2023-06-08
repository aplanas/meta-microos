SUMMARY = "Translations for package khangman"
DESCRIPTION = "Provides translations for the 'khangman' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "khangman-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "0028786e8bd5d8f66416d97f3baa2a83650c3a5d5a1ace7727e3cf08409b75a1d49cb672e146742b4f3c9d85738e92f5cac5c6768d5fe3e8ab500165e5706ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "khangman-lang khangman-lang-all locale(khangman:af) locale(khangman:ar) locale(khangman:be) locale(khangman:bg) locale(khangman:bn) locale(khangman:br) locale(khangman:bs) locale(khangman:ca) locale(khangman:ca@valencia) locale(khangman:cs) locale(khangman:cy) locale(khangman:da) locale(khangman:de) locale(khangman:el) locale(khangman:en_GB) locale(khangman:eo) locale(khangman:es) locale(khangman:et) locale(khangman:eu) locale(khangman:fa) locale(khangman:fi) locale(khangman:fr) locale(khangman:ga) locale(khangman:gl) locale(khangman:gu) locale(khangman:he) locale(khangman:hi) locale(khangman:hr) locale(khangman:hu) locale(khangman:is) locale(khangman:it) locale(khangman:ja) locale(khangman:ka) locale(khangman:kk) locale(khangman:km) locale(khangman:ko) locale(khangman:lt) locale(khangman:lv) locale(khangman:mk) locale(khangman:ml) locale(khangman:mr) locale(khangman:ms) locale(khangman:nb) locale(khangman:nds) locale(khangman:ne) locale(khangman:nl) locale(khangman:nn) locale(khangman:oc) locale(khangman:pa) locale(khangman:pl) locale(khangman:pt) locale(khangman:pt_BR) locale(khangman:ro) locale(khangman:ru) locale(khangman:si) locale(khangman:sk) locale(khangman:sl) locale(khangman:sq) locale(khangman:sv) locale(khangman:ta) locale(khangman:tr) locale(khangman:ug) locale(khangman:uk) locale(khangman:zh_CN) locale(khangman:zh_TW)"
RDEPENDS:${PN} += "khangman"

inherit rpm
