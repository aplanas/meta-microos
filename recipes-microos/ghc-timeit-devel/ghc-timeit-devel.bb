SUMMARY = "Haskell timeit library development files"
DESCRIPTION = "This package provides the Haskell timeit library development files."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "ghc-timeit-devel-2.0-6.2.aarch64.rpm"
RPM_HASH = "37bb99376bd1ed822c78f770f07b6e37bf3678814048aedb7a6dc52ea9043f4146110d8996372906301f8d0fba0f97474ad25579e2702fc988a0036eee32de3f"

RPROVIDES:${PN} += "ghc-devel(timeit-2.0-8ewEVtFbCiRSME6yb7iQx) \
ghc-timeit-devel \
ghc-timeit-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-timeit"

inherit rpm
