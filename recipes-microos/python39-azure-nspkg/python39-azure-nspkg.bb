SUMMARY = "Microsoft Azure namespace package"
DESCRIPTION = "This is the Microsoft Azure namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python39-azure-nspkg-3.0.2-3.9.noarch.rpm"
RPM_HASH = "6e16cb0e2bebd73a73e93b86a52a8fc180833ca942b6d41508564f12678f5657573929b5afe0af3858198d8a98e9e28792a050e84ae4328d458c638fbef440c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-nspkg) python39-azure-nspkg python3dist(azure-nspkg)"
RDEPENDS:${PN} += ""

inherit rpm
