SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.2.3"

RPM_NAME = "python310-panflute-2.2.3-1.5.noarch.rpm"
RPM_HASH = "1de9e9a085373cd044a73389045cf1d9daebc1d8ffe72896fa2ac3e4dd856c56d056e53016a0c3924e12137cb6f51c6ff824d3b5893fe1698bcbcfd78956845d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-panflute python3.10dist(panflute) python310-panflute python3dist(panflute)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-PyYAML python310-click python310-future update-alternatives"

inherit rpm
