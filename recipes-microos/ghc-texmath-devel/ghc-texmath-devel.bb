SUMMARY = "Haskell texmath library development files"
DESCRIPTION = "This package provides the Haskell texmath library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7.1"

RPM_NAME = "ghc-texmath-devel-0.12.7.1-1.3.aarch64.rpm"
RPM_HASH = "64ba7b3c707f72009e795719e779148a4b5eacf8dde905f1a6589a057ab42b497975f428f86602d14980ee23f8a039b265575cd9ed3ef12bf3c9233594c7be46"

RPROVIDES:${PN} += "ghc-devel(texmath-0.12.7.1-7OWYB1fHEsHAa3KAfzQAEj) ghc-texmath-devel ghc-texmath-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(mtl-2.2.2) ghc-devel(pandoc-types-1.23-EFziwPO22I72D2SxHphq63) ghc-devel(parsec-3.1.16.1) ghc-devel(split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf) ghc-devel(syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i) ghc-devel(text-2.0.2) ghc-devel(xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g) ghc-texmath"

inherit rpm
