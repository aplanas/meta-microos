SUMMARY = "Default settings for KDE Plasma 5"
DESCRIPTION = "This package changes the default settings of Plasma 5."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "plasma5-defaults-openSUSE-84.87~git20230131T131056~433af24-7.1.noarch.rpm"
RPM_HASH = "13f6afcc6d71a9b6e1615b5c1a00fb1c23ffd4e4dc8085770c4bf6b3209b1b9440d7aa1d7b20219c1cf71d03f1b7498139467990609ce8d120a31d4f727e0433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(plasma5-defaults-openSUSE) plasma5-defaults-openSUSE"
RDEPENDS:${PN} += "distribution-logos-openSUSE-icons plasma5-theme-openSUSE"

inherit rpm
