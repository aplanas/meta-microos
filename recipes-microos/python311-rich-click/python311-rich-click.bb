SUMMARY = "Format click help output nicely with rich"
DESCRIPTION = "Format click help output nicely with rich."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python311-rich-click-1.6.1-1.1.noarch.rpm"
RPM_HASH = "d5417336b1fc143762d6729ea1ca5829645ecb9131ad9ef8991e8259ad2f4b53e3d697bdc9ef0ddf41330cde30b313c6c57989537af976896ae489c797523942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rich-click) \
python311-rich-click \
python3dist(rich-click)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-click \
python311-rich"

inherit rpm
