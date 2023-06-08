SUMMARY = "Route53 DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using AWS Route53."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-dns-route53-1.31.0-1.3.noarch.rpm"
RPM_HASH = "569ba5577a5e954f34063376cb756315ffc7206a68efc81c9d5e23cd233b8ea861a8473ef829b653898b8a06182e213fc1be51ef6194df7501d33f148c8cdb29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certbot-dns-route53) python311-certbot-dns-route53 python3dist(certbot-dns-route53)"
RDEPENDS:${PN} += "python(abi) python311-acme python311-boto3 python311-certbot python311-zope.interface"

inherit rpm
