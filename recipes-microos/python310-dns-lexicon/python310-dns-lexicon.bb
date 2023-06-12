SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.11.7"

RPM_NAME = "python310-dns-lexicon-3.11.7-1.1.noarch.rpm"
RPM_HASH = "3adf95e29f6590b14fdf272643a8f0103d940638ec7d95ae3379bfcd433df90b686b0c083a9655533d40f1964a3f1880b957cc945bb1bfb6c1a3d13a315e49cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dns-lexicon python3.10dist(dns-lexicon) python310-dns-lexicon python3dist(dns-lexicon)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-PyYAML python310-beautifulsoup4 python310-cryptography python310-importlib-metadata python310-requests python310-tldextract update-alternatives"

inherit rpm
