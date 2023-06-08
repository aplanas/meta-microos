SUMMARY = "Shared ruamel routines"
DESCRIPTION = "This is a common package for the 'ruamel' namespace."
LICENSE = "MIT"

PV = "1.0.0+post1"

RPM_NAME = "python39-ruamel.base-1.0.0+post1-2.14.noarch.rpm"
RPM_HASH = "28c3a3e2fce9d661a7910707d9413959b2369057f32332e92e36323fa70c77aa7c6ccb350404ec2fbb68646b20884388f18bda5fd8de4d8b519a6152a2d2e825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ruamel.base) python39-ruamel.base python3dist(ruamel.base)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
