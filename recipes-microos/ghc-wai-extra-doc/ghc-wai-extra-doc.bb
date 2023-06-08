SUMMARY = "Haskell wai-extra library documentation"
DESCRIPTION = "This package provides the Haskell wai-extra library documentation."
LICENSE = "MIT"

PV = "3.1.13.0"

RPM_NAME = "ghc-wai-extra-doc-3.1.13.0-2.4.noarch.rpm"
RPM_HASH = "8e1e17e237e035383bce9a9976177539524a610e97e362f2e58c91b461cc91e0dc30d55248d57aa632c2bbb448004e110748d16a848293f5a1b1e287f37562ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-extra-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
