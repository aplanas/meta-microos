SUMMARY = "Haskell zlib profiling library"
DESCRIPTION = "This package provides the Haskell zlib profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-zlib-prof-0.6.3.0-2.3.aarch64.rpm"
RPM_HASH = "892d2c84773986a90af365b7c858920325edd322509ace47fb3e51a3a4a1ba84d5025e603f540132ce82549a9876ac39fe6a969de6463446f3a6aeb3f902a8b4"

RPROVIDES:${PN} += "ghc-prof(zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk) ghc-zlib-prof ghc-zlib-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-zlib-devel"

inherit rpm
