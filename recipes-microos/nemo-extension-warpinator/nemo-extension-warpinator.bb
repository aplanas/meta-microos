SUMMARY = "Warpinator extension for nemo"
DESCRIPTION = "Warpinator is a simple app that allows users to share files across the LAN. \
 \
This package provides an extension to use warpinator from nemo file browser."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.1"

RPM_NAME = "nemo-extension-warpinator-1.6.1-1.1.noarch.rpm"
RPM_HASH = "30d1a83be5c06fbf991955612b15fe39785ec3d91539f88ad490826e6c88520275b15eb2d1075e996045472bcd4c43a48b46e79e51739d9bfadd7c510aa7ddcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-warpinator"
RDEPENDS:${PN} += "/usr/bin/python3 \
nemo \
warpinator"

inherit rpm
