SUMMARY = "Translations for package poxml"
DESCRIPTION = "Provides translations for the 'poxml' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.1"

RPM_NAME = "poxml-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "56ffc78336760b362090ab28ac458e94225a76501f16628fca5d62ccf896eec692574650dbad24723cb904b6fee94703aa427d2f7bdefe8b7c530569668fa637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "poxml-lang poxml-lang-all"
RDEPENDS:${PN} += "poxml"

inherit rpm
