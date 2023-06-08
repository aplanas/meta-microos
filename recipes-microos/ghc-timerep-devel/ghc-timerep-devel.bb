SUMMARY = "Haskell timerep library development files"
DESCRIPTION = "This package provides the Haskell timerep library development files."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-devel-2.1.0.0-1.5.aarch64.rpm"
RPM_HASH = "624eb7e4def741877e6dc139286d3d5ecc2a30c6132439df7bccc9584cd125899e6de6735efb3c00f92b07749e0a4a4074b0da5d4731081e36d6c033a92d744f"

RPROVIDES:${PN} += "ghc-devel(timerep-2.1.0.0-I3sgV342xF22sEKbdw3Ltk) ghc-timerep-devel ghc-timerep-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) ghc-devel(base-4.17.1.0) ghc-devel(monoid-subclasses-1.2.3-3ZmDzuybbdXkWlfa352KR) ghc-devel(text-2.0.2) ghc-devel(time-1.12.2) ghc-timerep"

inherit rpm
