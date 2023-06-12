SUMMARY = "Documentation files for python-blue"
DESCRIPTION = "HTML Documentation and examples for python-blue."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python-blue-doc-0.9.1-2.1.noarch.rpm"
RPM_HASH = "7d3c0a0c9322d2046dd385d2acdc31f24aa58bf4636a20977e889c3b65a153ee45e80afd721e1787aef1710698535d2ce3a8f9e31a9fd3cef6d0f3ce70510110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-blue-doc \
python310-foo-doc \
python311-foo-doc \
python39-foo-doc"
RDEPENDS:${PN} += ""

inherit rpm
