SUMMARY = "Devel files for lxqt-panel"
DESCRIPTION = "LXQt panel development files and headers"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-panel-devel-1.3.0-1.1.noarch.rpm"
RPM_HASH = "3326c14ce45127f5ed67ddfddd9acac35bc5ed646cb1c8e3db99e88be3ff1a8f25ea27115a7b55556471921c626600c8f856585ff079f620a39de163914b6eb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-panel-devel"
RDEPENDS:${PN} += "lxqt-panel"

inherit rpm
