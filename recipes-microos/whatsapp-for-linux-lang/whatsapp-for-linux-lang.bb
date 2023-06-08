SUMMARY = "Translations for package whatsapp-for-linux"
DESCRIPTION = "Provides translations for the 'whatsapp-for-linux' package."
LICENSE = "GPL-3.0-only"

PV = "1.6.2"

RPM_NAME = "whatsapp-for-linux-lang-1.6.2-2.1.noarch.rpm"
RPM_HASH = "a0109af273ea3d11efa74f2591180338e1a06897563f31fc200a392eda90c303d5c145b6b4e770fdce8a2279c547cd609a21251e26a974e9cb21d3251ae2a0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(whatsapp-for-linux:en) locale(whatsapp-for-linux:es) locale(whatsapp-for-linux:fr) locale(whatsapp-for-linux:it) locale(whatsapp-for-linux:ka) locale(whatsapp-for-linux:nl) locale(whatsapp-for-linux:ru) locale(whatsapp-for-linux:tr) whatsapp-for-linux-lang whatsapp-for-linux-lang-all"
RDEPENDS:${PN} += "whatsapp-for-linux"

inherit rpm
