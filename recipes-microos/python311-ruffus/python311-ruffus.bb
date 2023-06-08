SUMMARY = "Python computational pipeline management package"
DESCRIPTION = "The Ruffus module is a way to add support for running computational pipelines."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python311-ruffus-2.8.4-2.5.noarch.rpm"
RPM_HASH = "ff736d09753a5f4e7a97dc33a7581a045b35ce0223f14067c10c4d72a60fef51f3e278818285d8680c2f3c5bf4acb74b4a5b897059e9e111871ac6980b61a48f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ruffus) python311-ruffus python3dist(ruffus)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
