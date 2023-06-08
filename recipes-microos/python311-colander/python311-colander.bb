SUMMARY = "A schema-based serialization and deserialization library"
DESCRIPTION = "An extensible package which can be used to: \
 \
- deserialize and validate a data structure composed of strings, \
  mappings, and lists. \
 \
- serialize an arbitrary data structure to a data structure composed \
  of strings, mappings, and lists."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "1.7.0"

RPM_NAME = "python311-colander-1.7.0-5.12.noarch.rpm"
RPM_HASH = "d449da1868e0a1e73dfb188ff74d03de805fc78109ffd95879c26744f8b09f47b936cd9502cf4f530dc42100a3eda053d0cfdba5a65f4dd5fa379a818ebaa36c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(colander) python311-colander python3dist(colander)"
RDEPENDS:${PN} += "python(abi) python311-iso8601 python311-translationstring"

inherit rpm
