SUMMARY = "Portuguese localization files for LibreOffice"
DESCRIPTION = "Provides Portuguese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-pt_PT-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "f40e15feb1662d97193857c1bc46dea6886105555d0730873bbf663a33d808dd9bc085dcce00f8a4b8d13f5efbc946aebc7857645aecbecc93c4735cc4b9f9ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pt libreoffice-help-pt-PT libreoffice-help-pt_PT libreoffice-l10n-pt libreoffice-l10n-pt-PT libreoffice-l10n-pt_PT locale(libreoffice:pt_PT)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-pt_PT"

inherit rpm
