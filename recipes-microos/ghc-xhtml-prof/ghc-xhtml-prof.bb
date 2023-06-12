SUMMARY = "Haskell xhtml profiling library"
DESCRIPTION = "This package provides the Haskell xhtml profiling library."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-prof-3000.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "553367f0ed0d3feeee4a06698696e8bd367181061a86dbc973ed7bb8edceacdf111daede9f785bf7dd5732266b14ffe78e3ec39adc3368e8d6fea6cf7dcd44d4"

RPROVIDES:${PN} += "ghc-prof(xhtml-3000.2.2.1) ghc-xhtml-prof ghc-xhtml-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-xhtml-devel(aarch-64)"

inherit rpm
