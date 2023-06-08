SUMMARY = "Generate RSS2 using a Python data structure"
DESCRIPTION = "A Python library for generating RSS 2.0 feeds."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python311-PyRSS2Gen-1.1-2.13.noarch.rpm"
RPM_HASH = "ccef57534efaff2fc1ae98c61f57bfb9ef1c8989a60c3bfba46b4341cc5239ce9b839f58c684d971a3047587c4995f0d1ed3944e6d19649cdf1644ebc6b13a9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyrss2gen python3.11dist(pyrss2gen) python311-PyRSS2Gen python3dist(pyrss2gen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
