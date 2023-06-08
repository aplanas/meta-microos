SUMMARY = "AWS authentication for Amazon S3 for the python requests module"
DESCRIPTION = "AWS authentication for Amazon S3 for the Python 'requests' library. \
It is made to work with Python 2.7 and 3. \
At the moment, only S3 is supported."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "python39-requests-aws-0.1.8-3.11.noarch.rpm"
RPM_HASH = "9305f6b4e27b291638867861d6e2a59fb975629caa2b8e5f3ce384d531509a6fee306d4148c2a73c75f24a52ac1beeb55effbfb554a510529882de05a9a8ab0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-aws) python39-requests-aws python3dist(requests-aws)"
RDEPENDS:${PN} += "python(abi) python39-requests"

inherit rpm
