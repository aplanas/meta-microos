SUMMARY = "Haskell these library documentation"
DESCRIPTION = "This package provides the Haskell these library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.1"

RPM_NAME = "ghc-these-doc-1.1.1.1-9.3.noarch.rpm"
RPM_HASH = "5ef28660fe7d9e97b03a5ad93f191709dc2d5f3a7be8cdc59931965d885c1543b06941647b19d14a280530c637312419aced6ea54d1a94ade6909f429c518fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-these-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
