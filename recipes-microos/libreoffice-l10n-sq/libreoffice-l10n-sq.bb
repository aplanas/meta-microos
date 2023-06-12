SUMMARY = "Albanian localization files for LibreOffice"
DESCRIPTION = "Provides Albanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-sq-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "a7ada28015062bfadbf4aa5b6dd17b5c725c0a6b8ac09927c8ea0a4bbd25fcedcd65032a018e607f6e20a1941aee87ca56aab3df20f10818d31e40ad6b150b0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sq libreoffice-l10n-sq locale(libreoffice:sq)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-sq_AL"

inherit rpm
