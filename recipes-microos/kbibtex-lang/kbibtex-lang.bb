SUMMARY = "Translations for package kbibtex"
DESCRIPTION = "Provides translations for the 'kbibtex' package."
LICENSE = "GPL-2.0-only"

PV = "0.9.3.2"

RPM_NAME = "kbibtex-lang-0.9.3.2-1.3.noarch.rpm"
RPM_HASH = "7853a92149ed0ad031c64a645b7035fc060fa36cf3a7979678e17dd0e09228ee76ca11b45fd5a6d0874672fb99da54baf714a70e56c562afd68efdf9da139aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbibtex-lang kbibtex-lang-all locale(kbibtex:ast) locale(kbibtex:bs) locale(kbibtex:ca) locale(kbibtex:ca@valencia) locale(kbibtex:cs) locale(kbibtex:de) locale(kbibtex:en_GB) locale(kbibtex:es) locale(kbibtex:et) locale(kbibtex:fi) locale(kbibtex:fr) locale(kbibtex:gl) locale(kbibtex:hu) locale(kbibtex:ia) locale(kbibtex:it) locale(kbibtex:ko) locale(kbibtex:lt) locale(kbibtex:nb) locale(kbibtex:nl) locale(kbibtex:pl) locale(kbibtex:pt) locale(kbibtex:pt_BR) locale(kbibtex:ru) locale(kbibtex:sk) locale(kbibtex:sv) locale(kbibtex:tr) locale(kbibtex:uk) locale(kbibtex:zh_CN)"
RDEPENDS:${PN} += "kbibtex"

inherit rpm
