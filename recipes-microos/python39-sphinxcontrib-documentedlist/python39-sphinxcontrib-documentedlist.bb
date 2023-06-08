SUMMARY = "Sphinx DocumentedList extension"
DESCRIPTION = "Sphinx extension to convert a Python list into a table in the generated \
documentation. The intended application of this extension is to document \
the items of essentially list-like objects of immutable data (possibly \
enums, though python 3.4 enums are not supported yet). \
 \
In the source code, each list item, instead of being just its native \
data type, should be replaced by a tuple of two elements. In the \
simplest application, the second element of the tuple should be a string \
providing a description for the item."
LICENSE = "BSD-2-Clause"

PV = "0.6"

RPM_NAME = "python39-sphinxcontrib-documentedlist-0.6-3.1.noarch.rpm"
RPM_HASH = "aff2e5fa1d701a8a41299352744a57672e054acbdd5fff9befc5680632a6010f9967ccf4c91cf8be25f81981865e3091412e66a4e71a09ff9b2d8efc7dd7f4c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-documentedlist) python39-sphinxcontrib-documentedlist python3dist(sphinxcontrib-documentedlist)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx python39-six"

inherit rpm
