SUMMARY = "Haskell th-compat profiling library"
DESCRIPTION = "This package provides the Haskell th-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-th-compat-prof-0.1.4-2.2.aarch64.rpm"
RPM_HASH = "b9c6c024a74eb289bad8c26ecdf05fc840feb8da7ac7386319c9a378609a6474970ff9d33e0a29514a59c5c1c34293f9274358d4e1de357917b6494b4975f8ab"

RPROVIDES:${PN} += "ghc-prof(th-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv) ghc-th-compat-prof ghc-th-compat-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(template-haskell-2.19.0.0) ghc-th-compat-devel"

inherit rpm
