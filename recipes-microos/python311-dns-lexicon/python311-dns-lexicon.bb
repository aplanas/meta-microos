SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.9.4"

RPM_NAME = "python311-dns-lexicon-3.9.4-2.9.noarch.rpm"
RPM_HASH = "971520c5509138b35f40686c2f84b60e27aa1c092333272c4081d5960363b575b5b45a7b2088bd06906a93c9f06ec3dee2aa1205d425f1364874c7f3ecd61a6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dns-lexicon) python311-dns-lexicon python3dist(dns-lexicon)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-PyYAML python311-beautifulsoup4 python311-cryptography python311-future python311-requests python311-tldextract python311-vcrpy update-alternatives"

inherit rpm
