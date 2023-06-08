SUMMARY = "Extra bootloaders for Raspberry Pi"
DESCRIPTION = "This package provides the console, experimental and debug \
firmware files for Raspberry Pi"
LICENSE = "SUSE-Firmware"

PV = "2023.04.25"

RPM_NAME = "raspberrypi-firmware-extra-2023.04.25-2.1.noarch.rpm"
RPM_HASH = "b47db93536d6822c3dcb70e9863d6d848bbb6168688a76d4a3e161a926f83c96cd31b7c770f840e521e38618c74c3e4de0597a347f5f251d92f582d83c38d797"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "raspberrypi-firmware-extra"
RDEPENDS:${PN} += "/bin/sh raspberrypi-firmware util-linux"

inherit rpm
