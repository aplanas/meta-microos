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

RPM_NAME = "python39-abseil-1.2.0-1.3.noarch.rpm"
RPM_HASH = "c7e05e71b84cdccffddaef12d4df96dcf3aa95a0b149abcedd423a0adf97d734c854ce04c70c8eafa0000e52a9ea0f3750f3323ed037ee4da422d4c6b9a62499"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(absl-py) python39-abseil python39-absl-py python3dist(absl-py)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
