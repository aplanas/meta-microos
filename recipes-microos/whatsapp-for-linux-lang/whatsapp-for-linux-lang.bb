SUMMARY = "Translations for package whatsapp-for-linux"
DESCRIPTION = "Provides translations for the 'whatsapp-for-linux' package."
LICENSE = "GPL-3.0-only"

PV = "1.6.3"

RPM_NAME = "whatsapp-for-linux-lang-1.6.3-1.1.noarch.rpm"
RPM_HASH = "1780f299162111a41fa62fdeea8d1990d9b7e2601d8279bf75e734f7b3c78cf959b5927e2895ac2e866f1425d9b3441c74a205e8664bc5d172027762280b45f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(whatsapp-for-linux:cs) locale(whatsapp-for-linux:de) locale(whatsapp-for-linux:en) locale(whatsapp-for-linux:es) locale(whatsapp-for-linux:fr) locale(whatsapp-for-linux:hu) locale(whatsapp-for-linux:it) locale(whatsapp-for-linux:ka) locale(whatsapp-for-linux:nl) locale(whatsapp-for-linux:ru) locale(whatsapp-for-linux:tr) whatsapp-for-linux-lang whatsapp-for-linux-lang-all"
RDEPENDS:${PN} += "whatsapp-for-linux"

inherit rpm
