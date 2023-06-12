SUMMARY = "GTK+ 2 support for the Greybird theme"
DESCRIPTION = "This package provides the GTK+ 2 support of Greybird."
LICENSE = "CC-BY-SA-3.0 | GPL-2.0-or-later"

PV = "3.23.2+git0.25f312f"

RPM_NAME = "gtk2-metatheme-greybird-3.23.2+git0.25f312f-2.1.noarch.rpm"
RPM_HASH = "182ed329c248c9f3bb7fb036a602a49308997a5e24fa592447bcba06c9248346614f9d691229dd4424268af1c50a408cedd3768691858a38cbbf117f85ac8b45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-greybird"
RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-greybird-common"

inherit rpm
