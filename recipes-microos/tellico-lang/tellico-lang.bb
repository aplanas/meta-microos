SUMMARY = "Translations for package tellico"
DESCRIPTION = "Provides translations for the 'tellico' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "tellico-lang-3.5-1.1.noarch.rpm"
RPM_HASH = "920ff73b53373f4367fc47726014c662a0378aca1529462376309893aac9b3cfd84e3dbeca2796d7e1c32eb8c07650d973fc913f09cbb15ef7a25ce6813aa77e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tellico:bg) locale(tellico:bs) locale(tellico:ca) locale(tellico:ca@valencia) locale(tellico:cs) locale(tellico:da) locale(tellico:de) locale(tellico:el) locale(tellico:en_GB) locale(tellico:eo) locale(tellico:es) locale(tellico:et) locale(tellico:eu) locale(tellico:fi) locale(tellico:fr) locale(tellico:ga) locale(tellico:gl) locale(tellico:hu) locale(tellico:ia) locale(tellico:it) locale(tellico:ka) locale(tellico:kk) locale(tellico:ko) locale(tellico:lt) locale(tellico:mr) locale(tellico:ms) locale(tellico:nb) locale(tellico:nds) locale(tellico:nl) locale(tellico:nn) locale(tellico:pl) locale(tellico:pt) locale(tellico:pt_BR) locale(tellico:ro) locale(tellico:ru) locale(tellico:sk) locale(tellico:sl) locale(tellico:sv) locale(tellico:tr) locale(tellico:ug) locale(tellico:uk) locale(tellico:zh_CN) locale(tellico:zh_TW) tellico-lang tellico-lang-all"
RDEPENDS:${PN} += "tellico"

inherit rpm
