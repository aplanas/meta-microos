SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.4"

RPM_NAME = "python311-rt-3.0.4-1.4.noarch.rpm"
RPM_HASH = "61330c891eec5c2d8bc51cbc8d199124c22a7674148495c8b95dc88a025ab317cd84a81bbe836efc300d308e8efcde29aa08fd59a8466e5f24430906df6bec46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rt) python311-rt python3dist(rt)"
RDEPENDS:${PN} += "python(abi) python311-requests python311-six"

inherit rpm
