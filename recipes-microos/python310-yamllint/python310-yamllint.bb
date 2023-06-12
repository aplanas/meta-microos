SUMMARY = "A linter for YAML files"
DESCRIPTION = "A linter for YAML files. \
 \
YAMLlint does not only check for syntax validity, but for weirdnesses like key \
repetition and cosmetic problems such as lines length, trailing spaces, \
indentation, etc."
LICENSE = "GPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "python310-yamllint-1.32.0-1.1.noarch.rpm"
RPM_HASH = "15e77ae7066795fcfaed67a68ca91d0b7fd7d4e7a69b961a246986091538b4d9ab1d96c186c8a98cf4f830631f8bfe6836a16f011d56609d53ba54188343f812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamllint \
python3.10dist(yamllint) \
python310-yamllint \
python3dist(yamllint)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyYAML \
python310-pathspec \
update-alternatives"

inherit rpm
