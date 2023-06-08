SUMMARY = "Cloudflare Authenticator plugin for Certbot"
DESCRIPTION = "Cloudflare DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-dns-cloudflare-1.31.0-1.3.noarch.rpm"
RPM_HASH = "059b9345ad9b0ab564403ce1cad135b8e3f9f859346532eec96a6530890242ca100023c84a8992aa08d51f6e67949b5ff735329f5e7b59300a6e2dde51047f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-cloudflare python3.10dist(certbot-dns-cloudflare) python310-certbot-dns-cloudflare python3dist(certbot-dns-cloudflare)"
RDEPENDS:${PN} += "python(abi) python310-acme python310-certbot python310-cloudflare python310-zope.interface"

inherit rpm
