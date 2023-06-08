SUMMARY = "Translations for package peek"
DESCRIPTION = "Provides translations for the 'peek' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "peek-lang-1.5.1-2.17.noarch.rpm"
RPM_HASH = "43bbb8737889d37b86ec7959e76a7bf9d8165e0a62ac92ed7f21f8d76c4cc003d39201b635b6544c158cbc499ba120db9bc4f4edfba5851d9652aac33b1efddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(peek:ar) locale(peek:ca) locale(peek:cs) locale(peek:de) locale(peek:el) locale(peek:eo) locale(peek:es) locale(peek:eu) locale(peek:fi) locale(peek:fr) locale(peek:he) locale(peek:hr) locale(peek:id) locale(peek:it) locale(peek:ja) locale(peek:kn) locale(peek:ko) locale(peek:lt) locale(peek:nb) locale(peek:nl) locale(peek:pl) locale(peek:pt_BR) locale(peek:pt_PT) locale(peek:ru) locale(peek:sr) locale(peek:sv) locale(peek:tr) locale(peek:uk_UA) locale(peek:zh_CN) locale(peek:zh_TW) peek-lang peek-lang-all"
RDEPENDS:${PN} += "peek"

inherit rpm
