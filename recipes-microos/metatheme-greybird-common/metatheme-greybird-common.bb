SUMMARY = "Common files for the Greybird theme"
DESCRIPTION = "The Greybird theme for GTK2/3 and xfwm4/emerald/metacity started out on the \
basis of Bluebird, but aims at reworking the intense blue tone to a more \
neutral grey-ish look. \
 \
This package provides the files common to the GTK+ themes and the window \
manager themes as well as background images."
LICENSE = "CC-BY-SA-3.0 | GPL-2.0-or-later"

PV = "3.23.2+git0.25f312f"

RPM_NAME = "metatheme-greybird-common-3.23.2+git0.25f312f-2.1.noarch.rpm"
RPM_HASH = "8d3347d44c2ec984e1c341f185ac7e35e2c2554df8131948bea7c27ad9a87357e320e6be07891d9e174a81aa0dd4e443bb774d2b3bdafe1291c7c70a63565f1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-greybird-common"
RDEPENDS:${PN} += ""

inherit rpm
