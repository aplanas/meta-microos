SUMMARY = "Python programmatic control of X windows"
DESCRIPTION = "Python tool to programmatically control windows inside X."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python310-wmctrl-0.4-2.3.noarch.rpm"
RPM_HASH = "262e01366d73cce807f28789b5f9cc530ea15500010825ec633dc4007e1d979c2317d1cec9d4d91c39d7e9399fe983bb09a7b0b7de65e591afbc473feada4b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wmctrl \
python3.10dist(wmctrl) \
python310-wmctrl \
python3dist(wmctrl)"
RDEPENDS:${PN} += "python(abi) \
wmctrl \
xorg-x11-server"

inherit rpm
