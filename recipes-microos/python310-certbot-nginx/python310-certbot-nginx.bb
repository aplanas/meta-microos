SUMMARY = "Nginx plugin for Certbot"
DESCRIPTION = "The Nginx plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-nginx-1.31.0-1.3.noarch.rpm"
RPM_HASH = "518170dac0764338ff2ff5bac3f23e516db466e9115f1ec1dc281a8db2f5c9808bf253f5d60d9c884a1a83061101bcb0274724f6f8e0d94e0d276e6603e78f7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-nginx \
python3.10dist(certbot-nginx) \
python310-certbot-nginx \
python3dist(certbot-nginx)"
RDEPENDS:${PN} += "nginx \
python(abi) \
python310-acme \
python310-certbot \
python310-pyOpenSSL \
python310-pyparsing"

inherit rpm
