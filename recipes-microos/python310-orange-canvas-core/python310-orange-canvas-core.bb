SUMMARY = "Core component of Orange Canvas"
DESCRIPTION = "Core component of Orange Canvas"
LICENSE = "GPL-3.0-only"

PV = "0.1.18"

RPM_NAME = "python310-orange-canvas-core-0.1.18-1.13.noarch.rpm"
RPM_HASH = "45263e22779668ca0863323861d9a6907e3f05465800e2babaca4e89b2ea6a6365fc694307d40d677b30bf0093d41b5c01015c144bcf2607d365b07af6b2b721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-orange-canvas-core \
python3.10dist(orange-canvas-core) \
python310-orange-canvas-core \
python3dist(orange-canvas-core)"
RDEPENDS:${PN} += "python(abi) \
python310-AnyQt \
python310-CacheControl \
python310-commonmark \
python310-dictdiffer \
python310-docutils \
python310-qt5 \
python310-requests"

inherit rpm
