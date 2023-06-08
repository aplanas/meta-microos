SUMMARY = "Kinyarwanda localization files for LibreOffice"
DESCRIPTION = "Provides Kinyarwanda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-rw-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "ed06d1b853a148e63add474e189cf438e9ed3fa9e7883eebb4c6710af870ae64bc643de2c386533e2f0bbbfe7b4257da83423d86586a0590ce33d0346d55377d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-rw libreoffice-l10n-rw locale(libreoffice:rw)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
