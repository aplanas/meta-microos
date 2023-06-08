SUMMARY = "Indonesian localization files for LibreOffice"
DESCRIPTION = "Provides Indonesian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-id-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "5fa4eecec91259a64246a4d29dd77f045cc31f2d6c1725e7588b1360f20caaebc94d7ecad61b3ccca16ff2f0ebb7083e042ec9d57cfec15294eede4b865a4470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-id libreoffice-l10n-id locale(libreoffice:id)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-id"

inherit rpm
