SUMMARY = "A Python implementation of Markdown"
DESCRIPTION = "Markdown2 is a Python implementation of Markdown. \
It closely matches the behaviour of the original \
Perl-implemented Markdown.pl. Markdown2 also comes with a number of \
extensions (called 'extras') for things like syntax coloring, tables, \
header-ids."
LICENSE = "MIT"

PV = "2.4.6"

RPM_NAME = "python311-markdown2-2.4.6-1.4.noarch.rpm"
RPM_HASH = "042290c41703f9e6c35a9349915d0ffccc43895b047192cd922f44a78274a32c2557c21df0417e76b5a4ad5cdf3851c909a322b67400a0a9755b298187d298ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(markdown2) python311-markdown2 python3dist(markdown2)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
