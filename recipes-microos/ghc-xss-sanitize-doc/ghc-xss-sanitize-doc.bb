SUMMARY = "Haskell xss-sanitize library documentation"
DESCRIPTION = "This package provides the Haskell xss-sanitize library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.3.7.2"

RPM_NAME = "ghc-xss-sanitize-doc-0.3.7.2-1.3.noarch.rpm"
RPM_HASH = "1f7a21715a35c1d606534695629b9bf92b33bfa394959ddce837fc192bc985b375df96adb8b516e6508e563298b14b471adbae7bc452124680f209d135b47598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xss-sanitize-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
