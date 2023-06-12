SUMMARY = "OpenStack Oslo context library"
DESCRIPTION = "The Oslo context library has helpers to maintain useful information \
about a request context. \
The request context is usually populated in the WSGI pipeline and \
used by various modules such as logging. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python3-oslo.context-5.0.0-1.4.noarch.rpm"
RPM_HASH = "dab3b31fee6f57c8ab0ac4bfbd835d2739486214a267ceb568e32c0bbfd20621a08c2998451b68134e2811db501605265046fd0b7cc8694cf4be38d006e34295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.context \
python3.10dist(oslo.context) \
python3dist(oslo.context)"
RDEPENDS:${PN} += "python(abi) \
python3-debtcollector"

inherit rpm
