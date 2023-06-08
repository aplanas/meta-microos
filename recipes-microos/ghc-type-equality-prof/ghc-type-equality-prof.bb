SUMMARY = "Haskell type-equality profiling library"
DESCRIPTION = "This package provides the Haskell type-equality profiling library."
LICENSE = "BSD-3-Clause"

PV = "1"

RPM_NAME = "ghc-type-equality-prof-1-11.2.aarch64.rpm"
RPM_HASH = "6cf852d746d35e98ef70bc38d1519713af715c86b6db74bd699bac2e6854d0f899e0ce4d0890a948804b7b1aa28f1b4ba00231c9ce3f761378311ec548ac3fcf"

RPROVIDES:${PN} += "ghc-prof(type-equality-1-FqVAbwBXnIKCXHvrA6xdY8) ghc-type-equality-prof ghc-type-equality-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-type-equality-devel"

inherit rpm
