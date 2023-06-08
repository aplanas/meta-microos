SUMMARY = "Get/set values in JSON and Python datastructures"
DESCRIPTION = "JSONxs is a Python library that uses a path expression string to get and \
set values in JSON and Python datastructures. It's slightly similar to \
JSONPath, but supports only simpler expressions and allows \
modifications. \
JSONxs is safe to use with untrusted input."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "python39-jsonxs-0.6-1.14.noarch.rpm"
RPM_HASH = "3b7172306b1d0a73b4bbc8ec969534874b06d1a3efaeb9a6553ebddcd849f52e860b7e2dc308f550eae359fecde145bace395aaec81ede2df23b4570c3486355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonxs) python39-jsonxs python3dist(jsonxs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
