SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.9.4"

RPM_NAME = "python39-dns-lexicon-3.9.4-2.9.noarch.rpm"
RPM_HASH = "83a18adbf19a681d4d8f95835fc201d00b7845677aa97ce9b9b32d31158184cb57486d081f22c3fce701e8edbdd984bfbc6f74caadbd76e79cb6be2d31f0c8db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dns-lexicon) python39-dns-lexicon python3dist(dns-lexicon)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-PyYAML python39-beautifulsoup4 python39-cryptography python39-future python39-requests python39-tldextract python39-vcrpy update-alternatives"

inherit rpm
