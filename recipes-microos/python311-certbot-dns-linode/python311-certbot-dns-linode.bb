SUMMARY = "Linode DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using Linode's DNS API."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-dns-linode-1.31.0-1.4.noarch.rpm"
RPM_HASH = "caaa8fa2c6e81724df93976007e7ef0188f79aac92672e9917fbfec296fda7befd8e4e34b47f21db09af0f93b3542d08920012dca6e22f53848a8c7d24157822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certbot-dns-linode) python311-certbot-dns-linode python3dist(certbot-dns-linode)"
RDEPENDS:${PN} += "python(abi) python311-acme python311-certbot python311-dns-lexicon"

inherit rpm
