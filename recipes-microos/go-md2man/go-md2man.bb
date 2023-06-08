SUMMARY = "Tool to converts markdown into man pages"
DESCRIPTION = "Tool to converts markdown into man pages."
LICENSE = "MIT"

PV = "2.0.0+git20190314.f79a8a8"

RPM_NAME = "go-md2man-2.0.0+git20190314.f79a8a8-1.14.aarch64.rpm"
RPM_HASH = "78df9558da82e411cfdbcc881225232e76b61303bcec5800b064cf94049f4627bdd66039db86ba9dd05c72305e612b63ca368b8d2746d1fe1f7916bb3aed4df0"

RPROVIDES:${PN} += "go-go-md2man go-md2man go-md2man(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
