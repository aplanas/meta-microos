SUMMARY = "Haskell xss-sanitize library development files"
DESCRIPTION = "This package provides the Haskell xss-sanitize library development files."
LICENSE = "BSD-2-Clause"

PV = "0.3.7.2"

RPM_NAME = "ghc-xss-sanitize-devel-0.3.7.2-1.3.aarch64.rpm"
RPM_HASH = "0f5fd5f17a61cbb91be5dfca560c5bf0f4b7fac398a3ca523e676125ea5382d78239b81ebb97e893772ffd631f3a8e67537254c1bceb1aea50bea411b5bdbf90"

RPROVIDES:${PN} += "ghc-devel(xss-sanitize-0.3.7.2-FCgYumvpQn8Hd22tbbEcXW) \
ghc-xss-sanitize-devel \
ghc-xss-sanitize-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(css-text-0.1.3.0-21S5OjTqOp19taDQmfqmQs) \
ghc-devel(network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH) \
ghc-devel(tagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn) \
ghc-devel(text-2.0.2) \
ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) \
ghc-xss-sanitize"

inherit rpm
