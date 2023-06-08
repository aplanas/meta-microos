SUMMARY = "Safely login with ProtonVPN credentials to connect to Proton"
DESCRIPTION = "This package, originally forked from python-srp module implements a simple \
wrapper to Proton Technologies API, abstracting from the SRP authentication."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python310-proton-client-0.7.1-1.9.noarch.rpm"
RPM_HASH = "f8fe7cd5ce37305a93fb6a7c5f3a2dde184dc189754f171afc7f9571cc96e88c9c8e818288c6228600b9c7c11c03962ea3357452bd061a9e1acc93a4ea109bf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proton-client python3.10dist(proton-client) python310-proton-client python3dist(proton-client)"
RDEPENDS:${PN} += "python(abi) python310-bcrypt python310-gnupg python310-pyOpenSSL python310-requests"

inherit rpm
