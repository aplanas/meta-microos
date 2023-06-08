SUMMARY = "Microsoft Azure Monitor Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Monitor namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.monitor namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-monitor-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "eace811a093e44c351daf9703a54c010192f499b2c243cdc6502c0d849799f059f69ec7b56cc78b3901c975eeb70a2cda30984ef92965154187a581b0f7e8f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-monitor-nspkg) python39-azure-monitor-nspkg python3dist(azure-monitor-nspkg)"
RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm
