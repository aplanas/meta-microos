SUMMARY = "Haskell wizards profiling library"
DESCRIPTION = "This package provides the Haskell wizards profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-prof-1.0.3-5.3.aarch64.rpm"
RPM_HASH = "a78faab06279ec9fd39d94389a325f1d3d969b1511ab8fca20a1cf66d036df6cc97ca8aaf9a5cc84bf11c36cf442857bdeab1f5fcb6cd139d8724ab925a8f033"

RPROVIDES:${PN} += "ghc-prof(wizards-1.0.3-1eOj2T9eMm8Jj6cnosVGZb) ghc-wizards-prof ghc-wizards-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(control-monad-free-0.6.2-AMlHq80A2qJLNQ8iIcl5z7) ghc-prof(haskeline-0.8.2) ghc-prof(mtl-2.2.2) ghc-prof(transformers-0.5.6.2) ghc-wizards-devel"

inherit rpm
