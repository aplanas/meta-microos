SUMMARY = "Abstraction over multiple cloud provider APIs"
DESCRIPTION = "Apache Libcloud is a standard Python library that abstracts away \
differences among multiple cloud provider APIs."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "python310-apache-libcloud-3.7.0-1.5.noarch.rpm"
RPM_HASH = "bc5ffa471600f69acdd6647f1c21e0995b6573c192150f7da89992a2e7c7dd77a69143730fa32cba28074fe3fec4b57466eff5a485fcaa70893ea3201c2b10be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apache-libcloud python3.10dist(apache-libcloud) python310-apache-libcloud python3dist(apache-libcloud)"
RDEPENDS:${PN} += "python(abi) python310-lxml python310-requests python310-typing"

inherit rpm
