SUMMARY = "Multihash implementation in Python"
DESCRIPTION = "Multihash is a protocol for differentiating outputs from \
various well-established hash functions, addressing size \
and encoding considerations."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-py-multihash-2.0.1-1.9.noarch.rpm"
RPM_HASH = "4751c43be7168c9d0aa0220d10aa0489e7c8ff3e5f0e4b43b1dd29d3d9386c35124734980f7dfc2224c0773740d954e34a3e78a6013dc57ebc84f7feefecd9ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-multihash python3.10dist(py-multihash) python310-py-multihash python3dist(py-multihash)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
