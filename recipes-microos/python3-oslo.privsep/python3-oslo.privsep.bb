SUMMARY = "OpenStack library for privilege separation"
DESCRIPTION = "OpenStack library for privilege separation"
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "python3-oslo.privsep-3.0.1-1.3.noarch.rpm"
RPM_HASH = "994beaf63db8ffb4973c0564195cc088e51dbc6a3f69b3a700caacf9a0750c0da2fe04e136d4c45b1dc257ed438da0495e04ce6ced6b25e0d7042ac769c3f9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.privsep python3.10dist(oslo.privsep) python3dist(oslo.privsep)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-cffi python3-eventlet python3-greenlet python3-msgpack python3-oslo.config python3-oslo.i18n python3-oslo.log python3-oslo.utils"

inherit rpm
