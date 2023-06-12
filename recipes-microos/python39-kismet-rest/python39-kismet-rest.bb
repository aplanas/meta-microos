SUMMARY = "Python wrapper for the Kismet REST interface"
DESCRIPTION = "Simplified Python API for the Kismet REST interface."
LICENSE = "GPL-2.0"

PV = "2019.05.02"

RPM_NAME = "python39-kismet-rest-2019.05.02-1.14.noarch.rpm"
RPM_HASH = "3532c0fc64d801184c5abe0f4bf61930584b84a38ac1afbb2b89541d6527b1ab9557c373fcb40ccfceb82fda41df057da9d3f3fe49bf9bf4be59f44acc5564c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(kismet-rest) \
python39-kismet-rest \
python3dist(kismet-rest)"
RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
