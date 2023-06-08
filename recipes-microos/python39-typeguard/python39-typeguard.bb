SUMMARY = "Library for runtime checking of Python types"
DESCRIPTION = "This library provides run-time type checking for functions defined with PEP 484 argument (and return) type annotations."
LICENSE = "MIT"

PV = "2.13.3"

RPM_NAME = "python39-typeguard-2.13.3-2.1.noarch.rpm"
RPM_HASH = "6d30f74d02df1b79e7a40c98e4fff88ba36ea510b3d5111d860ab6c378978ed5e58622fd12fb9e38e1e52413ebdd373791b9cb37a65cea8a61a3caf6811c4e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(typeguard) python39-typeguard python3dist(typeguard)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
