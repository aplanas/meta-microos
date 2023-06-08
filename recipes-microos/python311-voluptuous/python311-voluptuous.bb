SUMMARY = "A Python data validation library"
DESCRIPTION = "Voluptuous is a Python data validation library. It validates data \
coming into Python as JSON, YAML, etc."
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python311-voluptuous-0.13.1-1.3.noarch.rpm"
RPM_HASH = "a5baa086188aa35b681f639fcb12367bb1e234aec8cf6731e3ffd9e9bc51525517ecefa24c4078e4511f5398f8c85e58975205c4cb60883b7a218d9b50a03490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(voluptuous) python311-voluptuous python3dist(voluptuous)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
