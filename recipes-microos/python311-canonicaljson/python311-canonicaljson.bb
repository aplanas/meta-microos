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

RPM_NAME = "python311-canonicaljson-1.6.5-1.2.noarch.rpm"
RPM_HASH = "8a33699e1df4e1e1068b746f9589a9146387203550976c1653dd05ed80ae5e513c32c34279a573b9385303b312881949851a73e72e337427017bb96d3a4a3ad4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(canonicaljson) python311-canonicaljson python3dist(canonicaljson)"
RDEPENDS:${PN} += "python(abi) python311-frozendict python311-simplejson python311-six python311-typing_extensions"

inherit rpm
