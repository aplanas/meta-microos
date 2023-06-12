SUMMARY = "Docker API Client"
DESCRIPTION = "Provides the functionality needed to operate the pseudo-tty (PTY) allocated to \
a docker container, using the Python client."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python39-dockerpty-0.4.1-5.3.noarch.rpm"
RPM_HASH = "b8ed3fe84f7ccf517c6fcb427a1ff6929b418e090fba0dea7f24509390392bd127588994e45b7084cafa8d3fc740edbac2e28be7d3799bb2a21cb088ab187112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dockerpty) \
python39-dockerpty \
python3dist(dockerpty)"
RDEPENDS:${PN} += "python(abi) \
python39-docker \
python39-six"

inherit rpm
