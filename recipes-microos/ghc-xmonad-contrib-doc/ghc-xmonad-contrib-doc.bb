SUMMARY = "Haskell xmonad-contrib library documentation"
DESCRIPTION = "This package provides the Haskell xmonad-contrib library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.17.1"

RPM_NAME = "ghc-xmonad-contrib-doc-0.17.1-3.4.noarch.rpm"
RPM_HASH = "13c7c833101b10aa6cedd680350566ef9ffed349a384804eb1688d5e2f90f3614ef4e65f586cb2c1487ca653b5cb66c85a220b13cdd49a7fb80e8e754c8389ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xmonad-contrib-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
