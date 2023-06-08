SUMMARY = "Adapta Xfwm4 themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the Xfwm4 themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "xfwm4-theme-adapta-3.95.0.11-3.5.noarch.rpm"
RPM_HASH = "057bcd20a95f877200a440376414ce429e4baec66e6a9282d89a8d317325b281435f67fba661e57d3ffd919204f37fbfc5ab6132d745dd16c4294ba36892a7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfwm4-theme-adapta"
RDEPENDS:${PN} += "metatheme-adapta-common xfwm4"

inherit rpm
