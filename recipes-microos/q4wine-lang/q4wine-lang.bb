SUMMARY = "Translations for package q4wine"
DESCRIPTION = "Provides translations for the 'q4wine' package."
LICENSE = "GPL-3.0-only"

PV = "1.3.13"

RPM_NAME = "q4wine-lang-1.3.13-1.16.noarch.rpm"
RPM_HASH = "0ac8b0e414bdf79bea32f44a43eef85b61f2a1105bef25c301e09533fd805f2a162eb84f98f424943212e06122b72c38eb16b94a82eb739c9966617e01066772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "q4wine-lang q4wine-lang-all"
RDEPENDS:${PN} += "q4wine"

inherit rpm
