SUMMARY = "Haskell text-conversions library development files"
DESCRIPTION = "This package provides the Haskell text-conversions library development \
files."
LICENSE = "ISC"

PV = "0.3.1.1"

RPM_NAME = "ghc-text-conversions-devel-0.3.1.1-2.2.aarch64.rpm"
RPM_HASH = "377921ec45a054c3e125deb2897023501895e9df2f22a773cc570abf924eea5d046f4df1bc963db0df3ac618504a48947004cd5543f783914f13e80c12f0394b"

RPROVIDES:${PN} += "ghc-devel(text-conversions-0.3.1.1-CkkBRqT3R5g4PO0QywmUQS) \
ghc-text-conversions-devel \
ghc-text-conversions-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU) \
ghc-devel(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(text-2.0.2) \
ghc-text-conversions"

inherit rpm
