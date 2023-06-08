SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.2.3"

RPM_NAME = "python311-panflute-2.2.3-1.5.noarch.rpm"
RPM_HASH = "a3504c189e6bbd85414f6d8c3c299c9f91f767416a135f927b6100566d98f3badca5ed9ae7ded7a5414b9877edd10958ef3d053e253d033343b05c77d269c4a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(panflute) python311-panflute python3dist(panflute)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-PyYAML python311-click python311-future update-alternatives"

inherit rpm
