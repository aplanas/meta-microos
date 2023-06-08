SUMMARY = "Development Files for libadplug"
DESCRIPTION = "AdPlug is a hardware independent AdLib sound player library. \
AdPlug plays sound data, originally created for the AdLib (OPL2) and \
Sound Blaster (Dual OPL2/OPL3) audio boards, directly from its original \
format on top of an emulator or by using the real hardware. \
No OPL chip is required for playback. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libadplug."
LICENSE = "LGPL-2.1-only"

PV = "2.3.3"

RPM_NAME = "libadplug-devel-2.3.3-1.3.aarch64.rpm"
RPM_HASH = "e2fb66ae3073dbb4f5d44c54f2e6aa46db92ef6088409bc53eb385248cfd3e5a27768cc7f744e63b3afa6e4409c3373beaba1c742111990d3cb49ed37c7f658a"

RPROVIDES:${PN} += "libadplug-devel libadplug-devel(aarch-64) pkgconfig(adplug)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libadplug2_3_3-0 pkgconfig(libbinio)"

inherit rpm
