SUMMARY = "Python wrapper for the Kismet REST interface"
DESCRIPTION = "Simplified Python API for the Kismet REST interface."
LICENSE = "GPL-2.0"

PV = "2019.05.02"

RPM_NAME = "python310-kismet-rest-2019.05.02-1.14.noarch.rpm"
RPM_HASH = "91ec2400bc4bb6fd412283e4cba344e1f9f601aafb4b823c76cd7dc6020fc1642b917cf5c258155c43776792481f1de9c2e69bdd986b8aa4fc17d4b8af31abcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kismet-rest \
python3.10dist(kismet-rest) \
python310-kismet-rest \
python3dist(kismet-rest)"
RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
