SUMMARY = "Translations for package proftpd"
DESCRIPTION = "Provides translations for the 'proftpd' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-lang-1.3.7f-1.3.noarch.rpm"
RPM_HASH = "7c76d8d8a67f374a5003a7f677ea88cdd325ddf75a95072801388033976ec06ce78d4bd9fb2c9d5a53d1c93db503fe182e3ec0f1997e2be2d1fae5889513bd2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(proftpd:en_US) locale(proftpd:es_ES) locale(proftpd:fr_FR) locale(proftpd:it_IT) locale(proftpd:ru_RU) locale(proftpd:zh_CN) locale(proftpd:zh_TW) proftpd-lang proftpd-lang-all"
RDEPENDS:${PN} += "proftpd"

inherit rpm
