SUMMARY = "Haskell x509 profiling library"
DESCRIPTION = "This package provides the Haskell x509 profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.7.7"

RPM_NAME = "ghc-x509-prof-1.7.7-2.3.aarch64.rpm"
RPM_HASH = "f5b02b3ffeed8f31cf4e96cdf837fb0d3d4ebfd3f15b2ee6aa7cddd62575eab007436d51f185e5ac516d16a7f8b70da884c22077582e99c1c984a0ce4896e404"

RPROVIDES:${PN} += "ghc-prof(x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw) ghc-x509-prof ghc-x509-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(asn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk) ghc-prof(asn1-parse-0.9.5-EPDirjvv9Ch16KeQVAexUV) ghc-prof(asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye) ghc-prof(hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3) ghc-prof(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) ghc-prof(pem-0.2.4-GVwv4fsQYoEEDbQiUNwxns) ghc-prof(transformers-0.5.6.2) ghc-x509-devel"

inherit rpm
