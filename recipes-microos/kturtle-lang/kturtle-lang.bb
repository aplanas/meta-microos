SUMMARY = "Translations for package kturtle"
DESCRIPTION = "Provides translations for the 'kturtle' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kturtle-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "4525b746ff12d43c7c2ffb2362afca843286d3ae8ea5df699d03c01e1bdae1e179713641d3252d33044693e0d8251d21956b966ccdde98b7c7e0a70a96182745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kturtle-lang kturtle-lang-all locale(kturtle:ar) locale(kturtle:be) locale(kturtle:bg) locale(kturtle:bn) locale(kturtle:br) locale(kturtle:bs) locale(kturtle:ca) locale(kturtle:ca@valencia) locale(kturtle:cs) locale(kturtle:cy) locale(kturtle:da) locale(kturtle:de) locale(kturtle:el) locale(kturtle:en_GB) locale(kturtle:eo) locale(kturtle:es) locale(kturtle:et) locale(kturtle:eu) locale(kturtle:fa) locale(kturtle:fi) locale(kturtle:fr) locale(kturtle:ga) locale(kturtle:gl) locale(kturtle:he) locale(kturtle:hi) locale(kturtle:hr) locale(kturtle:hu) locale(kturtle:is) locale(kturtle:it) locale(kturtle:ja) locale(kturtle:ka) locale(kturtle:kk) locale(kturtle:km) locale(kturtle:ko) locale(kturtle:lt) locale(kturtle:lv) locale(kturtle:mk) locale(kturtle:ml) locale(kturtle:mr) locale(kturtle:ms) locale(kturtle:nb) locale(kturtle:nds) locale(kturtle:ne) locale(kturtle:nl) locale(kturtle:nn) locale(kturtle:oc) locale(kturtle:pa) locale(kturtle:pl) locale(kturtle:pt) locale(kturtle:pt_BR) locale(kturtle:ro) locale(kturtle:ru) locale(kturtle:si) locale(kturtle:sk) locale(kturtle:sl) locale(kturtle:sq) locale(kturtle:sv) locale(kturtle:ta) locale(kturtle:tr) locale(kturtle:ug) locale(kturtle:uk) locale(kturtle:zh_CN) locale(kturtle:zh_TW)"
RDEPENDS:${PN} += "kturtle"

inherit rpm
