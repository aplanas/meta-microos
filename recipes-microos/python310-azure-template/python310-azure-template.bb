SUMMARY = "Microsoft Azure Template Package Client Library for Python"
DESCRIPTION = "This template package matches necessary patterns that the development team has established to \
create a unified sdk functional from Python 2.7 onwards. The packages contained herein can be \
installed singly or as part of the azure namespace. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "0.1.0b2609285"

RPM_NAME = "python310-azure-template-0.1.0b2609285-1.2.noarch.rpm"
RPM_HASH = "10d4121d79ecd558a880d7bc471bf418f22d6dbbc159c21a5733452def09b98313ec9cb4e99850697b50d7165ae7abc27d4e70c3c781b55fad6db8f3cab5d6b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-template python3.10dist(azure-template) python310-azure-template python3dist(azure-template)"
RDEPENDS:${PN} += "python(abi) python310-azure-core"

inherit rpm
