SUMMARY = "The MonadUnliftIO typeclass for unlifting monads to IO"
DESCRIPTION = "Please see the documentation and README at \
<https://www.stackage.org/package/unliftio-core>."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-0.2.1.0-1.3.aarch64.rpm"
RPM_HASH = "41b0c10f8d457e2d4615c27c63501dda919b19fe1f3e6c78bb0d71a1a8762863868738011337aa1a92d38d6b03cb93e896f88b97b62042385c1b19f105b93870"

RPROVIDES:${PN} += "ghc-unliftio-core ghc-unliftio-core(aarch-64) libHSunliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
