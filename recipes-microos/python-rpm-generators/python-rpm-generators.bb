SUMMARY = "Dependency generator dependencies for Python RPMs"
DESCRIPTION = "This package contains the dependencies for Python RPMs to generate \
dependencies automatically."
LICENSE = "WTFPL"

PV = "20230403.29b58f8"

RPM_NAME = "python-rpm-generators-20230403.29b58f8-1.1.noarch.rpm"
RPM_HASH = "714d85d2013f91fb5e2e50103ef949a89f7bfe5044c6b920eaea34d6af7d80860a0fccb792fe5f71b7832cf13ff697cbfff14ec86bd268524d781826d60f127e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-rpm-generators python3-rpm-generators"
RDEPENDS:${PN} += "python-rpm-macros python3-setuptools"

inherit rpm
