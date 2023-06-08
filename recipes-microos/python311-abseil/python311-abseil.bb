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

RPM_NAME = "python311-abseil-1.2.0-1.3.noarch.rpm"
RPM_HASH = "06336ddb59e67123796c6f787ce89ffc0a5d027db51efdba098f16023b5d01be092a173841fc9041905efa334b18d838b5c0c941e894ae2361715954cc9be4ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(absl-py) python311-abseil python311-absl-py python3dist(absl-py)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
