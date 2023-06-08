SUMMARY = "Changelog listing tool"
DESCRIPTION = "This tool is to show the changelog of packages in the repository"
LICENSE = "GPL-2.0-only"

PV = "0.3"

RPM_NAME = "zypper-changelog-plugin-0.3-1.2.noarch.rpm"
RPM_HASH = "541c8f811fe729a7f0347fa8ec4166d78ffe49442fe935d1291932a81ee0a3b72e3ae16da47cf68c4b6c106ed5be7ca346123e9b92f9242481f0909e4a4ce0eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-changelog-plugin"
RDEPENDS:${PN} += "/usr/bin/env /usr/bin/python3 python3-requests"

inherit rpm
