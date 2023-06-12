SUMMARY = "Haskell th-lift-instances profiling library"
DESCRIPTION = "This package provides the Haskell th-lift-instances profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.20"

RPM_NAME = "ghc-th-lift-instances-prof-0.1.20-2.2.aarch64.rpm"
RPM_HASH = "11724e4b997f7cfffb61af3a2a2d6434f1687b83544a021d1a310016e38d4b01a004caa9d02d40fd6b14440a6fa5052de7f505cedb8d7b36826b739e477ea7eb"

RPROVIDES:${PN} += "ghc-prof(th-lift-instances-0.1.20-7156sTBHd79IaWXpYE3Pjx) \
ghc-th-lift-instances-prof \
ghc-th-lift-instances-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-prof(text-2.0.2) \
ghc-prof(th-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-th-lift-instances-devel"

inherit rpm
