SUMMARY = "Haskell timeit profiling library"
DESCRIPTION = "This package provides the Haskell timeit profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "ghc-timeit-prof-2.0-6.2.aarch64.rpm"
RPM_HASH = "668d5e58e392916fefb54b7bd45f1140d6fbc69dc5fd9e66f9c951c516d325c49f95b13df3577a035df6e6e419d042f97f19d4a1813b43a575c7cb1039391394"

RPROVIDES:${PN} += "ghc-prof(timeit-2.0-8ewEVtFbCiRSME6yb7iQx) ghc-timeit-prof ghc-timeit-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-timeit-devel"

inherit rpm
