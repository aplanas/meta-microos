SUMMARY = "Linode DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using Linode's DNS API."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-dns-linode-1.31.0-1.4.noarch.rpm"
RPM_HASH = "93ac804011b4c0c139c389865c59e5224c7ebdd654946746db3ef96d8c8f733874cd7c53704d5375acd0ffc6d8d3c13724023120275c4e4b98bcefeee214f65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(certbot-dns-linode) python39-certbot-dns-linode python3dist(certbot-dns-linode)"
RDEPENDS:${PN} += "python(abi) python39-acme python39-certbot python39-dns-lexicon"

inherit rpm
