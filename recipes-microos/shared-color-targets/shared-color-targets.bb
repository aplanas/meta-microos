SUMMARY = "Color targets for creating color profiles"
DESCRIPTION = "The shared-color-targets package contains various targets which are \
useful for programs that create ICC profiles."
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain & CC-BY-SA-3.0"

PV = "0.1.7"

RPM_NAME = "shared-color-targets-0.1.7-1.10.noarch.rpm"
RPM_HASH = "169805991ac1b84f6d1fab0ed7c7680ef42ad6b5eb55717605c54e09fd6253c3de8786fd1d8af7fc63985a6218c13e989ac6f5fd4c6ee02f60420e1e546c8888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shared-color-targets"
RDEPENDS:${PN} += ""

inherit rpm
