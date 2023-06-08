SUMMARY = "Haskell xhtml profiling library"
DESCRIPTION = "This package provides the Haskell xhtml profiling library."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-prof-3000.2.2.1-1.1.aarch64.rpm"
RPM_HASH = "b4cb12422a84603d05925098c5a2fcc2c226f8f00e205209f1d953f6f51101dbe46da873b758cfbe3d4bb500f4042f976cb6f66ffa5928e205d9d540f44c27a5"

RPROVIDES:${PN} += "ghc-prof(xhtml-3000.2.2.1) ghc-xhtml-prof ghc-xhtml-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-xhtml-devel(aarch-64)"

inherit rpm
