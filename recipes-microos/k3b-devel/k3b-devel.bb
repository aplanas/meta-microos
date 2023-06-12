SUMMARY = "Development files for k3b"
DESCRIPTION = "This package contain files needed for development with k3b."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "k3b-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "c83d07578df1c6cb37186cd30a6e57e51c279b1ca1f8a7c4206432c4f494181e191ef4a76fa46b05dac41f2f240309a82375129cc4d2c9a08e12f2acf6df925e"

RPROVIDES:${PN} += "k3b-devel \
k3b-devel(aarch-64)"
RDEPENDS:${PN} += "k3b"

inherit rpm
