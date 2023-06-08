SUMMARY = "Camel case JSON support for Django REST framework"
DESCRIPTION = "Camel case JSON support for Django REST framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python311-djangorestframework-camel-case-1.4.2-1.3.noarch.rpm"
RPM_HASH = "d63b3b9c8c6e8be4c517a2ccd251ffdee7e350aee8bd998201422a57a650e6b13788ae94db7f430470f3925c97a8dad86c8b19da2226199f5d3639090061e2da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(djangorestframework-camel-case) python311-djangorestframework-camel-case python3dist(djangorestframework-camel-case)"
RDEPENDS:${PN} += "python(abi) python311-djangorestframework"

inherit rpm
