SUMMARY = "A library for installing Python wheels"
DESCRIPTION = "A library for installing Python wheels."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-installer-0.7.0-2.1.noarch.rpm"
RPM_HASH = "750c14c3473e89d1a45ec2fbfea4bb51c696cf9d834ca2ce1391148cb6eecf3de0a80318a4dace4a350309e4b61083cc7a806b61571cb66c0c95c65b8c67ddc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-installer python3.10dist(installer) python310-installer python3dist(installer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
