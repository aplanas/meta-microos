SUMMARY = "Route53 DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using AWS Route53."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-dns-route53-1.31.0-1.3.noarch.rpm"
RPM_HASH = "2e4cf2fde488159a15ad78210ef2f3bd1c786820c31ab4e7dc4932c2406870458f0d286d6ebdd153bd708aa75b76c1efdecee9c6f11f1b1e7b9f7f73c06d1122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(certbot-dns-route53) python39-certbot-dns-route53 python3dist(certbot-dns-route53)"
RDEPENDS:${PN} += "python(abi) python39-acme python39-boto3 python39-certbot python39-zope.interface"

inherit rpm
