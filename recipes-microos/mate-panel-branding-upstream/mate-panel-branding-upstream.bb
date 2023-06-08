SUMMARY = "Upstream default layout for the MATE desktop panel"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data. \
 \
This package contains the upstream default layout for MATE Panel."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.2"

RPM_NAME = "mate-panel-branding-upstream-1.26.2-2.3.noarch.rpm"
RPM_HASH = "1e3324f894856891de13177e3896e1e70c5e9eb2df62607787ff032e6cc5589547ef5f21633575e0c789f2ed339e12a46f0c2d6a39cba2c2cede477db8ae93dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-panel-branding mate-panel-branding-upstream"
RDEPENDS:${PN} += "mate-panel"

inherit rpm
