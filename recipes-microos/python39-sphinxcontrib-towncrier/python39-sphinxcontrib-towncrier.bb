SUMMARY = "An RST directive for injecting a Towncrier-generated changelog draft"
DESCRIPTION = "An RST directive for injecting a Towncrier-generated changelog draft containing fragments for the unreleased (next) project version"
LICENSE = "BSD-3-Clause"

PV = "0.3.2a0"

RPM_NAME = "python39-sphinxcontrib-towncrier-0.3.2a0-1.1.noarch.rpm"
RPM_HASH = "12a0c3ca8156fdf17944e27069f2794e278d330cdd1ec343e094ecfb9bff75d5d1b305de4a13752587840078ad86b4ce7268841fc96dba4a3828bbe54ea51ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-towncrier) \
python39-sphinxcontrib-towncrier \
python3dist(sphinxcontrib-towncrier)"
RDEPENDS:${PN} += "python(abi) \
python39-Sphinx \
python39-towncrier"

inherit rpm
