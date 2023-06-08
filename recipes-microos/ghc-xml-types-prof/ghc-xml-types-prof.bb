SUMMARY = "Haskell xml-types profiling library"
DESCRIPTION = "This package provides the Haskell xml-types profiling library."
LICENSE = "MIT"

PV = "0.3.8"

RPM_NAME = "ghc-xml-types-prof-0.3.8-4.2.aarch64.rpm"
RPM_HASH = "12abc1c214fce8a0754678a3232893a8814f6129ae571c80133589e84604340ad7f8b36e6cc219f536243a164f8c0a27b0bb0ca2eab4613c44941aef61c051b3"

RPROVIDES:${PN} += "ghc-prof(xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb) ghc-xml-types-prof ghc-xml-types-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(text-2.0.2) ghc-xml-types-devel"

inherit rpm
