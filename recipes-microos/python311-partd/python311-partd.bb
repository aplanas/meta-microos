SUMMARY = "Appendable key-value storage"
DESCRIPTION = "Key-value byte store with appendable values \
 \
Partd stores key-value pairs. \
Values are raw bytes. \
We append on old values. \
 \
Partd excels at shuffling operations."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python311-partd-1.3.0-1.3.noarch.rpm"
RPM_HASH = "a27bef930bb7fd04bb1dc380b5cf43c5803698e4c75a2a987301ee72604219c46732afb648aad85887ed6fb0894bdb3ba82a9a95e49f7c0243feaf0a18ce26b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(partd) \
python311-partd \
python3dist(partd)"
RDEPENDS:${PN} += "python(abi) \
python311-locket \
python311-toolz"

inherit rpm
