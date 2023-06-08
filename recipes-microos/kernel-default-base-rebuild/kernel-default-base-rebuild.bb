SUMMARY = "Empty package to ensure rebuilding kernel-default-base in OBS"
DESCRIPTION = "This is empty package that ensures kernel-default-base is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-default-base-rebuild-6.3.1-1.2.27.2.aarch64.rpm"
RPM_HASH = "dbd11384390331e76cfba108a98499302e5b7a95639d55df697fc968be30b3a5ce10e07efab758d88f10c8b64151ecb33906ddfade9d66fd085ab5072eed7187"

RPROVIDES:${PN} += "kernel-default-base-rebuild kernel-default-base-rebuild(aarch-64)"
RDEPENDS:${PN} += "kernel-default"

inherit rpm
