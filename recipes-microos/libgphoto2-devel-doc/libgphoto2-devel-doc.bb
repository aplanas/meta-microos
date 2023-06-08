SUMMARY = "Development documentation for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
This is its API documentation in HTML format."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2-devel-doc-2.5.30-2.1.noarch.rpm"
RPM_HASH = "5f9cadb44cdfe13aba5015bc92957b8e371bf1c9f0913f9bfb49520dccd045bc77e8758cc49dba1db4d8e4cc1ea6e678fdc26bf1e362bc20a4a54892dfb8e799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgphoto2-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
