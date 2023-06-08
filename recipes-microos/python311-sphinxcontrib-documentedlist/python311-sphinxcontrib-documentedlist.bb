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

RPM_NAME = "python311-sphinxcontrib-documentedlist-0.6-3.1.noarch.rpm"
RPM_HASH = "58e6fa5c573bfe77c5c8d4749ab190fa1e085066a7b10a76f4ffd63c2f31ad35506a696ddde57350ab8a3330bd0d2a060e829cf812aef0332580bf05279021ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-documentedlist) python311-sphinxcontrib-documentedlist python3dist(sphinxcontrib-documentedlist)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx python311-six"

inherit rpm
