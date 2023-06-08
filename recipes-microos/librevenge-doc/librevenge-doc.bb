SUMMARY = "Documentation of librevenge API"
DESCRIPTION = "The librevenge-doc package contains documentation files for librevenge."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "0.0.5"

RPM_NAME = "librevenge-doc-0.0.5-1.3.noarch.rpm"
RPM_HASH = "b1a26c96f8f28e03691e4d80ae20c5abff22300955054663838220528a5a8b17b39403f6fbd9c01c95a0b8dc8a8711359e0b69cdc37148acdf30c1b0e08938f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librevenge-doc"
RDEPENDS:${PN} += ""

inherit rpm
