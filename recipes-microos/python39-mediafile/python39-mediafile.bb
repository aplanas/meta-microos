SUMMARY = "Handles low-level interfacing for files' tags Wraps Mutagen to"
DESCRIPTION = "Handles low-level interfacing for files' tags. Wraps Mutagen to"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-mediafile-0.11.0-2.1.noarch.rpm"
RPM_HASH = "8b36125f420009395e02d95357f31af14ad3be17c14756a63fbd1a15614d3fc3e0349702dc05bd5f015c3d889bb30ee9181c10244f38c316eb8a10ceca754fba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mediafile) python39-mediafile python3dist(mediafile)"
RDEPENDS:${PN} += "python(abi) python39-mutagen"

inherit rpm
