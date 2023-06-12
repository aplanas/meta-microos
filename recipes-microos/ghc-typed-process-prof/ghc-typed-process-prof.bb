SUMMARY = "Haskell typed-process profiling library"
DESCRIPTION = "This package provides the Haskell typed-process profiling library."
LICENSE = "MIT"

PV = "0.2.11.0"

RPM_NAME = "ghc-typed-process-prof-0.2.11.0-1.3.aarch64.rpm"
RPM_HASH = "2c81dd5a20ed95cdf3d6ba599b0e77775f6d8ab11407c2871afe472a1466b9d4ff8cab75f45be8db4d7d92e857e0a0263749737563fcb648525e232e006c281f"

RPROVIDES:${PN} += "ghc-prof(typed-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO) \
ghc-typed-process-prof \
ghc-typed-process-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(process-1.6.16.0) \
ghc-prof(stm-2.5.1.0) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj) \
ghc-typed-process-devel"

inherit rpm
