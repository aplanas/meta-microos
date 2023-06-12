SUMMARY = "A library to handle automated deprecations"
DESCRIPTION = "The `deprecation` library provides a `deprecated` decorator and a \
`fail_if_not_removed` decorator for your tests. Together, the two \
enable the automation of several things:"
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python311-deprecation-2.1.0-2.12.noarch.rpm"
RPM_HASH = "c3d71de109fbfc26551e8044a7eeb3478767165ddbba7c58cdaa344fb0d7a1dcaeca33f3fc2335133849b8835638e23a5996fb3f84cf0f4305f3bb12b04f0a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(deprecation) \
python311-deprecation \
python3dist(deprecation)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
