SUMMARY = "HTML documentation of molequeue"
DESCRIPTION = "HTML documentation of molequeue."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "molequeue-doc-0.9.0-3.9.noarch.rpm"
RPM_HASH = "786aee0b524ae4f202240a7016af8d62a45622c42135d01b30c15184aca18e04473733ccf5338ce651332d934ba2d63de4ddf75244dc7b6b73260a3fc8c16fe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "molequeue-doc"
RDEPENDS:${PN} += ""

inherit rpm
