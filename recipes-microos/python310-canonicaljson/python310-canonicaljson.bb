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

RPM_NAME = "python310-canonicaljson-1.6.5-1.2.noarch.rpm"
RPM_HASH = "6dbd2275bea72f4a3b0ca6816691dd8b5042e7853ebcbad69ea4efbdad7c071c8c244568ace9bad7b49893009e94f99d54e683648ab939eb2df0e760728edcc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-canonicaljson python3.10dist(canonicaljson) python310-canonicaljson python3dist(canonicaljson)"
RDEPENDS:${PN} += "python(abi) python310-frozendict python310-simplejson python310-six python310-typing_extensions"

inherit rpm
