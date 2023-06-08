SUMMARY = "Translations for package swappy"
DESCRIPTION = "Provides translations for the 'swappy' package."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "swappy-lang-1.5.1-1.3.noarch.rpm"
RPM_HASH = "274241cc08b6175aa48a57094c16f68151ecd8f2f15d52a050795724b24010d9d4a9ac4c26bc96a4d89b44a9c51135d674b7b59c8e47b9b58320ad20ef63b39a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(swappy:de) locale(swappy:en) locale(swappy:fr) locale(swappy:pt_BR) locale(swappy:tr) swappy-lang swappy-lang-all"
RDEPENDS:${PN} += "swappy"

inherit rpm
