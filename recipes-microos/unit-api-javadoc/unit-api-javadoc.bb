SUMMARY = "Javadoc for unit-api"
DESCRIPTION = "This package contains javadoc for unit-api."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "unit-api-javadoc-1.0-1.18.noarch.rpm"
RPM_HASH = "7827080c22d845ad3e2114eb4786489699e5ad38a561524e8e870c2f67368acb194f395cd3cd13d62e50cc5455e85c6e3ac8c4c100c6812b625441425f864cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unit-api-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
