SUMMARY = "XML:DB API for Java"
DESCRIPTION = "The API interfaces are what driver developers must implement when \
creating a new driver, and are the interfaces that applications are \
developed against. Along with the interfaces, a concrete DriverManager \
implementation is also provided."
LICENSE = "Apache-1.1"

PV = "0.1"

RPM_NAME = "xmldb-api-0.1-27.6.noarch.rpm"
RPM_HASH = "3a4b7f21b053d4dcd69d3c272e523e8fc5b5e3dbf6d8c6e9a759493f92fccad87f7c1a68f08f4f7b8c4b2478cb6359ac6871b0c81d8a1a58e8e66d2a39caed4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmldb-api"
RDEPENDS:${PN} += "xalan-j2"

inherit rpm
