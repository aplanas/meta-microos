SUMMARY = "Translations for package kbruch"
DESCRIPTION = "Provides translations for the 'kbruch' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kbruch-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "6156046bce0dd8a848bc8b50aae05fd97a396bfb9ac0613a01bbbb599235a0553620904e2503bf4279adacd0fd85dcac1f651be2da2f65a3e7b9d3705863a34b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbruch-lang kbruch-lang-all locale(kbruch:ar) locale(kbruch:be) locale(kbruch:bg) locale(kbruch:bn) locale(kbruch:br) locale(kbruch:bs) locale(kbruch:ca) locale(kbruch:ca@valencia) locale(kbruch:cs) locale(kbruch:cy) locale(kbruch:da) locale(kbruch:de) locale(kbruch:el) locale(kbruch:en_GB) locale(kbruch:eo) locale(kbruch:es) locale(kbruch:et) locale(kbruch:eu) locale(kbruch:fa) locale(kbruch:fi) locale(kbruch:fr) locale(kbruch:ga) locale(kbruch:gl) locale(kbruch:he) locale(kbruch:hi) locale(kbruch:hr) locale(kbruch:hu) locale(kbruch:is) locale(kbruch:it) locale(kbruch:ja) locale(kbruch:ka) locale(kbruch:kk) locale(kbruch:km) locale(kbruch:ko) locale(kbruch:lt) locale(kbruch:lv) locale(kbruch:mk) locale(kbruch:ml) locale(kbruch:mr) locale(kbruch:ms) locale(kbruch:nb) locale(kbruch:nds) locale(kbruch:ne) locale(kbruch:nl) locale(kbruch:nn) locale(kbruch:oc) locale(kbruch:pa) locale(kbruch:pl) locale(kbruch:pt) locale(kbruch:pt_BR) locale(kbruch:ro) locale(kbruch:ru) locale(kbruch:si) locale(kbruch:sk) locale(kbruch:sl) locale(kbruch:sq) locale(kbruch:sv) locale(kbruch:ta) locale(kbruch:th) locale(kbruch:tr) locale(kbruch:ug) locale(kbruch:uk) locale(kbruch:zh_CN) locale(kbruch:zh_TW)"
RDEPENDS:${PN} += "kbruch"

inherit rpm
