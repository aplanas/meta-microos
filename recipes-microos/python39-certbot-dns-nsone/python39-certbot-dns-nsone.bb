SUMMARY = "NS1 Authenticator plugin for Certbot"
DESCRIPTION = "Nsone DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-dns-nsone-1.31.0-1.4.noarch.rpm"
RPM_HASH = "e34030723aaa67c30f9e58068a0fbfed9b21cce4572a21ed7cb959c8385b7a2fe36e5fa41be1ed67c616127c1d5bee1f30a3503e9fbfa5947e9a520ba5639b3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(certbot-dns-nsone) \
python39-certbot-dns-nsone \
python3dist(certbot-dns-nsone)"
RDEPENDS:${PN} += "python(abi) \
python39-acme \
python39-certbot \
python39-dns-lexicon"

inherit rpm
