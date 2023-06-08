SUMMARY = "Installation Image Files for MicroOS"
DESCRIPTION = "Files needed for MicroOS installation media."
LICENSE = "GPL-2.0-or-later"

PV = "17.86"

RPM_NAME = "installation-images-MicroOS-17.86-1.29.aarch64.rpm"
RPM_HASH = "49ce7b67f5dc55865a7daa5c90f4e9cb03ae27e16f6d2a1e2b26c9a3800753625c421cefdfd4831e7a46851cfbd2a85182a401aad9accccd3025b3860ed302ae"

RPROVIDES:${PN} += "installation-images installation-images-MicroOS installation-images-MicroOS(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
