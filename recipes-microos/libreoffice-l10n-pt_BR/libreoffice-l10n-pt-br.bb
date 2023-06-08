SUMMARY = "Brazilian_Portuguese localization files for LibreOffice"
DESCRIPTION = "Provides Brazilian_Portuguese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-pt_BR-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "3f935c969ac93117f9a371485d6fca93f46a10c91910211af72254fbf30cf958e626cf4de2755a1f112d0c01df3a5b36045260e8e62fde89db676e6bb16a055f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pt-BR libreoffice-help-pt_BR libreoffice-l10n-pt-BR libreoffice-l10n-pt_BR locale(libreoffice:pt_BR)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-pt_BR"

inherit rpm
