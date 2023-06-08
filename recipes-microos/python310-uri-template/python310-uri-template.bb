SUMMARY = "RFC 6570 URI Template Processor"
DESCRIPTION = "RFC 6570 URI Template Processor"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-uri-template-1.2.0-2.1.noarch.rpm"
RPM_HASH = "860e63e1d39c2e2d57ba8664c651679802bd26e47c4fbb9114eaef2ed8ae847545c43eb3437de043a07ffe53574ed1e6099c07540a094e55a4338b437942e4ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uri-template python3-uri_template python3.10dist(uri-template) python310-uri-template python310-uri_template python3dist(uri-template)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
