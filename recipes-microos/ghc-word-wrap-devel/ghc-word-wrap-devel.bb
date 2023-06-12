SUMMARY = "Haskell word-wrap library development files"
DESCRIPTION = "This package provides the Haskell word-wrap library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-word-wrap-devel-0.5-2.2.aarch64.rpm"
RPM_HASH = "c0bf7ffab95692d125e0a025307b944f9accdc6d1c44a79e6261682921372e35463373a4a177ebe5a0292c37e21d8541b645bfd1c74fd0973d272a5752240dc4"

RPROVIDES:${PN} += "ghc-devel(word-wrap-0.5-8lP0dTi9CAzDFiJFYJ3rcZ) \
ghc-word-wrap-devel \
ghc-word-wrap-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(text-2.0.2) \
ghc-word-wrap"

inherit rpm
