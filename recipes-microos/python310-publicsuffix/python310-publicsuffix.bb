SUMMARY = "Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-publicsuffix-1.1.1-1.12.noarch.rpm"
RPM_HASH = "b6b20127599aeb078f3822b59ac3f55ff752f3ab104ba294be4f5100999fbea287f9a8e49c8fc9fd844ee145358a184c76708add71e104b8ac15cca62c6c2409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-publicsuffix python3.10dist(publicsuffix) python310-publicsuffix python3dist(publicsuffix)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
