SUMMARY = "Javadoc for hamcrest"
DESCRIPTION = "Javadoc for hamcrest."
LICENSE = "BSD-3-Clause"

PV = "2.2"

RPM_NAME = "hamcrest-javadoc-2.2-1.3.noarch.rpm"
RPM_HASH = "91cc70a88cbf7541964d4caae8ae2fb017e3a6e68a5eb862dc5692d1c53aedb44fbacfbacd0d7bf0e044ffa61cc2260d1453360d324ccc9811d1b37548e6e805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hamcrest-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
