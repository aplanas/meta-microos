SUMMARY = "Adapta Xfce4 notifyd themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the Xfce4 notifyd themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "xfce4-notifyd-theme-adapta-3.95.0.11-3.5.noarch.rpm"
RPM_HASH = "d2760e2c1042c086d5740ae1a2548acc315a26e418d855aef3b986c435fa330c384072ec49089ec89b111cbd85099d440db02f349e9324e3d348bb2bdcb5a380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfce4-notifyd-theme-adapta"
RDEPENDS:${PN} += "metatheme-adapta-common xfce4-notifyd"

inherit rpm
