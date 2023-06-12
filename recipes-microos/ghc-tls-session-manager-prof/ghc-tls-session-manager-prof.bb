SUMMARY = "Haskell tls-session-manager profiling library"
DESCRIPTION = "This package provides the Haskell tls-session-manager profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "ghc-tls-session-manager-prof-0.0.4-4.2.aarch64.rpm"
RPM_HASH = "addde22fa0af7cf60e69ce7e664b51bf8be4a520e4221b71b2fe82b6b2f3f2e889ba43feff9110bb507b086c6dadaa4ea18e5731d98228e6d3c35b6a70285f71"

RPROVIDES:${PN} += "ghc-prof(tls-session-manager-0.0.4-1K8vLYLuq115RYgesNa5lw) \
ghc-tls-session-manager-prof \
ghc-tls-session-manager-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ) \
ghc-prof(base-4.17.1.0) \
ghc-prof(basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(clock-0.8.3-Bn4LVnP2KGzGGqLjq4BuLV) \
ghc-prof(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) \
ghc-prof(psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O) \
ghc-prof(tls-1.6.0-48osxqPawrs8SblkErmTaM) \
ghc-tls-session-manager-devel"

inherit rpm
