SUMMARY = "Word8 library"
DESCRIPTION = "Word8 library to be used with Data.ByteString."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-0.1.3-5.3.aarch64.rpm"
RPM_HASH = "3ec9290185ea11158f7b46177f8f03377b41820c052407310f598b5f186385ef699d411b4b5f66453aeb344d010caa3220649a725e05e71a85f3fe250f5aec56"

RPROVIDES:${PN} += "ghc-word8 ghc-word8(aarch-64) libHSword8-0.1.3-9uGjviso2af8K0EP8UmxRD-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
