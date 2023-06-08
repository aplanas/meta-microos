SUMMARY = "English_GB localization files for LibreOffice"
DESCRIPTION = "Provides English_GB translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-en_GB-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "b886d62b29676041685abce83d3827cfc2726d00dfc46de4c8ea1c78c1f6c03b02c844d73f08cd0b41d33e9a6b55c616d6ad7155729b0697242fc5883c9cbc97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-GB libreoffice-help-en_GB libreoffice-l10n-en_GB locale(libreoffice:en_GB)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-en_GB"

inherit rpm
