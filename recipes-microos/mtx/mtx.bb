SUMMARY = "A Program for Controlling the Robotic Mechanism in DDS Auto Loaders"
DESCRIPTION = "A program for controlling the robotic mechanism in DDS auto loaders and tape \
libraries."
LICENSE = "GPL-2.0+"

PV = "1.3.12"

RPM_NAME = "mtx-1.3.12-23.22.aarch64.rpm"
RPM_HASH = "f08c10a08d32ec41cab08bd0bac1adc77951b6fdd4bd4cf516e79f5a35de2fb22b13faee3f2871e009e8bcc7b28fde1bad91d6dd463b64c6b5c466544911c242"

RPROVIDES:${PN} += "mtx mtx(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
