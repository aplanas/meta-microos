SUMMARY = "JavaScript minifier"
DESCRIPTION = "JavaScript minifier."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-jsmin-3.0.1-1.6.noarch.rpm"
RPM_HASH = "58705979f9dc99b544e3b3435b3a844fc59c11b3f80c029892e1cfdd1c0204bfa30ab3dd3b9a23c944bd4214ead521a4e16cd8629d129f2ad660f5c0bec8c44a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsmin) \
python39-jsmin \
python3dist(jsmin)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
