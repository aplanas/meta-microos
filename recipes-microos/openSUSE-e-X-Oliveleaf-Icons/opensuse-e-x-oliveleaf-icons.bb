SUMMARY = "FDO Icon theme to go with openSUSE Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the openSUSE Enlightenment \
theme"
LICENSE = "GPL-3.0-only"

PV = "20220219.1.26"

RPM_NAME = "openSUSE-e-X-Oliveleaf-Icons-20220219.1.26-1.10.noarch.rpm"
RPM_HASH = "a5965751facb5f42281b0dbe17d6183ca9b514416c1f5b999320242e6bee943803a7c8e3a558e4900ad69d6f1fbfab44ae6633a5f326050c2aaa0c55afcac8d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Oliveleaf-Icons"
RDEPENDS:${PN} += ""

inherit rpm
