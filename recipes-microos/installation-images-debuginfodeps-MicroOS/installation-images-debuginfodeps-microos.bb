SUMMARY = "Debuginfo dependencies for MicroOS installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.86"

RPM_NAME = "installation-images-debuginfodeps-MicroOS-17.86-1.29.aarch64.rpm"
RPM_HASH = "baf46d6935ad1e054c3536f81b6239150064320caf1ec640c98e2e9434ec68a3061c10f1d19f69daa33f9f898c90034ab38ab8d2c50486ed237bf04d8d02c878"

RPROVIDES:${PN} += "debuginfo(build-id) installation-images-debuginfodeps installation-images-debuginfodeps-MicroOS installation-images-debuginfodeps-MicroOS(aarch-64)"
RDEPENDS:${PN} += "debuginfo(build-id)"

inherit rpm
