SUMMARY = "Fancy Interface to the Python Interpreter - common files"
DESCRIPTION = "This package contains files shared between the various versions of \
Bpython. You don't need to install this directly, packages that \
require it will pull it in automatically."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python-bpython-common-0.24-1.4.noarch.rpm"
RPM_HASH = "48d8352cfaf80d4039a52a11037fc54c41e756567373a97eae2175a538d2f468a783c5512cf251a32bf9ea7c55cbd154940856a565e62cf9fb3f5f586d82b534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bpython-common python310-bpython-common python311-bpython-common python39-bpython-common"
RDEPENDS:${PN} += ""

inherit rpm
