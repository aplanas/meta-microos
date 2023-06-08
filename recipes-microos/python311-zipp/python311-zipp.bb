SUMMARY = "Pathlib-compatible object wrapper for zip files"
DESCRIPTION = "A pathlib-compatible Zipfile object wrapper."
LICENSE = "MIT"

PV = "3.15.0"

RPM_NAME = "python311-zipp-3.15.0-2.1.noarch.rpm"
RPM_HASH = "e19e26f8d09a805b1970f27d5b9617327da9031ffc63495d22f4f4d1e0a524966289669bed0209a9435012ec1bf54a20d9cd54bb6ed8fd31b2a6e9f76724a8cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zipp) python311-zipp python3dist(zipp)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
