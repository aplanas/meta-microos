SUMMARY = "Translations for package procps4"
DESCRIPTION = "Provides translations for the 'procps4' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.0.3"

RPM_NAME = "procps4-lang-4.0.3-1.3.noarch.rpm"
RPM_HASH = "b60315ce22499989683fd8b8f36dc017d9f44dad8d0da25074aa32f73ded16723d3d61814a09ef537beae86a7e37cb70fc6bfb34d2fe102851e4be2616916266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(procps4:de) locale(procps4:es) locale(procps4:fr) locale(procps4:ka) locale(procps4:ko) locale(procps4:pl) locale(procps4:pt_BR) locale(procps4:ro) locale(procps4:sv) locale(procps4:uk) locale(procps4:vi) locale(procps4:zh_CN) procps-lang procps4-lang procps4-lang-all"
RDEPENDS:${PN} += "procps4"

inherit rpm
