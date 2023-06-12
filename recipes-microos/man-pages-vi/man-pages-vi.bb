SUMMARY = "Translation of man pages in Vietnamese"
DESCRIPTION = "This package provides translations of man pages in Vietnamese."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-vi-4.19.0-1.1.noarch.rpm"
RPM_HASH = "f8e443bf48d844b54683544f10ae962e583077c04a43f0eca9cae92840cf8b05f8f71909ea3e513b7d0a0e20e0c798176eff4f8ffebd7edd3cf16cb654bc51a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:vi) man-pages-vi"
RDEPENDS:${PN} += "man-pages"

inherit rpm
