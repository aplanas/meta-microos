SUMMARY = "KIWI - host requirements for WSL container images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build WSL container images"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-containers-wsl-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "859008f1e4cf226ccd0c470ce2195b273c5164f9d6d3305a5f704022a57e6cc988c3b79c5cec470e5d4e62900d35dbb72bc1baf6806a8045789e581dab24127f"

RPROVIDES:${PN} += "kiwi-image-wsl-requires kiwi-image:appx kiwi-systemdeps-containers-wsl kiwi-systemdeps-containers-wsl(aarch-64)"
RDEPENDS:${PN} += "fb-util-for-appx"

inherit rpm
