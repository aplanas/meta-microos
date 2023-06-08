SUMMARY = "Haskell yesod-core profiling library"
DESCRIPTION = "This package provides the Haskell yesod-core profiling library."
LICENSE = "MIT"

PV = "1.6.24.2"

RPM_NAME = "ghc-yesod-core-prof-1.6.24.2-1.4.aarch64.rpm"
RPM_HASH = "c73cfa87a9e4a3a064f52e923d613e3f9190033ebf6ae636d2933051b87dd70cfa1b49dbfba135460f86c39972ab9cfc038e3c1ea610a3b27360fcbc285a8920"

RPROVIDES:${PN} += "ghc-prof(yesod-core-1.6.24.2-DExtrbWuaUvstmq3VZuwG) ghc-yesod-core-prof ghc-yesod-core-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) ghc-prof(auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ) ghc-prof(base-4.17.1.0) ghc-prof(blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR) ghc-prof(blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc) ghc-prof(bytestring-0.11.4.0) ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) ghc-prof(cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f) ghc-prof(clientsession-0.9.1.2-Jnvj5vMN6iR9xGMf6HxcGE) ghc-prof(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) ghc-prof(conduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr) ghc-prof(containers-0.6.7) ghc-prof(cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE) ghc-prof(deepseq-1.4.8.0) ghc-prof(entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP) ghc-prof(fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ) ghc-prof(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) ghc-prof(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) ghc-prof(monad-logger-0.3.39-6zcML8Hf5KyK4tRVcaUTsA) ghc-prof(mtl-2.2.2) ghc-prof(parsec-3.1.16.1) ghc-prof(path-pieces-0.2.1-7L2E0FvnHzn1hGutNz0iw4) ghc-prof(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) ghc-prof(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) ghc-prof(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) ghc-prof(shakespeare-2.0.30-7fp9544x1BC4UOjjHLrTv0) ghc-prof(template-haskell-2.19.0.0) ghc-prof(text-2.0.2) ghc-prof(time-1.12.2) ghc-prof(transformers-0.5.6.2) ghc-prof(unix-compat-0.6-79KxxZMmklx25hsmeEnenN) ghc-prof(unliftio-0.2.24.0-Dgc3Qshya29BgIaWsfBy4D) ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-prof(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) ghc-prof(wai-extra-3.1.13.0-B4Szpcpv4Gy5mM28jLfYmX) ghc-prof(wai-logger-2.4.0-9XzUYLocOmA4DcbxilrxA0) ghc-prof(warp-3.3.25-E7dqXF5eh0k5u5fIPKRjLZ) ghc-prof(word8-0.1.3-9uGjviso2af8K0EP8UmxRD) ghc-yesod-core-devel"

inherit rpm
