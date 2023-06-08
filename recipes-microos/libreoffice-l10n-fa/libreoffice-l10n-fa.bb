SUMMARY = "Farsi localization files for LibreOffice"
DESCRIPTION = "Provides Farsi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-fa-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "58476549a80498217351823c965d2b7cd385f6bb8158a67d4c8524e5978dfba7a9e129b99c99c4997a2975f9b47f9b080c4392e83fed722cce5b325aee75acc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fa libreoffice-l10n-fa locale(libreoffice:fa)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
