SUMMARY = "Development files for the Input Device Library"
DESCRIPTION = "libinput is a library that handles input devices for display servers and \
other applications that need to directly deal with input devices. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require libinput."
LICENSE = "MIT"

PV = "1.23.0"

RPM_NAME = "libinput-devel-1.23.0-1.1.aarch64.rpm"
RPM_HASH = "adb2a5e094829b7692ca2f60b09b0dc450bf533934a31380d3c44f88a4a73feb36c8fd2eabce024f0e2362b95e0ba194e3e3be531408f0bfbf16eed7255b21d2"

RPROVIDES:${PN} += "libinput-devel \
libinput-devel(aarch-64) \
pkgconfig(libinput)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinput10"

inherit rpm
