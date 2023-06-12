SUMMARY = "Translations for package konversation"
DESCRIPTION = "Provides translations for the 'konversation' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "konversation-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "e11012b35d2004d247667beda261e260860c1033a4a37e8c586547caf33a83659a103cad0657f76cb400fbe68bcc049196a725dd73f082fd50cc1a678a62d466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "konversation-lang konversation-lang-all locale(konversation:ar) locale(konversation:bg) locale(konversation:br) locale(konversation:bs) locale(konversation:ca) locale(konversation:ca@valencia) locale(konversation:cs) locale(konversation:cy) locale(konversation:da) locale(konversation:de) locale(konversation:el) locale(konversation:en_GB) locale(konversation:eo) locale(konversation:es) locale(konversation:et) locale(konversation:eu) locale(konversation:fi) locale(konversation:fr) locale(konversation:ga) locale(konversation:gl) locale(konversation:he) locale(konversation:hi) locale(konversation:hr) locale(konversation:hu) locale(konversation:ia) locale(konversation:is) locale(konversation:it) locale(konversation:ja) locale(konversation:ka) locale(konversation:kk) locale(konversation:km) locale(konversation:ko) locale(konversation:lt) locale(konversation:mr) locale(konversation:ms) locale(konversation:nb) locale(konversation:nds) locale(konversation:nl) locale(konversation:nn) locale(konversation:pa) locale(konversation:pl) locale(konversation:pt) locale(konversation:pt_BR) locale(konversation:ro) locale(konversation:ru) locale(konversation:si) locale(konversation:sk) locale(konversation:sl) locale(konversation:sq) locale(konversation:sr) locale(konversation:sr@ijekavian) locale(konversation:sr@ijekavianlatin) locale(konversation:sr@latin) locale(konversation:sv) locale(konversation:ta) locale(konversation:tr) locale(konversation:ug) locale(konversation:uk) locale(konversation:zh_CN) locale(konversation:zh_TW)"
RDEPENDS:${PN} += "konversation"

inherit rpm
