SUMMARY = "Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-kmr_Latn-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "82464c1f8c4ccca4eb64f33aab672aa345097f0b1dce62ee9207228eb386fd3dc422516066d0a16fd0a04ff808d27bffe50d891e893c17a8acec4f5b7878ef37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kmr-Latn \
libreoffice-help-kmr_Latn \
libreoffice-l10n-kmr_Latn \
locale(libreoffice:kmr_Latn)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-kmr_Latn"

inherit rpm
