SUMMARY = "Devel Files for kbibtex"
DESCRIPTION = "This package contains the devel files for kbibtex."
LICENSE = "GPL-2.0-only"

PV = "0.9.3.2"

RPM_NAME = "kbibtex-devel-0.9.3.2-1.3.aarch64.rpm"
RPM_HASH = "4a3d6bfc461c1000cda49c00a42283de7ca038f49de39a379e2dacc151a7e84288458744dfa4f35df7949c8743b06074392029f326ad440239359364577d06ca"

RPROVIDES:${PN} += "kbibtex-devel kbibtex-devel(aarch-64)"
RDEPENDS:${PN} += "kbibtex"

inherit rpm
