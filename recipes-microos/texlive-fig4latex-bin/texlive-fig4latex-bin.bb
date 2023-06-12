SUMMARY = "Binary files of fig4latex"
DESCRIPTION = "Binary files of fig4latex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14752"

RPM_NAME = "texlive-fig4latex-bin-2023.20230311.svn14752-91.1.aarch64.rpm"
RPM_HASH = "73d42b716c6f724be8a6ccf65099e2e7f698a17c0884de5fd5984dbccfb9a83c094a88ad1a66db0b71d478f8f22c6b98ab4f1afcd61b77ef099860b7624ab443"

RPROVIDES:${PN} += "texlive-fig4latex-bin texlive-fig4latex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-fig4latex"

inherit rpm
