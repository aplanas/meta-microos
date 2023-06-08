SUMMARY = "Multihash implementation in Python"
DESCRIPTION = "Multihash is a protocol for differentiating outputs from \
various well-established hash functions, addressing size \
and encoding considerations."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-py-multihash-2.0.1-1.9.noarch.rpm"
RPM_HASH = "7e32235a59530af9d815f73e9fddd330c3e7ed85e159261a44d2c103fb484f7119cd89a5061086a9b991389a9c44deabb91f2ff35679a69385543357bec67b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(py-multihash) python39-py-multihash python3dist(py-multihash)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
