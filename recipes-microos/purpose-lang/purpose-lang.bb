SUMMARY = "Translations for package purpose"
DESCRIPTION = "Provides translations for the 'purpose' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "purpose-lang-5.105.0-1.1.noarch.rpm"
RPM_HASH = "08cf1ccef2094da7282c469db2a890a2a7dc01db58c715af3c7107b1966b9bb1f3758ddc203698b921e6338e278e6da8817f8b965126cc88a981647d1dabca6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(purpose:ar) locale(purpose:az) locale(purpose:bg) locale(purpose:ca) locale(purpose:ca@valencia) locale(purpose:cs) locale(purpose:da) locale(purpose:de) locale(purpose:el) locale(purpose:en_GB) locale(purpose:es) locale(purpose:et) locale(purpose:eu) locale(purpose:fi) locale(purpose:fr) locale(purpose:gl) locale(purpose:hu) locale(purpose:ia) locale(purpose:id) locale(purpose:it) locale(purpose:ja) locale(purpose:ka) locale(purpose:ko) locale(purpose:lt) locale(purpose:ml) locale(purpose:nb) locale(purpose:nl) locale(purpose:nn) locale(purpose:pl) locale(purpose:pt) locale(purpose:pt_BR) locale(purpose:ro) locale(purpose:ru) locale(purpose:sk) locale(purpose:sl) locale(purpose:sq) locale(purpose:sv) locale(purpose:ta) locale(purpose:tr) locale(purpose:uk) locale(purpose:zh_CN) locale(purpose:zh_TW) purpose-lang purpose-lang-all"
RDEPENDS:${PN} += "purpose"

inherit rpm
