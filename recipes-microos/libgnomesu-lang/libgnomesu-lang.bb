SUMMARY = "Translations for package libgnomesu"
DESCRIPTION = "Provides translations for the 'libgnomesu' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.7"

RPM_NAME = "libgnomesu-lang-2.0.7-2.3.noarch.rpm"
RPM_HASH = "60e7c8f8ff168f5d4645b7eea49a13e1c411770a372e0e84b11c8270ed70dae308daf412d4ad98d3c5920470b25d88c5ce6af54cf1bc15adf73679bf268f6d09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgnomesu-lang libgnomesu-lang-all locale(libgnomesu:ar) locale(libgnomesu:az) locale(libgnomesu:bg) locale(libgnomesu:bs) locale(libgnomesu:ca) locale(libgnomesu:cs) locale(libgnomesu:da) locale(libgnomesu:de) locale(libgnomesu:el) locale(libgnomesu:en_CA) locale(libgnomesu:en_GB) locale(libgnomesu:es) locale(libgnomesu:eu) locale(libgnomesu:fa) locale(libgnomesu:fi) locale(libgnomesu:fr) locale(libgnomesu:gu) locale(libgnomesu:hi) locale(libgnomesu:hr) locale(libgnomesu:hu) locale(libgnomesu:id) locale(libgnomesu:it) locale(libgnomesu:ja) locale(libgnomesu:ko) locale(libgnomesu:lt) locale(libgnomesu:lv) locale(libgnomesu:mk) locale(libgnomesu:ms) locale(libgnomesu:nb) locale(libgnomesu:ne) locale(libgnomesu:nl) locale(libgnomesu:nn) locale(libgnomesu:pa) locale(libgnomesu:pl) locale(libgnomesu:pt) locale(libgnomesu:pt_BR) locale(libgnomesu:ru) locale(libgnomesu:si) locale(libgnomesu:sk) locale(libgnomesu:sq) locale(libgnomesu:sr) locale(libgnomesu:sr@latin) locale(libgnomesu:sv) locale(libgnomesu:tr) locale(libgnomesu:uk) locale(libgnomesu:vi) locale(libgnomesu:zh_CN) locale(libgnomesu:zh_TW)"
RDEPENDS:${PN} += "libgnomesu"

inherit rpm
