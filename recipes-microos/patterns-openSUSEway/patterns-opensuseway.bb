SUMMARY = "The openSUSEway desktop environment pattern"
DESCRIPTION = "This pattern installs the openSUSE look and feel for sway."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "patterns-openSUSEway-0.15.1-1.1.noarch.rpm"
RPM_HASH = "7245beafb5360f5ae6b5a02c51c50ddc0695542fb12647bb4e5dd26accc3077bcb5aebbb2f205e9430aaf9f9c07749984be6f0d6fdb3bb4cec2cff38b613bd5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-openSUSEway"
RDEPENDS:${PN} += "openSUSEway"

inherit rpm
