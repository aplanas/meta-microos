SUMMARY = "Haskell unix library development files"
DESCRIPTION = "This package provides the Haskell unix library development files."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-devel-2.7.3-1.1.aarch64.rpm"
RPM_HASH = "bf74d9b0b2df8039076a320208479a591fe8aa172198a0eb1d6e40adb8917cc9916b2c23d238233a96279d4e32ba1936dd776503663c02145802518efa247e4d"

RPROVIDES:${PN} += "ghc-devel(unix-2.7.3) ghc-unix-devel ghc-unix-devel(aarch-64) ghc-unix-static ghc-unix-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(time-1.12.2) ghc-unix(aarch-64)"

inherit rpm
