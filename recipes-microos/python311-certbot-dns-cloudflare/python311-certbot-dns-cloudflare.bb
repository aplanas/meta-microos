SUMMARY = "Cloudflare Authenticator plugin for Certbot"
DESCRIPTION = "Cloudflare DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-dns-cloudflare-1.31.0-1.3.noarch.rpm"
RPM_HASH = "c680f6527a87cd16d7dd0e961b0bf33a5e689a73b12ded0641c27fb442457a9c5a81cf9bdf84d0737d56053b00bf8f28e6c420febda7c8b595f7d83a67be87f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certbot-dns-cloudflare) \
python311-certbot-dns-cloudflare \
python3dist(certbot-dns-cloudflare)"
RDEPENDS:${PN} += "python(abi) \
python311-acme \
python311-certbot \
python311-cloudflare \
python311-zope.interface"

inherit rpm
