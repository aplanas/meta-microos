SUMMARY = "Python interface to Request Tracker API"
DESCRIPTION = "Python implementation of Request Tracker (a ticketing system) REST API described here: https://rt-wiki.bestpractical.com/wiki/REST"
LICENSE = "GPL-3.0-only"

PV = "3.0.4"

RPM_NAME = "python311-rt-3.0.4-1.3.noarch.rpm"
RPM_HASH = "27fe7427d86e1a4a10ecf74c52738b10a06a279db46b5fe010bdb193040e532213b4473db7d9212a70688c4207dd93815b32c3f52ddad0e09cc3eb87a20f4a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rt) python311-rt python3dist(rt)"
RDEPENDS:${PN} += "python(abi) python311-requests python311-six"

inherit rpm
