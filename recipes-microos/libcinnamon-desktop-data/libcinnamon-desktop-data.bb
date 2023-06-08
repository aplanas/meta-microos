SUMMARY = "Libcinnamon-desktop API -- Common Files"
DESCRIPTION = "cinnamon-desktop contains the libcinnamon-desktop library, the \
cinnamon-about program as well as some desktop-wide documents. \
 \
This package includes files that are shared between several \
Cinnamon applications (configuration schemas)."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.6.2"

RPM_NAME = "libcinnamon-desktop-data-5.6.2-1.1.noarch.rpm"
RPM_HASH = "4ea7f819c488d4ded7dcd5ce11f942f0340f6a76eee114fcf5a856260f1323b17f0092843018f6ab0ce3953f80b5200453c247c8dc535a243119f9242b7904e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-desktop-lang libcinnamon-desktop-data"
RDEPENDS:${PN} += "libcinnamon-desktop-data-branding pam python3-gobject"

inherit rpm
