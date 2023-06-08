SUMMARY = "Microsoft Azure Template Package Client Library for Python"
DESCRIPTION = "This template package matches necessary patterns that the development team has established to \
create a unified sdk functional from Python 2.7 onwards. The packages contained herein can be \
installed singly or as part of the azure namespace. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "0.1.0b2609285"

RPM_NAME = "python39-azure-template-0.1.0b2609285-1.2.noarch.rpm"
RPM_HASH = "a7f26ad724f731626ffdbbbc327a23832e289277f03aec6cb1bb259dba145b3b93e09c6413e0446df63d1b9bb5e0caf5ff34c59f4e8e51e4fff8acc512178682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-template) python39-azure-template python3dist(azure-template)"
RDEPENDS:${PN} += "python(abi) python39-azure-core"

inherit rpm
