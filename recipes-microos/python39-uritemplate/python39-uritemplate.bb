SUMMARY = "URI Template Expansison"
DESCRIPTION = "This is a Python implementation of RFC6570, URI Template, and can expand \
templates up to and including Level 4 in that specification"
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python39-uritemplate-4.1.1-2.3.noarch.rpm"
RPM_HASH = "407118256030bbfe91b454b816fa4821378f3f9c80b9ea083a46c59e5fb782685db27b4cd9d8a0253f234217531ad4d9f862dfe35d6ca530a8c616a4c55840f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(uritemplate) python39-uritemplate python3dist(uritemplate)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
