SUMMARY = "Email bounce detectors"
DESCRIPTION = "Email bounce detectors."
LICENSE = "Apache-2.0"

PV = "4.0"

RPM_NAME = "python311-flufl.bounce-4.0-3.3.noarch.rpm"
RPM_HASH = "a016f42bebf9d22a71dc461aea23762b52b9d3f8a13d0e634dc1cb05998c789f87feff945023e20bd73ad86cd3ffef3696e3bde84edd62806aebc5e76665b10d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flufl.bounce) python311-flufl.bounce python3dist(flufl.bounce)"
RDEPENDS:${PN} += "python(abi) python311-atpublic python311-zope.interface"

inherit rpm
