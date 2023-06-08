SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python310-moto-4.1.0-1.5.noarch.rpm"
RPM_HASH = "12d63b8db2377db294e13ac663f79d16f33f6b1c526b4629951bf4d16852808f1257b3059a5583dc98dc6807cd588958f1c899ae54e893a30bb98321bd91f3a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moto python3.10dist(moto) python310-moto python3dist(moto)"
RDEPENDS:${PN} += "(python310-python-dateutil >= 2.1 with python310-python-dateutil < 3) /bin/sh /usr/bin/python3.10 python(abi) python310-Jinja2 python310-Werkzeug python310-boto3 python310-botocore python310-cryptography python310-requests python310-responses python310-xmltodict update-alternatives"

inherit rpm
