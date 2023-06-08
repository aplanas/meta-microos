SUMMARY = "Qt 6 Translations"
DESCRIPTION = "Translations for Qt6 libraries and tools."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-translations-6.5.0-1.1.noarch.rpm"
RPM_HASH = "cc57996856da4b5d72adfe0a525a82bfaf1f3a69d9ab39f20d637dd765f1df1bfd31a08c4c72432730c4b1a9174107650b06784115b492b35e1ad9af9dddd605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-translations"
RDEPENDS:${PN} += ""

inherit rpm
