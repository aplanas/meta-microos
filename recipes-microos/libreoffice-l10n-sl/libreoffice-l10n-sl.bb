SUMMARY = "Slovenian localization files for LibreOffice"
DESCRIPTION = "Provides Slovenian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-sl-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "21704b769c85756e77157513a226ac8f464b2491f2321c2879f7318672996526df1f4f303df87896b251240fd953b19b6d289224931f2957072bfbd2106599ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sl libreoffice-l10n-sl locale(libreoffice:sl)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-sl_SI"

inherit rpm
