SUMMARY = "Kashmiri localization files for LibreOffice"
DESCRIPTION = "Provides Kashmiri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ks-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "752bbb60520f4eb8a533f2692026273b2ff89210eb39426288744d175d3401fd6d5ac64c5561856c0c3db0de4bcd251c2c5ce8ad7e948b26ad18cff15c74e47e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ks libreoffice-l10n-ks locale(libreoffice:ks)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
