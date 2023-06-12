SUMMARY = "Haskell transformers library development files"
DESCRIPTION = "This package provides the Haskell transformers library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-devel-0.5.6.2-3.1.aarch64.rpm"
RPM_HASH = "848b0864e2be0c29bcc260002626a92b5075297257e6ff1c4d5f91c44f0f42d2929fe7a780abef02d04df618769dc8da70f6d5db3fa5e0ee1152f4bfcbcb9d44"

RPROVIDES:${PN} += "ghc-devel(transformers-0.5.6.2) ghc-transformers-devel ghc-transformers-devel(aarch-64) ghc-transformers-static ghc-transformers-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-transformers(aarch-64)"

inherit rpm
