SUMMARY = "Color themes for vifm"
DESCRIPTION = "Color themes for vifm file manager."
LICENSE = "GPL-2.0-only"

PV = "0.12"

RPM_NAME = "vifm-colors-0.12-1.2.noarch.rpm"
RPM_HASH = "c1680217fda3bced5c1fba864e0868b7a6266738bf89b3136c8dea445a3b077147b596c1a2a422df6e2f6b3f0c046a87511d36a7d9d544109b2d0965bf75506a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(vifm-colors) \
vifm-colors"
RDEPENDS:${PN} += "vifm"

inherit rpm
