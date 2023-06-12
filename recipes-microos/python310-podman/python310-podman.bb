SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "python310-podman-4.5.1-1.1.noarch.rpm"
RPM_HASH = "e5ed6e19df82d547c61024d683fc605b0e4ef8b9a52537c6e7b5f7231c17965a2082e8962432f0cc37cb7084f1e61e09523381c62bc1928c7bd9891e6060e51e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-podman \
python3.10dist(podman) \
python310-podman \
python3dist(podman)"
RDEPENDS:${PN} += "python(abi) \
python310-pyxdg \
python310-requests \
python310-urllib3"

inherit rpm
