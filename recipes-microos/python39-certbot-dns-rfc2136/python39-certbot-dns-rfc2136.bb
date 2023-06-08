SUMMARY = "RFC 2136 DNS Authenticator plugin for Certbot"
DESCRIPTION = "RFC 2136 DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-dns-rfc2136-1.31.0-1.3.noarch.rpm"
RPM_HASH = "ad3ca44c30a5cef4aaf6ad540b37e25a0fa40ae12668acb6e50c422525d6c8ca700a746786d7019826e75deacf04746ea1cda5e287451d92f035c4b1910158b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(certbot-dns-rfc2136) python39-certbot-dns-rfc2136 python3dist(certbot-dns-rfc2136)"
RDEPENDS:${PN} += "python(abi) python39-acme python39-certbot python39-dnspython"

inherit rpm
