SUMMARY = "Translations for package mpDris2"
DESCRIPTION = "Provides translations for the 'mpDris2' package."
LICENSE = "GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "mpDris2-lang-0.9.1-1.1.noarch.rpm"
RPM_HASH = "228407926a7f655bdb31f8a8bab21362a95f577ddd4dceddda8be2f7c2865e0c715b04c1997b7beeb4eb4de6e907e6415b55b889a6d39b4c56014c449d92df0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mpDris2:fr) locale(mpDris2:nl) mpDris2-lang mpDris2-lang-all"
RDEPENDS:${PN} += "mpDris2"

inherit rpm
