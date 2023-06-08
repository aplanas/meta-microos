SUMMARY = "Cloudflare Authenticator plugin for Certbot"
DESCRIPTION = "Cloudflare DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-dns-cloudflare-1.31.0-1.3.noarch.rpm"
RPM_HASH = "d7c8bdafce0d0de4d4f77353482263a449143c1d2baad448ce11139e9ebabc851698e1ee089d19d695215a9e0881ad03d0e976971914d981e5351339d5bc2894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(certbot-dns-cloudflare) python39-certbot-dns-cloudflare python3dist(certbot-dns-cloudflare)"
RDEPENDS:${PN} += "python(abi) python39-acme python39-certbot python39-cloudflare python39-zope.interface"

inherit rpm
