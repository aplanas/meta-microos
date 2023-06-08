SUMMARY = "Haskell unix-time profiling library"
DESCRIPTION = "This package provides the Haskell unix-time profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "ghc-unix-time-prof-0.4.9-1.3.aarch64.rpm"
RPM_HASH = "809808c287d09d667b6a556f997211c5c42685f4be0db19ee6fd612abe8d02d057ee5b10db6ccdcc1306897dfed33b728b0ba2a6402075f52ecd1fbb8157f6c0"

RPROVIDES:${PN} += "ghc-prof(unix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0) ghc-unix-time-prof ghc-unix-time-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1) ghc-unix-time-devel"

inherit rpm
