SUMMARY = "Canonical JSON for Python"
DESCRIPTION = "This is a Python module which encodes objects and arrays into JSON as per \
RFC 7159. \
 \
* Sorts object keys so that it yields the same result each time. \
* Has no insignificant whitespace to make the output as small as possible. \
* Escapes only the characters that must be escaped, U+0000 to U+0019 / \
  U+0022 / U+0056, to keep the output as small as possible. \
* Uses the shortest escape sequence for each escaped character. \
* Encodes the JSON as UTF-8. \
* Can encode frozendict immutable dictionaries."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "python39-canonicaljson-1.6.5-1.2.noarch.rpm"
RPM_HASH = "6522a09e48a565a2ec416e11deacc1ff5b3332153c4be66d21aaef19202c2c98f3c3ad05b313a6047767f8fb730aa9701a42160ad9075849979f3369bf5c2bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(canonicaljson) python39-canonicaljson python3dist(canonicaljson)"
RDEPENDS:${PN} += "python(abi) python39-frozendict python39-simplejson python39-six python39-typing_extensions"

inherit rpm
