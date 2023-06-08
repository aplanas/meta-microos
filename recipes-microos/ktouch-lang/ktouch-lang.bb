SUMMARY = "Translations for package ktouch"
DESCRIPTION = "Provides translations for the 'ktouch' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ktouch-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "3b49f9b0153c266a61283a679c32d8deef4ec30583dfc092547f381b280f8ce7a5080dc8ec73eddd0cb52fbd27e01c1692f53f89ae645575d883db216ad3c200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktouch-lang ktouch-lang-all locale(ktouch:af) locale(ktouch:ar) locale(ktouch:be) locale(ktouch:bg) locale(ktouch:bn) locale(ktouch:br) locale(ktouch:bs) locale(ktouch:ca) locale(ktouch:ca@valencia) locale(ktouch:cs) locale(ktouch:cy) locale(ktouch:da) locale(ktouch:de) locale(ktouch:el) locale(ktouch:en_GB) locale(ktouch:eo) locale(ktouch:es) locale(ktouch:et) locale(ktouch:eu) locale(ktouch:fa) locale(ktouch:fi) locale(ktouch:fr) locale(ktouch:ga) locale(ktouch:gl) locale(ktouch:gu) locale(ktouch:he) locale(ktouch:hi) locale(ktouch:hr) locale(ktouch:hu) locale(ktouch:ia) locale(ktouch:id) locale(ktouch:is) locale(ktouch:it) locale(ktouch:ja) locale(ktouch:ka) locale(ktouch:kk) locale(ktouch:km) locale(ktouch:ko) locale(ktouch:lt) locale(ktouch:lv) locale(ktouch:mai) locale(ktouch:mk) locale(ktouch:ml) locale(ktouch:mr) locale(ktouch:ms) locale(ktouch:nb) locale(ktouch:nds) locale(ktouch:ne) locale(ktouch:nl) locale(ktouch:nn) locale(ktouch:oc) locale(ktouch:pa) locale(ktouch:pl) locale(ktouch:pt) locale(ktouch:pt_BR) locale(ktouch:ro) locale(ktouch:ru) locale(ktouch:si) locale(ktouch:sk) locale(ktouch:sl) locale(ktouch:sq) locale(ktouch:sv) locale(ktouch:ta) locale(ktouch:tr) locale(ktouch:ug) locale(ktouch:uk) locale(ktouch:zh_CN) locale(ktouch:zh_TW)"
RDEPENDS:${PN} += "ktouch"

inherit rpm
