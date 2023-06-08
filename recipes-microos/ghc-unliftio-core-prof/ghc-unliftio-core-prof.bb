SUMMARY = "Haskell unliftio-core profiling library"
DESCRIPTION = "This package provides the Haskell unliftio-core profiling library."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-prof-0.2.1.0-1.3.aarch64.rpm"
RPM_HASH = "9aee23882f032e40f464325c99adbbe4f7640be805b6e44288ca9892ce056156e053d2541791e0d06f243c364e686459b0cb0b4b917746566d6be9b51f95ba55"

RPROVIDES:${PN} += "ghc-prof(unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj) ghc-unliftio-core-prof ghc-unliftio-core-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(transformers-0.5.6.2) ghc-unliftio-core-devel"

inherit rpm
