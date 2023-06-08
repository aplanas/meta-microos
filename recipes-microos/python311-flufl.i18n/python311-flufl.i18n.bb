SUMMARY = "High level API for internationalizing Python libraries and applications"
DESCRIPTION = "High level API for internationalizing Python libraries and applications."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python311-flufl.i18n-4.1.1-2.4.noarch.rpm"
RPM_HASH = "244bc9796ddaf5c779a8437893772b76d666572e406775e8667364031d2d4c838c33966281183745217927bd6e11603b1556f16492466c5796fdf0a63917e042"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flufl.i18n) python311-flufl.i18n python3dist(flufl.i18n)"
RDEPENDS:${PN} += "python(abi) python311-atpublic"

inherit rpm
