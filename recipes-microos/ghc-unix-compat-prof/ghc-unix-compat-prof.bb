SUMMARY = "Haskell unix-compat profiling library"
DESCRIPTION = "This package provides the Haskell unix-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "ghc-unix-compat-prof-0.6-3.3.aarch64.rpm"
RPM_HASH = "dcc2ca0d7698ee6e5efb42c11ff9bca01674b7c5d75765d8ae6f30fbcb9d89fe7d05c63fd45e2081ba4325af43b156002ac9666c3ceb2a849104d1fa920daf0f"

RPROVIDES:${PN} += "ghc-prof(unix-compat-0.6-79KxxZMmklx25hsmeEnenN) ghc-unix-compat-prof ghc-unix-compat-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(unix-2.7.3) ghc-unix-compat-devel"

inherit rpm
