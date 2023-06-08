SUMMARY = "Sanskrit localization files for LibreOffice"
DESCRIPTION = "Provides Sanskrit translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-sa_IN-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "6a459c436d02a65dfded3216ab03ea64f67a56204188b7a51985c4a218b9164672782a499d48f013960db4d93ebeec33a9acc321b8866f04ecce52c6685bb208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sa-IN libreoffice-help-sa_IN libreoffice-l10n-sa_IN locale(libreoffice:sa_IN)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
