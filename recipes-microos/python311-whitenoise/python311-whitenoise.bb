SUMMARY = "Static file serving for WSGI applications"
DESCRIPTION = "Static file serving for WSGI applications."
LICENSE = "MIT"

PV = "6.2.0"

RPM_NAME = "python311-whitenoise-6.2.0-1.3.noarch.rpm"
RPM_HASH = "0fb5fdc8dee9f50454d9c6f6c96b4337abd0ded7885068a89a0cb35541c6b4735e9b31afec491cb347b3c00e4bc8cc861e9b8e2b224ab1b106a38666e99d0c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(whitenoise) python311-whitenoise python3dist(whitenoise)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
