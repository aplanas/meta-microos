SUMMARY = "DNSimple Authenticator plugin for Certbot"
DESCRIPTION = "DNSimple DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-dns-dnsimple-1.31.0-1.4.noarch.rpm"
RPM_HASH = "93e3fb7c74bc16513ed55eaabe1f53e6834d8cd092bfbcc28941f07c494a16d0904fe49f87565d3cb029748db5deb7e6c51e8b2cbf7e449675c79e6e317de456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(certbot-dns-dnsimple) python39-certbot-dns-dnsimple python3dist(certbot-dns-dnsimple)"
RDEPENDS:${PN} += "python(abi) python39-acme python39-certbot python39-dns-lexicon python39-zope.interface"

inherit rpm
