SUMMARY = "An either-or-both data type"
DESCRIPTION = "This package provides a data type 'These a b' which can hold a value of either \
type or values of each type. This is usually thought of as an 'inclusive or' \
type (contrasting 'Either a b' as 'exclusive or') or as an 'outer join' type \
(contrasting '(a, b)' as 'inner join'). \
 \
' data These a b = This a | That b | These a b ' \
 \
Since version 1, this package was split into parts: \
 \
* <https://hackage.haskell.org/package/semialign semialign> For 'Align' and \
'Zip' type-classes. \
 \
* <https://hackage.haskell.org/package/semialign-indexed semialign-indexed> For \
'SemialignWithIndex' class, providing 'ialignWith' and 'izipWith'. \
 \
* <https://hackage.haskell.org/package/these-lens these-lens> For lens \
combinators. \
 \
* <http://hackage.haskell.org/package/monad-chronicle monad-chronicle> For \
transformers variant of 'These'."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.1"

RPM_NAME = "ghc-these-1.1.1.1-9.3.aarch64.rpm"
RPM_HASH = "8561c0fb1aa6faa51a02152221c17740145ba06c4a2ffcd06872e4def7a2c5bfa4c8c2c0b773154c9936cb5add4053f52ccf84b1faf102fa694ad32f39fe8afb"

RPROVIDES:${PN} += "ghc-these ghc-these(aarch-64) libHSthese-1.1.1.1-3POHYes25uBIW53bcrDd39-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSassoc-1.0.2-IAwklVGxRFw6xcadvaWWl7-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so()(64bit) libHSbifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScomonad-5.0.8-9UnH7KDg5138z3eBCPM7y4-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSdistributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79-ghc9.4.5.so()(64bit) libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
