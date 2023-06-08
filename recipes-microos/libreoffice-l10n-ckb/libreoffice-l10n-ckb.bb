SUMMARY = "Central_Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Central_Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ckb-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "b59f3cf9065f4f2599699003d0f731148867685082cd7ea3a3169f4c692f3e0c468a679e9103fc81216e36fb011ed272717abba13117c65e7e57f0da1600eaa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ckb libreoffice-l10n-ckb locale(libreoffice:ckb)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
