SUMMARY = "A helper for library maintainers to use symbol versioning"
DESCRIPTION = "This script allows to generate and update symbol version linker scripts which \
adds version information to the exported symbols. The script is intended to be \
integrated as part of a shared library build to check for changes in the set of \
exported symbols and update the symbol version linker script accordingly."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-abimap-0.3.2-3.10.noarch.rpm"
RPM_HASH = "a0a0697c7c80fc54c25145cbc98a0124cfa8ad65ba452bb9456c3f6f669acf9d9bf4aded622486d0b9f4fcfe5799b541e72d29261c0ba9a2c8533b4008ee6c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(abimap) \
python39-abimap \
python3dist(abimap)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-setuptools \
update-alternatives"

inherit rpm
