SUMMARY = "Military stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-military package contains a set of 'Rubber Stamp' \
images which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-military-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "5226b64edacdcb2d5ea5bca3df6f7e31e03fd84bf26d72278d80c52c216c60166f9552bda6d60ab916dd165267890336d4a4491927d8773c7453c083336f7db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-military"
RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
