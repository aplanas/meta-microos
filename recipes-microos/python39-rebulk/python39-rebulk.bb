SUMMARY = "Library for defining bulk search patterns to perform advanced string matching"
DESCRIPTION = "ReBulk is a Python library that performs advanced searches in \
strings that would be hard to implement using the re module or \
String methods only. \
 \
It includes some features like Patterns, Match, Rule that \
allow building a custom and complex string matcher."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python39-rebulk-3.2.0-1.2.noarch.rpm"
RPM_HASH = "c3d156034a4f31410dbf7a9296f2d1deec4ca5533b5a179b723ba33904a948d862bcafa9c95c36170f95067da103f2a87a16d0f67fe747463710ec1577aa1c46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rebulk) python39-rebulk python3dist(rebulk)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
