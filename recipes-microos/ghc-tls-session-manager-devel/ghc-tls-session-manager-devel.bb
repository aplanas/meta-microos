SUMMARY = "Haskell tls-session-manager library development files"
DESCRIPTION = "This package provides the Haskell tls-session-manager library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "ghc-tls-session-manager-devel-0.0.4-4.2.aarch64.rpm"
RPM_HASH = "2eba542863815023f9b951376e2e423c97395468fb471872c610cca08021c6288050bb13244c60dccd32bc5028d740f6b3cee8086a8499c3b4a698b96437cd94"

RPROVIDES:${PN} += "ghc-devel(tls-session-manager-0.0.4-1K8vLYLuq115RYgesNa5lw) ghc-tls-session-manager-devel ghc-tls-session-manager-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ) ghc-devel(base-4.17.1.0) ghc-devel(basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S) ghc-devel(bytestring-0.11.4.0) ghc-devel(clock-0.8.3-Bn4LVnP2KGzGGqLjq4BuLV) ghc-devel(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) ghc-devel(psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O) ghc-devel(tls-1.6.0-48osxqPawrs8SblkErmTaM) ghc-tls-session-manager"

inherit rpm
