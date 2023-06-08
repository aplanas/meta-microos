SUMMARY = "Translations for package kmail"
DESCRIPTION = "Provides translations for the 'kmail' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "kmail-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "e33efcdc96208f762f59b719b4175ac0baf1f8c7b63143aebc751ea6a13a41d08eaf36829ff7c0f1621c76c98f03385bc7db0dcc8745496088d6f69717f6fc1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmail-lang kmail-lang-all locale(kmail:af) locale(kmail:ar) locale(kmail:az) locale(kmail:be) locale(kmail:bg) locale(kmail:bn) locale(kmail:br) locale(kmail:bs) locale(kmail:ca) locale(kmail:ca@valencia) locale(kmail:cs) locale(kmail:cy) locale(kmail:da) locale(kmail:de) locale(kmail:el) locale(kmail:en_GB) locale(kmail:eo) locale(kmail:es) locale(kmail:et) locale(kmail:eu) locale(kmail:fa) locale(kmail:fi) locale(kmail:fr) locale(kmail:ga) locale(kmail:gl) locale(kmail:he) locale(kmail:hi) locale(kmail:hr) locale(kmail:hu) locale(kmail:ia) locale(kmail:id) locale(kmail:is) locale(kmail:it) locale(kmail:ja) locale(kmail:ka) locale(kmail:kk) locale(kmail:km) locale(kmail:ko) locale(kmail:lt) locale(kmail:lv) locale(kmail:mk) locale(kmail:mr) locale(kmail:ms) locale(kmail:nb) locale(kmail:nds) locale(kmail:ne) locale(kmail:nl) locale(kmail:nn) locale(kmail:pa) locale(kmail:pl) locale(kmail:pt) locale(kmail:pt_BR) locale(kmail:ro) locale(kmail:ru) locale(kmail:si) locale(kmail:sk) locale(kmail:sl) locale(kmail:sq) locale(kmail:sr) locale(kmail:sr@ijekavian) locale(kmail:sr@ijekavianlatin) locale(kmail:sr@latin) locale(kmail:sv) locale(kmail:ta) locale(kmail:th) locale(kmail:tr) locale(kmail:ug) locale(kmail:uk) locale(kmail:wa) locale(kmail:zh_CN) locale(kmail:zh_TW)"
RDEPENDS:${PN} += "kmail"

inherit rpm
