SUMMARY = "Telugu localization files for LibreOffice"
DESCRIPTION = "Provides Telugu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-te-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "f7db09eff43432362df8f452266d4f97e0208bb2cfaa62d0dce63db1900532712ebc113469285c24565d0d1e4fd34e8c9ecdacdc65bffca03a259c5dc725e864"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-te libreoffice-l10n-te locale(libreoffice:te)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-te_IN"

inherit rpm
