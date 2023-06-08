SUMMARY = "Network UPS Tools - Images for Documentation"
DESCRIPTION = "Images for the documentation. It is a supplementary package for some NUT \
documentation packages. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-doc-images-2.8.0-2.1.noarch.rpm"
RPM_HASH = "45def7ebdd74a8b4ba170af46a7540856cd4ec8453b95d3d480bcd743b3bda430620bff611aa4dcdc19a97f4297ef8f74336c44e5b6bba7f6f9b86d5c3fac456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-doc-images"
RDEPENDS:${PN} += "nut-doc-images"

inherit rpm
