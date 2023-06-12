SUMMARY = "Python computational pipeline management package"
DESCRIPTION = "The Ruffus module is a way to add support for running computational pipelines."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python310-ruffus-2.8.4-2.5.noarch.rpm"
RPM_HASH = "d9f89fbbb81b2603edc5a46d16573fa054a129d2ef91fb36678c067b0f323a8eee1f2e51d96ffce82515e37402f36655224b6820670055efe30381ce1ea0b035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruffus \
python3.10dist(ruffus) \
python310-ruffus \
python3dist(ruffus)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
