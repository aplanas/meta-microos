SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.2.3"

RPM_NAME = "python39-panflute-2.2.3-1.5.noarch.rpm"
RPM_HASH = "dec9c01e440284ea3b9da1cc047d873cd779b74b40f6a7f4f216dd91b0b2815251bbe09bd6377096efc16907daad59cd909e7239bb4bdc8b1416752378deefab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(panflute) python39-panflute python3dist(panflute)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-PyYAML python39-click python39-future update-alternatives"

inherit rpm
