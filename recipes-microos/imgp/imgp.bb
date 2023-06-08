SUMMARY = "Image resizer and rotator"
DESCRIPTION = "A command line image resizer and rotator for JPEG and PNG images \
based on python-Pillow."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "imgp-2.8-1.8.noarch.rpm"
RPM_HASH = "9abd5efbd361cfe69676831d5adb16a17b446e5a1895dc5e7eb36dd1b85eabffa84e57b2ae30c13d8f68f06a47072845d630c29062c43ca63a234f2fdffcab2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imgp"
RDEPENDS:${PN} += "/usr/bin/env python3-Pillow python3-base"

inherit rpm
