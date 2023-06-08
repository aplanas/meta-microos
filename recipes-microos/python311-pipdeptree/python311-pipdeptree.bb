SUMMARY = "Command line utility to show dependency tree of packages"
DESCRIPTION = "Command line utility to show dependency tree of packages."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python311-pipdeptree-2.7.1-1.1.noarch.rpm"
RPM_HASH = "10a144676077ff155d318cf0247d983afd55f1eb247f959fea3cd39fb39fd18d74981a259fa4d3b28d940a10a46663d180dd5b93bc4f4e7195ff8f74d73ffa4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pipdeptree) python311-pipdeptree python3dist(pipdeptree)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-pip update-alternatives"

inherit rpm
