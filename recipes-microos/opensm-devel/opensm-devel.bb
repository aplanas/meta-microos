SUMMARY = "Development files for OpenSM"
DESCRIPTION = "Symlinks for the dynamic libraries and header files for OpenSM."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "opensm-devel-3.3.24-3.7.aarch64.rpm"
RPM_HASH = "efb6a55d6652d903b3f6ec61a09e115575523684d9e177bf45af6099d8eba7b94df4d0baebd9a27e3c541e4c8c43cfc9035d1d2875b30c4d57fe8b8cf5d9da35"

RPROVIDES:${PN} += "opensm-devel opensm-devel(aarch-64)"
RDEPENDS:${PN} += "libibumad-devel libopensm9 libosmcomp5 libosmvendor5"

inherit rpm
