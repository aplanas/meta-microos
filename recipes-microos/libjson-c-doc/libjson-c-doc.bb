SUMMARY = "Documentation files"
DESCRIPTION = "JSON-C implements a reference counting object model that allows you to \
easily construct JSON objects in C, output them as JSON formatted \
strings and parse JSON formatted strings back into the C \
representation of JSON objects. \
 \
This package includes the json-c documentation."
LICENSE = "MIT"

PV = "0.16"

RPM_NAME = "libjson-c-doc-0.16-1.6.noarch.rpm"
RPM_HASH = "570b4d01e171e1de11648dcd997df277d9fe1e06be533edf4b90274579efbcaaafce03d7b9756d528a84854d5a55efab0f27edec2406c0a79c5499f0455b55aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libjson-c-doc \
libjson-doc"
RDEPENDS:${PN} += ""

inherit rpm
