SUMMARY = "Intelligent predictive text entry platform (documentation)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the libpresage API Documentation in HTML format."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "libpresage-doc-0.9.1-12.6.noarch.rpm"
RPM_HASH = "d033b08fd43c72c907c839301271e4b997573488bd1082b0c433f542c2773360c14d7f9ed553ec8c6bc1cc302449886c4a9d0f875af2fb337399ef6fec825dae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpresage-doc"
RDEPENDS:${PN} += ""

inherit rpm
