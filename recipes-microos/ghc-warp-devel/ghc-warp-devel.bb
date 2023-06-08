SUMMARY = "Haskell warp library development files"
DESCRIPTION = "This package provides the Haskell warp library development files."
LICENSE = "MIT"

PV = "3.3.25"

RPM_NAME = "ghc-warp-devel-3.3.25-1.4.aarch64.rpm"
RPM_HASH = "59017dc624be0ed7cc062c00946418be5838f1f53b09b310d46bccd6911004b3afba5adbb3942e6cb7feb9517593f93f81b7a9f043a0fa5eef90def53c216b82"

RPROVIDES:${PN} += "ghc-devel(warp-3.3.25-E7dqXF5eh0k5u5fIPKRjLZ) ghc-warp-devel ghc-warp-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(array-0.5.4.0) ghc-devel(auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ) ghc-devel(base-4.17.1.0) ghc-devel(bsb-http-chunked-0.0.0.4-7TdDxnBU7De3tUquWdckvl) ghc-devel(bytestring-0.11.4.0) ghc-devel(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) ghc-devel(containers-0.6.7) ghc-devel(ghc-prim-0.9.0) ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-devel(http-date-0.0.11-IfCBGXPFiMuIKzFtOTNgnD) ghc-devel(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) ghc-devel(http2-3.0.3-g8K2coD7lK8bFd8vR2MQJ) ghc-devel(iproute-1.7.12-2mj2MFOMRz35bHY4Q7Jvyd) ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) ghc-devel(recv-0.1.0-4koyrU2GJ4L4fpyKcXLbZR) ghc-devel(simple-sendfile-0.2.31-701wssQD34oFyvrTLOblUT) ghc-devel(stm-2.5.1.0) ghc-devel(streaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G) ghc-devel(text-2.0.2) ghc-devel(time-manager-0.0.0-49hD2RcPrUEG8anOiBePCj) ghc-devel(unix-2.7.3) ghc-devel(unix-compat-0.6-79KxxZMmklx25hsmeEnenN) ghc-devel(unliftio-0.2.24.0-Dgc3Qshya29BgIaWsfBy4D) ghc-devel(vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc) ghc-devel(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) ghc-devel(word8-0.1.3-9uGjviso2af8K0EP8UmxRD) ghc-devel(x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw) ghc-warp"

inherit rpm
