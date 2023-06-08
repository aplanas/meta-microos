SUMMARY = "DigitalOcean Authenticator plugin for Certbot"
DESCRIPTION = "Digitalocean DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-dns-digitalocean-1.31.0-1.4.noarch.rpm"
RPM_HASH = "1c0b4d989d1e8b784d9b60c17b0eff9002ec29a132e51aea59015e51324f65cc403d87234e5ba1408cf3f6f94cba99796dbe062e8a7c83b842ba926ecd6e5222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-digitalocean python3.10dist(certbot-dns-digitalocean) python310-certbot-dns-digitalocean python3dist(certbot-dns-digitalocean)"
RDEPENDS:${PN} += "python(abi) python310-acme python310-certbot python310-digitalocean python310-six python310-zope.interface"

inherit rpm
