SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "python311-podman-4.3.0-1.3.noarch.rpm"
RPM_HASH = "b26576e23be0d55bf3372a68723fe7775fc910550625b878ba09696cd8da3323691b8e26c56ca39b14ece4a5d544a8deed05385ae9a3880b51891dc58f1072bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(podman) python311-podman python3dist(podman)"
RDEPENDS:${PN} += "python(abi) python311-psutil python311-python-dateutil python311-requests python311-setuptools python311-varlink"

inherit rpm
