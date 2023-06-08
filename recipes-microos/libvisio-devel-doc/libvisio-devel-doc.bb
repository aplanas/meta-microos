SUMMARY = "Documentation for the libvisio API"
DESCRIPTION = "This package contains documentation for the libvisio API."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libvisio-devel-doc-0.1.7-1.26.noarch.rpm"
RPM_HASH = "cb35fc5ee6d814524321475b0b35317d99b5a7e8f6064822035596aa67fcef447c4f349c26bf4decc1e694c36c3aa5e7c5e01fe57b528c7e98064661ca20ba0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvisio-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
