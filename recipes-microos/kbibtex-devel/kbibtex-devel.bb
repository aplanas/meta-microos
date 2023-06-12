SUMMARY = "Devel Files for kbibtex"
DESCRIPTION = "This package contains the devel files for kbibtex."
LICENSE = "GPL-2.0-only"

PV = "0.9.3.2"

RPM_NAME = "kbibtex-devel-0.9.3.2-1.4.aarch64.rpm"
RPM_HASH = "35194b38904108484bd092789be3d4e409b52dd3fbe3a6b6cc973c5ac97159a903354b56159db6897b45c8fa10513b48799d576c9b3862c9440cad5bed0b7566"

RPROVIDES:${PN} += "kbibtex-devel \
kbibtex-devel(aarch-64)"
RDEPENDS:${PN} += "kbibtex"

inherit rpm
