SUMMARY = "Haskell unix profiling library"
DESCRIPTION = "This package provides the Haskell unix profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-prof-2.7.3-1.1.aarch64.rpm"
RPM_HASH = "d6ea08ae92b14ae892cea05d7a1aa5d3bc1088eed972722f1d8ba52a3d876a5049c42c08b3ec8b588ab083d602d21238b3675d1852a51c263885f6a4f332653c"

RPROVIDES:${PN} += "ghc-prof(unix-2.7.3) ghc-unix-prof ghc-unix-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(time-1.12.2) ghc-unix-devel(aarch-64)"

inherit rpm
