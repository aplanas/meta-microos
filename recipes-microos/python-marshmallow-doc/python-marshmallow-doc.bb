SUMMARY = "Documentation files for python-marshmallow"
DESCRIPTION = "HTML Documentation and examples for python-marshmallow."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.19.0"

RPM_NAME = "python-marshmallow-doc-3.19.0-4.1.noarch.rpm"
RPM_HASH = "8ad29b86a8f2b44b0ad69daa7daf456687df3fdaf56808dce1fd56ddb744186319e98c4e32d67805d7bd8a7b03d64c605362eca367946edcef6a0193f0735d81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-marshmallow-doc \
python-marshmallow-docs"
RDEPENDS:${PN} += ""

inherit rpm
