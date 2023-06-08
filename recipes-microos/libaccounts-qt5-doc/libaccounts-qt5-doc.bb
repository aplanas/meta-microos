SUMMARY = "Documentation for libaccounts-qt"
DESCRIPTION = "This package contains the documentation for the accounts-qt library."
LICENSE = "LGPL-2.1-only"

PV = "1.16"

RPM_NAME = "libaccounts-qt5-doc-1.16-1.18.noarch.rpm"
RPM_HASH = "7b40e0727765d382688fbf5d6216f647a579d978be6a97bcec7ad1273ba2e9930ddcde6604fee2f3632221662b8699beacf4fa79b0316321903fea97c36752cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libaccounts-qt5-doc"
RDEPENDS:${PN} += ""

inherit rpm
