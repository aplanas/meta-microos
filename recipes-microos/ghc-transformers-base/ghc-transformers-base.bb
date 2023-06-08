SUMMARY = "Lift computations from the bottom of a transformer stack"
DESCRIPTION = "This package provides a straightforward port of 'monadLib''s BaseM typeclass to \
'transformers'."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "ghc-transformers-base-0.4.6-2.2.aarch64.rpm"
RPM_HASH = "5ec332be356c9d9e4f177ecf2959531f73acff65a4542af327ea315f9c56cb72b38a475b3ae3f294ee360b1543e230be6b3436013587bc6217aa9a87de03b14f"

RPROVIDES:${PN} += "ghc-transformers-base ghc-transformers-base(aarch-64) libHStransformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
