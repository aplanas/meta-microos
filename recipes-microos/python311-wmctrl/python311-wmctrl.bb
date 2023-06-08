SUMMARY = "Python programmatic control of X windows"
DESCRIPTION = "Python tool to programmatically control windows inside X."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-wmctrl-0.4-2.3.noarch.rpm"
RPM_HASH = "1a4a34380a31cc392a53eb35bd272d4401bf6d60edc03d29e9671da7d822e0462f2923bdb3ca8b9e601767893ed66a4de915c812b2fe023fae1374bd78f128e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wmctrl) python311-wmctrl python3dist(wmctrl)"
RDEPENDS:${PN} += "python(abi) wmctrl xorg-x11-server"

inherit rpm
