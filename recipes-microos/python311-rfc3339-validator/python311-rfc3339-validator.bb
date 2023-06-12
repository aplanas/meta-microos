SUMMARY = "A pure python RFC3339 validator"
DESCRIPTION = "A pure python RFC3339 validator"
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python311-rfc3339-validator-0.1.4-2.1.noarch.rpm"
RPM_HASH = "51e3afbeab7bbad54fa564e1dcaadd2340943c10f822fc8f7b8d1baab068f78e126164e92815adf77d8f9d91857b469a7d9411f1095ab71958da8b6d0c5d4e5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rfc3339-validator) \
python311-rfc3339-validator \
python3dist(rfc3339-validator)"
RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
