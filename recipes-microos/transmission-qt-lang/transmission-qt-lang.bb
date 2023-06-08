SUMMARY = "Translations for package transmission-qt"
DESCRIPTION = "Provides translations for the 'transmission-qt' package."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-qt-lang-4.0.3-1.1.noarch.rpm"
RPM_HASH = "ee54bc11fb4b83ff0303461b473cd7d0fbb5e707865090c4b11c6f8ff86922e9bdf511435972c9dca777b46c99cfa597f73b895289bf1319d7e1ea52ed4f1adc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "transmission-qt-lang transmission-qt-lang-all"
RDEPENDS:${PN} += "transmission-qt"

inherit rpm
