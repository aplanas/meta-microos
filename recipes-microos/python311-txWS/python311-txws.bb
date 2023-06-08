SUMMARY = "Twisted WebSockets wrapper"
DESCRIPTION = "txWS (Twisted WebSockets) is a library for \
adding WebSockets server support to Twisted applications."
LICENSE = "X11"

PV = "0.9.1"

RPM_NAME = "python311-txWS-0.9.1-3.15.noarch.rpm"
RPM_HASH = "6c7ae93896094b3e61e28c9547706bb28b0dd4157f5116f4b1815d1f759ba51f4525002624513e1cce2c6ebe260725a03412f2a4ce0cdb1d3356d04a19c1fe00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(txws) python311-txWS python3dist(txws)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
