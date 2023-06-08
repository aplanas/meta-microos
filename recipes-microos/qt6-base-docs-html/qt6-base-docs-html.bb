SUMMARY = "Documentation for qt6-base in HTML format"
DESCRIPTION = "This package contains documentation for qt6-base in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-base-docs-html-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "4d732c817cc7b3e972555c947ecd2aa9282c9674cf008c26bfc19d58f47ecce27e566a7fdc6abc500a37b35a3266189e187b68911aeb34e6f61f49f3ce228532"

RPROVIDES:${PN} += "qt6-base-docs-html qt6-base-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
