SUMMARY = "Constants used in Chinese text processing"
DESCRIPTION = "Zhon provides constants used in Chinese text processing."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python311-zhon-1.1.5-4.1.noarch.rpm"
RPM_HASH = "78b5da6a031e7f627639a8d4f84de3fda3d350b76d52f4c11a21f1c7d781d9bbe680af27077c446a2023aeab703af91dd5a2b933c7ddecdea34226cad0a4738b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zhon) python311-zhon python3dist(zhon)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
