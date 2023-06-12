SUMMARY = "Haskell time-locale-compat profiling library"
DESCRIPTION = "This package provides the Haskell time-locale-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.5"

RPM_NAME = "ghc-time-locale-compat-prof-0.1.1.5-7.2.aarch64.rpm"
RPM_HASH = "4d7cf7cf2231cfc5186a3a708a6e90f65e078f463a8ffedcf010beb9f7b0c6d54167b21e2cb76ba31a2fd6430e1dc1ca5b6d7f6e8a4bf6168b1b59a4282c108b"

RPROVIDES:${PN} += "ghc-prof(time-locale-compat-0.1.1.5-4KOdffkWEDD5CJkcMekvXY) \
ghc-time-locale-compat-prof \
ghc-time-locale-compat-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(time-1.12.2) \
ghc-time-locale-compat-devel"

inherit rpm
