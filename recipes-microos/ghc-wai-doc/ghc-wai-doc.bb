SUMMARY = "Haskell wai library documentation"
DESCRIPTION = "This package provides the Haskell wai library documentation."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "ghc-wai-doc-3.2.3-2.2.noarch.rpm"
RPM_HASH = "98421e4826ed429ca6abc244c7a8781b37223936fbd2658764b1c230b7c8e21ae101480de70db8f6639ab9a52923a5fdb3a9c5d71dac5424f7a7120a9ce0d15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
