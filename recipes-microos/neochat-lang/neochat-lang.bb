SUMMARY = "Translations for package neochat"
DESCRIPTION = "Provides translations for the 'neochat' package."
LICENSE = "GPL-3.0-or-later & GPL-3.0-only & BSD-2-Clause"

PV = "23.04.1"

RPM_NAME = "neochat-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "732d194712306c7c40646c34728a612b073c87051b40faceb709b48f20f0a4eed166ee2cf9afcc6bc39773fa9471e90a99d4b10b7f131973f30bb1994aadb07e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(neochat:ar) locale(neochat:az) locale(neochat:ca) locale(neochat:ca@valencia) locale(neochat:cs) locale(neochat:da) locale(neochat:de) locale(neochat:el) locale(neochat:en_GB) locale(neochat:es) locale(neochat:eu) locale(neochat:fi) locale(neochat:fr) locale(neochat:hu) locale(neochat:ia) locale(neochat:id) locale(neochat:it) locale(neochat:ja) locale(neochat:ka) locale(neochat:ko) locale(neochat:lt) locale(neochat:nl) locale(neochat:nn) locale(neochat:pa) locale(neochat:pl) locale(neochat:pt) locale(neochat:pt_BR) locale(neochat:ru) locale(neochat:sk) locale(neochat:sl) locale(neochat:sv) locale(neochat:ta) locale(neochat:tr) locale(neochat:uk) locale(neochat:zh_CN) locale(neochat:zh_TW) neochat-lang neochat-lang-all"
RDEPENDS:${PN} += "neochat"

inherit rpm
