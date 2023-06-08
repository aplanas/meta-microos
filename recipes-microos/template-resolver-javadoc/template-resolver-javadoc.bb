SUMMARY = "API Documentation for template-resolver"
DESCRIPTION = "JavaDoc documentation for template-resolver"
LICENSE = "Apache-2.0"

PV = "0.1"

RPM_NAME = "template-resolver-javadoc-0.1-2.6.noarch.rpm"
RPM_HASH = "34331e9d1ce86d164ded97d7c4e235fa32b38f0bd5c043b02e2350f0107e01d1caeb14563d700ea04d9419da3efa5c13454746ef711039bf04fd73181aee279c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "template-resolver-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
