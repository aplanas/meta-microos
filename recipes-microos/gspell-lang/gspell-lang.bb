SUMMARY = "Translations for package gspell"
DESCRIPTION = "Provides translations for the 'gspell' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.1"

RPM_NAME = "gspell-lang-1.12.1-1.2.noarch.rpm"
RPM_HASH = "6e07b1700f26112d8bd474cfd4efa7a5211e41e3a94580b709065a63e837dc3933d3b67a69fac688fbe41db3bd0f0c260acddb8e3f08648fd97d207674b27472"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gspell-lang gspell-lang-all locale(gspell:ar) locale(gspell:be) locale(gspell:bg) locale(gspell:ca) locale(gspell:ca@valencia) locale(gspell:cs) locale(gspell:da) locale(gspell:de) locale(gspell:el) locale(gspell:en_GB) locale(gspell:eo) locale(gspell:es) locale(gspell:eu) locale(gspell:fa) locale(gspell:fi) locale(gspell:fr) locale(gspell:fur) locale(gspell:gd) locale(gspell:gl) locale(gspell:he) locale(gspell:hr) locale(gspell:hu) locale(gspell:id) locale(gspell:is) locale(gspell:it) locale(gspell:ja) locale(gspell:ka) locale(gspell:kk) locale(gspell:ko) locale(gspell:lt) locale(gspell:lv) locale(gspell:ml) locale(gspell:ms) locale(gspell:nb) locale(gspell:ne) locale(gspell:nl) locale(gspell:oc) locale(gspell:pa) locale(gspell:pl) locale(gspell:pt) locale(gspell:pt_BR) locale(gspell:ro) locale(gspell:ru) locale(gspell:sk) locale(gspell:sl) locale(gspell:sr) locale(gspell:sr@latin) locale(gspell:sv) locale(gspell:tr) locale(gspell:uk) locale(gspell:vi) locale(gspell:zh_CN) locale(gspell:zh_TW)"
RDEPENDS:${PN} += "gspell"

inherit rpm
