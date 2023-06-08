SUMMARY = "Translations for package picard"
DESCRIPTION = "Provides translations for the 'picard' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "picard-lang-2.8.5-1.3.noarch.rpm"
RPM_HASH = "9745cc1349a5cdb85cae606959345b2d78b263a6d75ab54dfc7ec4f4fa1e335d256fa14f50def7fad0cbe237b1ba06856a9ceb6352c846340b71f9b2e5bfffb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(picard:af) locale(picard:ar) locale(picard:ast) locale(picard:bg) locale(picard:bn) locale(picard:ca) locale(picard:cs) locale(picard:cy) locale(picard:da) locale(picard:de) locale(picard:de_CH) locale(picard:el) locale(picard:en) locale(picard:en_AU) locale(picard:en_CA) locale(picard:en_GB) locale(picard:eo) locale(picard:es) locale(picard:et) locale(picard:fa) locale(picard:fi) locale(picard:fr) locale(picard:fr_CA) locale(picard:gl) locale(picard:he) locale(picard:hi) locale(picard:hr) locale(picard:hu) locale(picard:id) locale(picard:is) locale(picard:it) locale(picard:ja) locale(picard:kn) locale(picard:ko) locale(picard:lt) locale(picard:mr) locale(picard:nb) locale(picard:nds) locale(picard:ne) locale(picard:nl) locale(picard:nl_BE) locale(picard:oc) locale(picard:pa) locale(picard:pl) locale(picard:pt) locale(picard:pt_BR) locale(picard:pt_PT) locale(picard:ro) locale(picard:ru) locale(picard:sk) locale(picard:sl) locale(picard:sq) locale(picard:sr) locale(picard:sv) locale(picard:ta) locale(picard:te) locale(picard:tr) locale(picard:uk) locale(picard:vi) locale(picard:zh) locale(picard:zh_CN) locale(picard:zh_TW) picard-lang picard-lang-all"
RDEPENDS:${PN} += "picard"

inherit rpm
