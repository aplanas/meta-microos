SUMMARY = "Directed acyclic graphs"
DESCRIPTION = "Directed acyclic graphs can be sorted topographically. Existence of topographic \
ordering allows writing many graph algorithms efficiently. And many graphs, \
e.g. most dependency graphs are acyclic! \
 \
There are some algorithms built-in: dfs, transpose, transitive closure, \
transitive reduction... Some algorithms even become not-so-hard to implement, \
like a longest path!."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.2"

RPM_NAME = "ghc-topograph-1.0.0.2-2.2.aarch64.rpm"
RPM_HASH = "8a620247de41ba5e6ab2340e272434ba028a69c5a10f805b495e81c84b8b6e76ddbb63d8b3f07079fddecd58e1597f13c8df2d6e8ce3a21b84822397e447210d"

RPROVIDES:${PN} += "ghc-topograph ghc-topograph(aarch-64) libHStopograph-1.0.0.2-FAmn9lLfwsBEVgB5YGdVHh-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbase-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov-ghc9.4.5.so()(64bit) libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libHSunix-2.7.3-ghc9.4.5.so()(64bit) libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit) libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
