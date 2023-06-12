SUMMARY = "Clothes stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-clothes package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-clothes-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "7ccb3e2d669f3a2ab8071f498aba4c1c7c8e85164331bf1d2a27995bc21790ead02afbbc6b8e464b11ec6eb89a73e19e47817e9a2a2b37f71573f1fb4c97fe6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-clothes"
RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
