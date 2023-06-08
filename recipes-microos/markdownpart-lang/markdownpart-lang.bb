SUMMARY = "Translations for package markdownpart"
DESCRIPTION = "Provides translations for the 'markdownpart' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "markdownpart-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "ae3f69734303233be116dc9cc0427a9419a9cfcbd5c1a884a401934d24c96cb6525f953a35932aa5064126f55eb93ff4f1f9494cc77445c35242bb2a6dd839eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(markdownpart:ar) locale(markdownpart:ca) locale(markdownpart:ca@valencia) locale(markdownpart:cs) locale(markdownpart:de) locale(markdownpart:el) locale(markdownpart:en_GB) locale(markdownpart:es) locale(markdownpart:et) locale(markdownpart:eu) locale(markdownpart:fi) locale(markdownpart:fr) locale(markdownpart:hi) locale(markdownpart:it) locale(markdownpart:ja) locale(markdownpart:ka) locale(markdownpart:ko) locale(markdownpart:lt) locale(markdownpart:nl) locale(markdownpart:nn) locale(markdownpart:pl) locale(markdownpart:pt) locale(markdownpart:pt_BR) locale(markdownpart:ro) locale(markdownpart:ru) locale(markdownpart:sk) locale(markdownpart:sl) locale(markdownpart:sv) locale(markdownpart:tr) locale(markdownpart:uk) locale(markdownpart:vi) locale(markdownpart:zh_CN) locale(markdownpart:zh_TW) markdownpart-lang markdownpart-lang-all"
RDEPENDS:${PN} += "markdownpart"

inherit rpm
