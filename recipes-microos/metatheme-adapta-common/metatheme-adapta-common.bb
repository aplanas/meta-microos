SUMMARY = "Adapta common theme files"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains common files for all Adapta themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "metatheme-adapta-common-3.95.0.11-3.5.noarch.rpm"
RPM_HASH = "88bf975d85214e074aeb09b40eee2d46510a5c4ad47f6b4ad212697b00d73fac31060974ff9844361bb1b36f6f373c35be597a4c52862cfb9ca2eb0acf454f28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adapta-gtk-theme \
metatheme-adapta-common"
RDEPENDS:${PN} += "google-roboto-fonts \
noto-sans-fonts"

inherit rpm
