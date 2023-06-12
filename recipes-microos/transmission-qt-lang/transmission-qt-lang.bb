SUMMARY = "Translations for package transmission-qt"
DESCRIPTION = "Provides translations for the 'transmission-qt' package."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-qt-lang-4.0.3-2.1.noarch.rpm"
RPM_HASH = "2403e1d42557ee8d3e1c5f6b959b9ea57b80b27e4dcaa9ad78b9589f745793fc33fa5d74857a11ece36cb810da9c2adada9027858ee3e0ccccdef2d18685fde9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "transmission-qt-lang transmission-qt-lang-all"
RDEPENDS:${PN} += "transmission-qt"

inherit rpm
