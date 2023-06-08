SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "python310-podman-4.3.0-1.3.noarch.rpm"
RPM_HASH = "0a361f491bb9d8515d00a01d18a9a4567d0632f1bbec4318a69bcd539448b43fd4015327e46333031d2fc4670d6616a78102fd4be7f107989f299e57e60ab204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-podman python3.10dist(podman) python310-podman python3dist(podman)"
RDEPENDS:${PN} += "python(abi) python310-psutil python310-python-dateutil python310-requests python310-setuptools python310-varlink"

inherit rpm
