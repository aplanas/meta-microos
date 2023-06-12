SUMMARY = "Haskell vault library development files"
DESCRIPTION = "This package provides the Haskell vault library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.1.5"

RPM_NAME = "ghc-vault-devel-0.3.1.5-4.3.aarch64.rpm"
RPM_HASH = "b08e7a6f694fd58f0977a66f0f91eea75d8fe82d9b4631491cce761dab0cab6e7bc61fa539ed35c941899b2c1bfd01307d31e16c6552f046685c8a391c775e7f"

RPROVIDES:${PN} += "ghc-devel(vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc) \
ghc-vault-devel \
ghc-vault-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-vault"

inherit rpm
