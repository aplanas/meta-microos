SUMMARY = "Documentation files for Subversion"
DESCRIPTION = "This package contains the subversion book (see \
http://svnbook.red-bean.com/) and a configuration file to make this \
book accessible via apache2."
LICENSE = "CC-BY-2.0"

PV = "1.8.r5043"

RPM_NAME = "subversion-doc-1.8.r5043-1.17.noarch.rpm"
RPM_HASH = "c03b77ba27a0f695b358115f4e66dbf14c7cbc92975c822efe104cf89a8895b0c953f1aa0432227cbcf2f97c6130b31d581e299189c7b3e5d15462cbc42d9700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(subversion-doc) \
subversion-doc"
RDEPENDS:${PN} += ""

inherit rpm
