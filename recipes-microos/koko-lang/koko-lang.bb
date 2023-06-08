SUMMARY = "Translations for package koko"
DESCRIPTION = "Provides translations for the 'koko' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "koko-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "daa05374e200404321761b9b20982cf32bd19013d1ad9be4bc1d74727e3f8b6d1216dcda753b081e47fd430799eac6e534b2bff1f09550a35dfa02e7f85253f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "koko-lang koko-lang-all locale(koko:ar) locale(koko:bg) locale(koko:ca) locale(koko:ca@valencia) locale(koko:cs) locale(koko:da) locale(koko:de) locale(koko:el) locale(koko:en_GB) locale(koko:es) locale(koko:eu) locale(koko:fi) locale(koko:fr) locale(koko:it) locale(koko:ja) locale(koko:ka) locale(koko:ko) locale(koko:lt) locale(koko:nl) locale(koko:nn) locale(koko:pa) locale(koko:pl) locale(koko:pt) locale(koko:pt_BR) locale(koko:ru) locale(koko:sk) locale(koko:sl) locale(koko:sv) locale(koko:tr) locale(koko:uk) locale(koko:zh_CN) locale(koko:zh_TW)"
RDEPENDS:${PN} += "koko"

inherit rpm
