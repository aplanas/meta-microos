SUMMARY = "Translations for package kalk"
DESCRIPTION = "Provides translations for the 'kalk' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "kalk-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "5de7328ea9975345b4c006a790fe0b74badf9c524dbc77872ede7c1c563e7d1dd7c7aef27deeb0411da4290415a4395e95f9ddcd1b35d0d3000f9d7079c9b951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalk-lang kalk-lang-all locale(kalk:ar) locale(kalk:az) locale(kalk:ca) locale(kalk:ca@valencia) locale(kalk:cs) locale(kalk:de) locale(kalk:el) locale(kalk:en_GB) locale(kalk:es) locale(kalk:eu) locale(kalk:fi) locale(kalk:fr) locale(kalk:hi) locale(kalk:hu) locale(kalk:it) locale(kalk:ja) locale(kalk:ka) locale(kalk:ko) locale(kalk:lt) locale(kalk:nl) locale(kalk:nn) locale(kalk:pa) locale(kalk:pl) locale(kalk:pt) locale(kalk:pt_BR) locale(kalk:ru) locale(kalk:sk) locale(kalk:sl) locale(kalk:sv) locale(kalk:tr) locale(kalk:uk) locale(kalk:zh_CN) locale(kalk:zh_TW)"
RDEPENDS:${PN} += "kalk"

inherit rpm
