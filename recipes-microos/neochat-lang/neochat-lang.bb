SUMMARY = "Translations for package neochat"
DESCRIPTION = "Provides translations for the 'neochat' package."
LICENSE = "GPL-3.0-or-later & GPL-3.0-only & BSD-2-Clause"

PV = "23.04.0"

RPM_NAME = "neochat-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "b0baec91dcefd1c314c5f557ffe02cf1b784de0a55d33b34e159aa5214424c234bd4168b510141e4f7fd743875e01055236728faf57c9c8c966909ecbcfdf54d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(neochat:ar) locale(neochat:az) locale(neochat:ca) locale(neochat:ca@valencia) locale(neochat:cs) locale(neochat:da) locale(neochat:de) locale(neochat:el) locale(neochat:en_GB) locale(neochat:es) locale(neochat:eu) locale(neochat:fi) locale(neochat:fr) locale(neochat:hu) locale(neochat:ia) locale(neochat:id) locale(neochat:it) locale(neochat:ja) locale(neochat:ka) locale(neochat:ko) locale(neochat:lt) locale(neochat:nl) locale(neochat:nn) locale(neochat:pa) locale(neochat:pl) locale(neochat:pt) locale(neochat:pt_BR) locale(neochat:ru) locale(neochat:sk) locale(neochat:sl) locale(neochat:sv) locale(neochat:ta) locale(neochat:tr) locale(neochat:uk) locale(neochat:zh_CN) locale(neochat:zh_TW) neochat-lang neochat-lang-all"
RDEPENDS:${PN} += "neochat"

inherit rpm
