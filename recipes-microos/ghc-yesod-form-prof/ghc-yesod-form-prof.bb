SUMMARY = "Haskell yesod-form profiling library"
DESCRIPTION = "This package provides the Haskell yesod-form profiling library."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-prof-1.7.4-1.4.aarch64.rpm"
RPM_HASH = "ca37d4db40624939f3389ab158a4984256732692b1ff1b97c2729fc3b9a88ccf915b2e16ba0a55880dd43951ad8c379145b8e3a6a779133142bc64da61def7bc"

RPROVIDES:${PN} += "ghc-prof(yesod-form-1.7.4-4xvxNC76eVrIZVDOGDISYi) \
ghc-yesod-form-prof \
ghc-yesod-form-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-prof(base-4.17.1.0) \
ghc-prof(blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW) \
ghc-prof(blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR) \
ghc-prof(blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc) \
ghc-prof(byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) \
ghc-prof(email-validate-2.3.2.18-8MZFHS3GPuQLNTYP4EPLHD) \
ghc-prof(network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH) \
ghc-prof(persistent-2.14.5.0-52EbT4CA3Ct4CmrnsbaA80) \
ghc-prof(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) \
ghc-prof(shakespeare-2.0.30-7fp9544x1BC4UOjjHLrTv0) \
ghc-prof(text-2.0.2) \
ghc-prof(time-1.12.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) \
ghc-prof(xss-sanitize-0.3.7.2-FCgYumvpQn8Hd22tbbEcXW) \
ghc-prof(yesod-core-1.6.24.2-DExtrbWuaUvstmq3VZuwG) \
ghc-prof(yesod-persistent-1.6.0.8-DUd8QtbJfktGowTUT2pCEk) \
ghc-yesod-form-devel"

inherit rpm
