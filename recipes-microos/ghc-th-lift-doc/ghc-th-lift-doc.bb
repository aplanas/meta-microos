SUMMARY = "Haskell th-lift library documentation"
DESCRIPTION = "This package provides the Haskell th-lift library documentation."
LICENSE = "(BSD-3-Clause | GPL-2.0-only)"

PV = "0.8.3"

RPM_NAME = "ghc-th-lift-doc-0.8.3-1.2.noarch.rpm"
RPM_HASH = "53301ae649c52a4d64ffa2e6dc89e46e2b43201904a926ca5bb6b3a6a79cc9066e496aafe7ac40b0cbb6f527f256b422ad59c2e80ef86b4815f89246b3c3463c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-lift-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
