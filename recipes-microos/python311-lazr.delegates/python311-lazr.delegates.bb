SUMMARY = "Easily write objects that delegate behavior"
DESCRIPTION = "Easily write objects that delegate behavior"
LICENSE = "LGPL-3.0-only"

PV = "2.0.4"

RPM_NAME = "python311-lazr.delegates-2.0.4-1.13.noarch.rpm"
RPM_HASH = "87b9b575f45d990502def886abcf39d1b348a3a03b862e472717a865e08e740eb2b0d2c2832b29d437bd5d18999c39791f0d9ada13e6774c2878bb422d305105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(lazr.delegates) python311-lazr.delegates python3dist(lazr.delegates)"
RDEPENDS:${PN} += "python(abi) python311-zope.interface"

inherit rpm
