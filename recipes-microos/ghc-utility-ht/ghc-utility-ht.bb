SUMMARY = "Various small helper functions for Lists, Maybes, Tuples, Functions"
DESCRIPTION = "Various small helper functions for Lists, Maybes, Tuples, Functions. \
Some of these functions are improved implementations of standard functions. \
They have the same name as their standard counterparts. Others are equivalent \
to functions from the 'base' package, but if you import them from this utility \
package then you can write code that runs on older GHC versions or other \
compilers like Hugs and JHC. \
 \
All modules are plain Haskell 98. The package depends exclusively on the 'base' \
package and only that portions of 'base' that are simple to port. Thus you do \
not risk a dependency avalanche by importing it. However, further splitting the \
base package might invalidate this statement. \
 \
Alternative packages: 'Useful', 'MissingH'."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-utility-ht-0.0.16-2.3.aarch64.rpm"
RPM_HASH = "2bac86812e1cd9bf0cc8d44c0c09caa7aa3c4b286875afb566a35f844ed7328b92802206089d8e683af316f0c3735389e54344ad69f9f4ab8b84eefd85918c39"

RPROVIDES:${PN} += "ghc-utility-ht ghc-utility-ht(aarch-64) libHSutility-ht-0.0.16-CDN97AfZiejDC1itvZ2hyN-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
