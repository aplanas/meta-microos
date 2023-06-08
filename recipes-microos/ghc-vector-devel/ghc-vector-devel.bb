SUMMARY = "Haskell vector library development files"
DESCRIPTION = "This package provides the Haskell vector library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13.0.0"

RPM_NAME = "ghc-vector-devel-0.13.0.0-1.3.aarch64.rpm"
RPM_HASH = "5b24579d7b4f73219f54a7e13643174a39bc7c1021ce456240c48c6cf671ce9a88d0e6cd646d2c5231942b6951aeeb94083f18543aba24684b6085d980841556"

RPROVIDES:${PN} += "ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-vector-devel ghc-vector-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(deepseq-1.4.8.0) ghc-devel(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) ghc-devel(vector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s) ghc-vector"

inherit rpm
