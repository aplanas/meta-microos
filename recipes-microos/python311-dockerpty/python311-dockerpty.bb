SUMMARY = "Docker API Client"
DESCRIPTION = "Provides the functionality needed to operate the pseudo-tty (PTY) allocated to \
a docker container, using the Python client."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python311-dockerpty-0.4.1-5.3.noarch.rpm"
RPM_HASH = "3490df946fcc97f3a583b4ee4fcd6a2fa5510b5b0f0c772d292fab7afb9ba3b577c8e2a8a6711ef60da3b02ef646f42f4dbdfa85348a047142afbe21d6265cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dockerpty) python311-dockerpty python3dist(dockerpty)"
RDEPENDS:${PN} += "python(abi) python311-docker python311-six"

inherit rpm
