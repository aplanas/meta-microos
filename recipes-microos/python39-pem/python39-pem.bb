SUMMARY = "PEM file parsing in Python"
DESCRIPTION = "pem is a Python module for parsing and splitting of PEM files, \
i.e. Base64 encoded DER keys and certificates."
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python39-pem-21.2.0-1.4.noarch.rpm"
RPM_HASH = "b0fb8ebdcbaab200a069e111e1b5cdbef4f7867e702b7deeafee6d4235ae477db652a8327c7539ed59f1a6ceaaa951ce96bbdc79e6b94206eb002e0a6378dfda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pem) \
python39-pem \
python3dist(pem)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
