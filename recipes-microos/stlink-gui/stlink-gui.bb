SUMMARY = "GUI for STM32 discovery line linux programmer"
DESCRIPTION = "STLINK v1/v2 JTAG/SWD debugging/flashing tool for STM32 microcontrollers."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "stlink-gui-1.7.0-2.7.aarch64.rpm"
RPM_HASH = "91c114104e19de05862de39787abbe81abe7c7bd6ee7cca2aa776d14a29a04fbd89a3aec0d44abec3d8a89447c6cb919107ef3d63d4af7bf4126ed6ff3868723"

RPROVIDES:${PN} += "application() \
application(stlink-gui.desktop) \
stlink-gui \
stlink-gui(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libstlink.so.1()(64bit) \
stlink"

inherit rpm
