SUMMARY = "Haskell vector-stream profiling library"
DESCRIPTION = "This package provides the Haskell vector-stream profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-vector-stream-prof-0.1.0.0-2.2.aarch64.rpm"
RPM_HASH = "4722150966247d2c0ef000d93c3f9ead1aa00b417d7f73c5150ca78d2a8a90d4fbb084b49111a179b565220062279eae429990b6b4c20b4269169c7350bbe4c0"

RPROVIDES:${PN} += "ghc-prof(vector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s) ghc-vector-stream-prof ghc-vector-stream-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(ghc-prim-0.9.0) ghc-vector-stream-devel"

inherit rpm
