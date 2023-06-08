SUMMARY = "Core library for anymarkup"
DESCRIPTION = "This is the core library that implements functionality of \
python-anymarkup."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python39-anymarkup-core-0.8.1-3.3.noarch.rpm"
RPM_HASH = "9a1e9427933bae8c684e17946666b607cfe88d7ca51c691bba0c28fbd3ec761323a5bd464067823f7de4d745687ef59c7954a193fe9e8425a9ea15085df6d7a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(anymarkup-core) python39-anymarkup-core python3dist(anymarkup-core)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
