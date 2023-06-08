SUMMARY = "Haskell type-equality library development files"
DESCRIPTION = "This package provides the Haskell type-equality library development files."
LICENSE = "BSD-3-Clause"

PV = "1"

RPM_NAME = "ghc-type-equality-devel-1-11.2.aarch64.rpm"
RPM_HASH = "6fa4523027fbdf7b6ab561f6945811d60d2852ced83b3f682889243d38cbbb4cd688399d04c2cc329d4a9e1e6e206b4913df3337bd339d816facd4160e62a49e"

RPROVIDES:${PN} += "ghc-devel(type-equality-1-FqVAbwBXnIKCXHvrA6xdY8) ghc-type-equality-devel ghc-type-equality-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-type-equality"

inherit rpm
