SUMMARY = "Haskell unicode-data profiling library"
DESCRIPTION = "This package provides the Haskell unicode-data profiling library."
LICENSE = "Apache-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-data-prof-0.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "d365ba3a781cdeec7fe45eb7571be3ee59ca8becc4c4560d31e988ba283a9b6be102a61f8e5138c1e1699b5be1c50e30ae000092c96773077dd95405f747b3a3"

RPROVIDES:${PN} += "ghc-prof(unicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO) ghc-unicode-data-prof ghc-unicode-data-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-unicode-data-devel"

inherit rpm
