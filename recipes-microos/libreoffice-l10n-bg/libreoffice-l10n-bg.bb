SUMMARY = "Bulgarian localization files for LibreOffice"
DESCRIPTION = "Provides Bulgarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-bg-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "bac4fe3891fd492ef165a9c04adee01324cb1448e8bc81b9d91bb599801a0323f022acabcabb1df4c6f4f89403caa46d1f8005ebdf9fe898717c59663a4fb2be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bg libreoffice-l10n-bg locale(libreoffice:bg)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-bg_BG"

inherit rpm
