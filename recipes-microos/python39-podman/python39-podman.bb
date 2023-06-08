SUMMARY = "A library to interact with a Podman server"
DESCRIPTION = "A library to interact with a Podman server"
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "python39-podman-4.3.0-1.3.noarch.rpm"
RPM_HASH = "e6834edbda7901448faa7f9c9a426def9fb5849388d83fc2c4cfa23d7981c74a983bff88fb13740cb461f1657dcfc686653669fd011297d5806c1d9c46d52ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(podman) python39-podman python3dist(podman)"
RDEPENDS:${PN} += "python(abi) python39-psutil python39-python-dateutil python39-requests python39-setuptools python39-varlink"

inherit rpm
