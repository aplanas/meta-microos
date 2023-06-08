SUMMARY = "Mint-X icon theme"
DESCRIPTION = "A mint/metal theme based on mintified versions of \
Clearlooks Revamp, Elementary and Faenza."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.9"

RPM_NAME = "mint-x-icon-theme-1.5.9-1.7.noarch.rpm"
RPM_HASH = "dbac5792b32017b20b5d2b92c35ae557b3a1556bc5bb64f2b01beb206905db0dd188ae18a153ba47a4ff07f8024d35b25d58b4c21d047a1ef2e6530dfad4a633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mint-x-icon-theme"
RDEPENDS:${PN} += "adwaita-icon-theme hicolor-icon-theme"

inherit rpm
