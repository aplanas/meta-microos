SUMMARY = "Module for creating simple ASCII tables"
DESCRIPTION = "texttable is a module to generate a formatted text table, using ASCII \
characters."
LICENSE = "MIT"

PV = "1.6.7"

RPM_NAME = "python39-texttable-1.6.7-1.3.noarch.rpm"
RPM_HASH = "b7df9a53664e9d62b9e14ac88444a56ab117ccc9d7b827018a8630ad54d195b5c85ad2c82ae980a3a5968caaeeba4d55f597f7392eeee10225bdacf785dd039e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(texttable) python39-texttable python3dist(texttable)"
RDEPENDS:${PN} += "python(abi) python39-base"

inherit rpm
