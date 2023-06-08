SUMMARY = "Haskell warp-tls library development files"
DESCRIPTION = "This package provides the Haskell warp-tls library development files."
LICENSE = "MIT"

PV = "3.3.6"

RPM_NAME = "ghc-warp-tls-devel-3.3.6-1.4.aarch64.rpm"
RPM_HASH = "f6e9b1ed3d18bd88c088c9d46c9d01eac4f1ff217e25a29d11885dce00bea5432172ed0a31d71a5ea4ce3c38cfe4525aa0bff20f2596555ffc9991073341d184"

RPROVIDES:${PN} += "ghc-devel(warp-tls-3.3.6-FNoL4BYqjr55niULiQgEjP) ghc-warp-tls-devel ghc-warp-tls-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye) ghc-devel(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) ghc-devel(recv-0.1.0-4koyrU2GJ4L4fpyKcXLbZR) ghc-devel(streaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G) ghc-devel(tls-1.6.0-48osxqPawrs8SblkErmTaM) ghc-devel(tls-session-manager-0.0.4-1K8vLYLuq115RYgesNa5lw) ghc-devel(unliftio-0.2.24.0-Dgc3Qshya29BgIaWsfBy4D) ghc-devel(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) ghc-devel(warp-3.3.25-E7dqXF5eh0k5u5fIPKRjLZ) ghc-warp-tls"

inherit rpm
