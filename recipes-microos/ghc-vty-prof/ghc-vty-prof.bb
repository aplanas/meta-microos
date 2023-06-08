SUMMARY = "Haskell vty profiling library"
DESCRIPTION = "This package provides the Haskell vty profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.38"

RPM_NAME = "ghc-vty-prof-5.38-2.4.aarch64.rpm"
RPM_HASH = "0df007b38f6179ea47bf5066a5e4351acd091a3309cef2a39d759e43dc353ecc8da4fa89e8aef129b45d307867fbe3c284b0617d14a290f2ab07b3b67dbda9fd"

RPROVIDES:${PN} += "ghc-prof(vty-5.38-E9MiSc6Hkm5LKREDrOQCil) ghc-vty-prof ghc-vty-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(directory-1.3.7.1) ghc-prof(filepath-1.4.2.2) ghc-prof(microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1) ghc-prof(microlens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV) ghc-prof(microlens-th-0.4.3.12-A1OnPrF7gbKLp2skY17lAG) ghc-prof(mtl-2.2.2) ghc-prof(parsec-3.1.16.1) ghc-prof(stm-2.5.1.0) ghc-prof(terminfo-0.4.1.5) ghc-prof(text-2.0.2) ghc-prof(transformers-0.5.6.2) ghc-prof(unix-2.7.3) ghc-prof(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-vty-devel"

inherit rpm
