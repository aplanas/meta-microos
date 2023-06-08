SUMMARY = "Haskell timerep library documentation"
DESCRIPTION = "This package provides the Haskell timerep library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-doc-2.1.0.0-1.5.noarch.rpm"
RPM_HASH = "0dae6ad2b476e033c692c89d61050579302844ab3615ac9367997df2c69b7cf1798f6416b239f08f43ba06852f18a90d38c338b152ef8c833b1943238d99cb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timerep-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
