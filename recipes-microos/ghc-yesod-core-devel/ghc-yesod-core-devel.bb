SUMMARY = "Haskell yesod-core library development files"
DESCRIPTION = "This package provides the Haskell yesod-core library development files."
LICENSE = "MIT"

PV = "1.6.24.2"

RPM_NAME = "ghc-yesod-core-devel-1.6.24.2-1.4.aarch64.rpm"
RPM_HASH = "2097b7516d1898842f8e3732ded1283f3023028ad9ad6fbfcd6131565370764306df844b7cc74b7e9665ed940c850e8427c660d48b75561bb1f2de727bfc6c56"

RPROVIDES:${PN} += "ghc-devel(yesod-core-1.6.24.2-DExtrbWuaUvstmq3VZuwG) \
ghc-yesod-core-devel \
ghc-yesod-core-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ) \
ghc-devel(base-4.17.1.0) \
ghc-devel(blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR) \
ghc-devel(blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-devel(cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f) \
ghc-devel(clientsession-0.9.1.2-Jnvj5vMN6iR9xGMf6HxcGE) \
ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-devel(conduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr) \
ghc-devel(containers-0.6.7) \
ghc-devel(cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP) \
ghc-devel(fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ) \
ghc-devel(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-devel(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) \
ghc-devel(monad-logger-0.3.39-6zcML8Hf5KyK4tRVcaUTsA) \
ghc-devel(mtl-2.2.2) \
ghc-devel(parsec-3.1.16.1) \
ghc-devel(path-pieces-0.2.1-7L2E0FvnHzn1hGutNz0iw4) \
ghc-devel(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) \
ghc-devel(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) \
ghc-devel(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) \
ghc-devel(shakespeare-2.0.30-7fp9544x1BC4UOjjHLrTv0) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-devel(text-2.0.2) \
ghc-devel(time-1.12.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unix-compat-0.6-79KxxZMmklx25hsmeEnenN) \
ghc-devel(unliftio-0.2.24.0-Dgc3Qshya29BgIaWsfBy4D) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-devel(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) \
ghc-devel(wai-extra-3.1.13.0-B4Szpcpv4Gy5mM28jLfYmX) \
ghc-devel(wai-logger-2.4.0-9XzUYLocOmA4DcbxilrxA0) \
ghc-devel(warp-3.3.25-E7dqXF5eh0k5u5fIPKRjLZ) \
ghc-devel(word8-0.1.3-9uGjviso2af8K0EP8UmxRD) \
ghc-yesod-core"

inherit rpm
