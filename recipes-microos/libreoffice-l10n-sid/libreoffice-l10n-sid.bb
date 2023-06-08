SUMMARY = "Sidamo localization files for LibreOffice"
DESCRIPTION = "Provides Sidamo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-sid-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "eb42ee5dfac326ff4a7d05cf5e22da908fcab374d37930a5560ba7f72aaab06d52f3bd41037276b1f02aa47484fe7ef264ff1f7f155a7ae4a6bf9fd6eaeeb925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sid libreoffice-l10n-sid locale(libreoffice:sid)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
