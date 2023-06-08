SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.9.4"

RPM_NAME = "python310-dns-lexicon-3.9.4-2.9.noarch.rpm"
RPM_HASH = "a453aa94968e6171ea6d66869f455870c12c0eef11dbc8a628e5c3100803bc5b33bd9252c7d92fdd9903873b7dd8aa27775dafd1d787df3cebee4dffb2b4f17c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dns-lexicon python3.10dist(dns-lexicon) python310-dns-lexicon python3dist(dns-lexicon)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-PyYAML python310-beautifulsoup4 python310-cryptography python310-future python310-requests python310-tldextract python310-vcrpy update-alternatives"

inherit rpm
