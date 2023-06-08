SUMMARY = "Abseil Python Common Libraries"
DESCRIPTION = "This package is a collection of Python library code for building Python \
applications. The code is collected from Google's own Python code base, and has \
been extensively tested and used in production. \
* Simple application startup \
* Distributed commandline flags system \
* Custom logging module with additional features \
* Testing utilities"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python310-abseil-1.2.0-1.3.noarch.rpm"
RPM_HASH = "cccc8a52b2835622515a493d87140bb9f60c7ae3412177c6e8133b48e0f633e3a6396d4441f111cf93b58a71b9504a1e1367e30ad204c9da31a0bf7464f4fc92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-abseil python3-absl-py python3.10dist(absl-py) python310-abseil python310-absl-py python3dist(absl-py)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
