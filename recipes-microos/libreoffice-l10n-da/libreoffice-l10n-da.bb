SUMMARY = "Danish localization files for LibreOffice"
DESCRIPTION = "Provides Danish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-da-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "8da99011318889e0f196def68df3f2010de007290e3004c097664930580a01d562de9c88a3d4b602d46e043a97e48ba1c34b78a8329b44b251804f618c1fe02b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-da libreoffice-l10n-da locale(libreoffice:da)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-da_DK"

inherit rpm
