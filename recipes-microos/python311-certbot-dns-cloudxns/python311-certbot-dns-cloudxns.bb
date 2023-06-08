SUMMARY = "CloudXNS Authenticator plugin for Certbot"
DESCRIPTION = "CloudXNS DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-dns-cloudxns-1.31.0-1.4.noarch.rpm"
RPM_HASH = "64d548e79cd86057b71a33019ad2e03128c919dcc242901cdab766452d0aca54c48d3dec44ecee0baa14e6daed2d808b988e34dce2b33d19cbc2272df780053f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certbot-dns-cloudxns) python311-certbot-dns-cloudxns python3dist(certbot-dns-cloudxns)"
RDEPENDS:${PN} += "python(abi) python311-acme python311-certbot python311-dns-lexicon python311-zope.interface"

inherit rpm
