SUMMARY = "Compatibility shims for pip versions 8 thru current"
DESCRIPTION = "Compatibility shims for pip versions 8 thru current."
LICENSE = "ISC"

PV = "0.7.3"

RPM_NAME = "python311-pip-shims-0.7.3-1.3.noarch.rpm"
RPM_HASH = "71e7a7ed5abbe6a21cea4275372c237430a1bfd84d85a208dc7c4a6809c552b90c92be6cdf16282269f128453b0f0aef0265fc6545f9dc43a4000bcefbc4a006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pip-shims) python311-pip-shims python3dist(pip-shims)"
RDEPENDS:${PN} += "python(abi) python311-pip python311-setuptools python311-wheel"

inherit rpm
