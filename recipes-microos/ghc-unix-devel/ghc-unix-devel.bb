SUMMARY = "Haskell unix library development files"
DESCRIPTION = "This package provides the Haskell unix library development files."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-devel-2.7.3-3.1.aarch64.rpm"
RPM_HASH = "576fb42e7526e5c8454cfaf6c7f5438344f9047dcd19812baa6089c0ff874028a5f117b941de5a2646a9404ea570d18ee752fc2878fae420ed4ced45200646b4"

RPROVIDES:${PN} += "ghc-devel(unix-2.7.3) ghc-unix-devel ghc-unix-devel(aarch-64) ghc-unix-static ghc-unix-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(time-1.12.2) ghc-unix(aarch-64)"

inherit rpm
