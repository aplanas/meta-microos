SUMMARY = "Lightweight FreeIPA client"
DESCRIPTION = "python-freeipa is lightweight FreeIPA client."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python310-freeipa-1.0.6-1.8.noarch.rpm"
RPM_HASH = "d2a65fabd2aabd81a00ff1c33d3e2d3513b97eaec3638c45448ea5a08f4414058c8fe5252f52e75bb0f16fc073dd2e3f15ab73e0ff3b98f06fa9e19154ddcc62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-freeipa python3.10dist(python-freeipa) python310-freeipa python3dist(python-freeipa)"
RDEPENDS:${PN} += "python(abi) python310-requests"

inherit rpm
