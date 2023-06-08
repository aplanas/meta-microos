SUMMARY = "Miscellaneous path functions for jaraco packages"
DESCRIPTION = "jaraco.path provides cross platform hidden file detection \
and other miscellaneous path helper functions."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python310-jaraco.path-3.5.0-1.1.noarch.rpm"
RPM_HASH = "153adb86a6fcfe7bfe6af0fa7227801f38dd7e83e4207f6b6a08abd781b5e0d03ffedeed7b22cdadadbccfc1bdbfc8985deacdd77196b7f79311b085821b2a1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.path python3.10dist(jaraco.path) python310-jaraco.path python3dist(jaraco.path)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
