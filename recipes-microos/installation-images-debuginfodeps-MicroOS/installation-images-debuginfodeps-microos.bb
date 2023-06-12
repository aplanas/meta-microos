SUMMARY = "Debuginfo dependencies for MicroOS installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.87"

RPM_NAME = "installation-images-debuginfodeps-MicroOS-17.87-1.9.aarch64.rpm"
RPM_HASH = "1f306599afa2e05224d1b3699f3859676f962452c56ad21213183f56b2f8a8205500513a982649164d0f8a4df67ae6ae4604bc27553427e32f939c39ddcc69bc"

RPROVIDES:${PN} += "debuginfo(build-id) \
installation-images-debuginfodeps \
installation-images-debuginfodeps-MicroOS \
installation-images-debuginfodeps-MicroOS(aarch-64)"
RDEPENDS:${PN} += "debuginfo(build-id)"

inherit rpm
