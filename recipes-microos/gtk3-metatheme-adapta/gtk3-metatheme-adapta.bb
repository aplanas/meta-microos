SUMMARY = "Adapta GTK+3 themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the GTK3+ themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "gtk3-metatheme-adapta-3.95.0.11-3.5.noarch.rpm"
RPM_HASH = "1cfe48850dc9a324580456f43dca7aa719eda0a7658e75806fb1e4d94decf8f36d4175ed8c38396a9a7ffb6f066ef97581180ec54d0e0e08e69380c93dfcc9b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-adapta"
RDEPENDS:${PN} += "gtk3 metatheme-adapta-common"

inherit rpm
