SUMMARY = "Haskell time library development files"
DESCRIPTION = "This package provides the Haskell time library development files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-devel-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "745c73aa7c8ea3d883fc93aa4a770b5b1a9995db63f9f9571e6746e6c3d2f16692b9de2dd5e74d09b7d6e9e80a43b746806c59e241efb308fe561cc178a3dd7b"

RPROVIDES:${PN} += "ghc-devel(time-1.12.2) ghc-time-devel ghc-time-devel(aarch-64) ghc-time-static ghc-time-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(deepseq-1.4.8.0) ghc-time(aarch-64)"

inherit rpm
