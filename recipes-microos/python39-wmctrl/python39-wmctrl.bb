SUMMARY = "Python programmatic control of X windows"
DESCRIPTION = "Python tool to programmatically control windows inside X."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python39-wmctrl-0.4-2.3.noarch.rpm"
RPM_HASH = "7a0b5f65b0e4fc9a9ce3fc65fb61ef3f40522bad8b74a287224aa07ac7f2bdddf9a1928372f2ceb72c8ef3a3ef646d6ede65815bf5d2b786fb109580e70b5c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wmctrl) python39-wmctrl python3dist(wmctrl)"
RDEPENDS:${PN} += "python(abi) wmctrl xorg-x11-server"

inherit rpm
