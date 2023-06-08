SUMMARY = "Documentation for python-tooz"
DESCRIPTION = "The Tooz project aims at centralizing the most common distributed primitives \
like group membership protocol, lock service and leader election by providing \
a coordination API helping developers to build distributed applications. \
 \
This package contains documentation in HTML format."
LICENSE = "Apache-2.0"

PV = "2.11.1"

RPM_NAME = "python-tooz-doc-2.11.1-2.4.noarch.rpm"
RPM_HASH = "5552c8a75ba690287cf1f73dcdeca89b369f3ceb36bb9546ad8f845b37b99a4fe4343f870484eb36168d486f42dc54bf2f5229069420959e35a13c47250f8b45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-tooz-doc"
RDEPENDS:${PN} += ""

inherit rpm
