SUMMARY = "Pass backend for python-keyring"
DESCRIPTION = "python-keyring backend getting data from pass."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-keyring-pass-0.7.1-1.3.noarch.rpm"
RPM_HASH = "fa12ea69e7cb2cc79ff7b9d9b2da95fd681cbb5fa86d2d06f4798e2edf7278849d862d0942f4a3b60da362a38c0767541a85f7314353cd142895274459d5ce65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keyring-pass python3.10dist(keyring-pass) python310-keyring-pass python3dist(keyring-pass)"
RDEPENDS:${PN} += "python(abi) python310-jaraco.classes python310-keyring"

inherit rpm
