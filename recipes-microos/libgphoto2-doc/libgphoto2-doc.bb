SUMMARY = "Documentation for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
This is the user documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2-doc-2.5.30-2.1.noarch.rpm"
RPM_HASH = "3c44e525c5bf29087aed8f7936c9f01cd8a72c96f2fff2ef3a9f9b1eeff849c26fb9420f8b814f6692996fab0dd89fc60708f995fdb9bbc5132ac4e740990555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgphoto2-doc"
RDEPENDS:${PN} += ""

inherit rpm
