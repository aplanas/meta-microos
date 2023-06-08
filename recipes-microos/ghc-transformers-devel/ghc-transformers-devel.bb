SUMMARY = "Haskell transformers library development files"
DESCRIPTION = "This package provides the Haskell transformers library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-devel-0.5.6.2-1.1.aarch64.rpm"
RPM_HASH = "a6e43b2e7c2f901999d4f9aea5dee692b2b5ac0317e94d0634c7bc6eee9c3407507d2dbb7edec70a46a57486bb6587bc9bf28eff5b2279f63e6211d37c4234d1"

RPROVIDES:${PN} += "ghc-devel(transformers-0.5.6.2) ghc-transformers-devel ghc-transformers-devel(aarch-64) ghc-transformers-static ghc-transformers-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-transformers(aarch-64)"

inherit rpm
