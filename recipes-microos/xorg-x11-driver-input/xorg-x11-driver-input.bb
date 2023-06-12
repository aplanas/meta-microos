SUMMARY = "Compatibility metapackage for X.Org input drivers"
DESCRIPTION = "This package is a compatibility metapackage. It used to contain the \
X.Org input drivers."
LICENSE = "MIT"

PV = "7.6_1"

RPM_NAME = "xorg-x11-driver-input-7.6_1-15.2.noarch.rpm"
RPM_HASH = "ec368dd6eea044d3d0cf98f2a4e1b86e85781fcc62e91b90aba901657d4a69fe258d8018861833d71e0b97357657b0215e65b7b8c05d249f623637714c549f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-x11-driver-input \
xorg-x11-driver-input-devel"
RDEPENDS:${PN} += "xf86-input-evdev \
xf86-input-libinput \
xf86-input-void \
xf86-input-wacom"

inherit rpm
