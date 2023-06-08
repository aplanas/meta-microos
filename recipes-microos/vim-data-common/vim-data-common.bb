SUMMARY = "Common Data files for vim & gvim"
DESCRIPTION = "This package contains basic runtime & syntax files for vim"
LICENSE = "Vim"

PV = "9.0.1504"

RPM_NAME = "vim-data-common-9.0.1504-1.1.noarch.rpm"
RPM_HASH = "be2d67566d746ee342a3aa9d331afd12800d6560db35d6cc1bc6cf13e280754846372393920b3a1eea255d02dff5e91a31caa27efe2f37da1b868ce4eba4c3dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-data-common"
RDEPENDS:${PN} += ""

inherit rpm
