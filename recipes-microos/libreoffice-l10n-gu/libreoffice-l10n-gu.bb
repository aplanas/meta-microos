SUMMARY = "Gujarati localization files for LibreOffice"
DESCRIPTION = "Provides Gujarati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-gu-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "37dba50d6d087bab05b846fda038b1d2dd3d9477ce1bebb7266f96bbd2e95722cb11998148d5437d2bf84f9cf3b2aa6806344b0b04b8aa146e240c25dec977d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gu \
libreoffice-help-gu-IN \
libreoffice-l10n-gu \
libreoffice-l10n-gu-IN \
locale(libreoffice:gu)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gu_IN"

inherit rpm
