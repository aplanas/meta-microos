SUMMARY = "A linter for YAML files"
DESCRIPTION = "A linter for YAML files. \
 \
YAMLlint does not only check for syntax validity, but for weirdnesses like key \
repetition and cosmetic problems such as lines length, trailing spaces, \
indentation, etc."
LICENSE = "GPL-3.0-only"

PV = "1.28.0"

RPM_NAME = "python39-yamllint-1.28.0-2.1.noarch.rpm"
RPM_HASH = "efa9ab238e59f81ec442dd609babb0874d416a7db03ad3ab27c986c70336fd2e64b9f3ceeaafdad45d9eb540a730895368ad2def0616a940ee6fa17b2d34c306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(yamllint) python39-yamllint python3dist(yamllint)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-PyYAML python39-pathspec update-alternatives"

inherit rpm
