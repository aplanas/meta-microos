SUMMARY = "A linter for YAML files"
DESCRIPTION = "A linter for YAML files. \
 \
YAMLlint does not only check for syntax validity, but for weirdnesses like key \
repetition and cosmetic problems such as lines length, trailing spaces, \
indentation, etc."
LICENSE = "GPL-3.0-only"

PV = "1.28.0"

RPM_NAME = "python311-yamllint-1.28.0-2.1.noarch.rpm"
RPM_HASH = "0d9f1820b279a0e35452b0a6df117a16d5a5fab14c28e09af167986eb598b69c67cee22d0193f722b06a66ccec0f4c8845be27299479440dabfa1ec99a2d7166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(yamllint) python311-yamllint python3dist(yamllint)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-PyYAML python311-pathspec update-alternatives"

inherit rpm
