SUMMARY = "Haskell unix profiling library"
DESCRIPTION = "This package provides the Haskell unix profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-prof-2.7.3-3.1.aarch64.rpm"
RPM_HASH = "5dce83bd73b0d5fa0afa7c98faaa8e2c8878c138bca63e6d2e96ddd1d1a1f8140b0699ddc4346801a54f441d33b6987322bf9d0af2bd66183a101112165ddfc2"

RPROVIDES:${PN} += "ghc-prof(unix-2.7.3) ghc-unix-prof ghc-unix-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(time-1.12.2) ghc-unix-devel(aarch-64)"

inherit rpm
