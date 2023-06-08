SUMMARY = "Haskell vector profiling library"
DESCRIPTION = "This package provides the Haskell vector profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.0.0"

RPM_NAME = "ghc-vector-prof-0.13.0.0-1.3.aarch64.rpm"
RPM_HASH = "084f4683d62c7d1106d3d6d0b927258ad762c381ec3465cf5db94e616aed17f7cac365607be1c1597791e2a1f72a181002bb82cb91e3f13794e828358ee5f6b9"

RPROVIDES:${PN} += "ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-vector-prof ghc-vector-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) ghc-prof(vector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s) ghc-vector-devel"

inherit rpm
