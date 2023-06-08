SUMMARY = "A linter for YAML files"
DESCRIPTION = "A linter for YAML files. \
 \
YAMLlint does not only check for syntax validity, but for weirdnesses like key \
repetition and cosmetic problems such as lines length, trailing spaces, \
indentation, etc."
LICENSE = "GPL-3.0-only"

PV = "1.28.0"

RPM_NAME = "python310-yamllint-1.28.0-2.1.noarch.rpm"
RPM_HASH = "62ffd4ca1aa85edb2546e89bcf37377c21915d2d0888011814de7a0d3b812f2841e85789468ea4639e23c1ef42e5fcb88d852d9e4f3a20e23bc50d3c653719a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamllint python3.10dist(yamllint) python310-yamllint python3dist(yamllint)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-PyYAML python310-pathspec update-alternatives"

inherit rpm
