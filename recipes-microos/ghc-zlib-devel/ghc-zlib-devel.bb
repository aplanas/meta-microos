SUMMARY = "Haskell zlib library development files"
DESCRIPTION = "This package provides the Haskell zlib library development files."
LICENSE = "BSD-2-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-zlib-devel-0.6.3.0-2.3.aarch64.rpm"
RPM_HASH = "fc28a493449cfa552eda85e912ce1007a3e499f0ec5e61c561c4964016204d66b49c89e8906a71dc33bf756993e5528ba43c668d88d12d45cf7428a9a46e15a9"

RPROVIDES:${PN} += "ghc-devel(zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk) ghc-zlib-devel ghc-zlib-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-zlib zlib-devel"

inherit rpm
