SUMMARY = "Common data files for the Cheese webcam booth"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects. \
 \
This package contains common data that is used by the cheese libraries, \
like schemas."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "libcheese-common-44.0.1-1.1.noarch.rpm"
RPM_HASH = "0d21b912e21c2b482baf9ed6d3e03182537d80a91ac905230b421ed6a434dfc549466941819f17393572e49f7067ba5f4c1880c070f812fdf179d4f28c40c19e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcheese-common"
RDEPENDS:${PN} += ""

inherit rpm
