SUMMARY = "LibreOffice Icon Themes"
DESCRIPTION = "This package provides all of the LibreOffice icon themes."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-icon-themes-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "b0b1dd39599a15ee3d3eb8962719ec089a6a667b022d6cebee4bfb374c063a25607f59daa26dd0f893519a6c0bd90775fb0c2b859a4b6a5d03c7dfd5602a8667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-icon-theme-breeze libreoffice-icon-theme-galaxy libreoffice-icon-theme-hicontrast libreoffice-icon-theme-sifr libreoffice-icon-theme-tango libreoffice-icon-themes"
RDEPENDS:${PN} += "/bin/sh libreoffice-share-linker"

inherit rpm
