SUMMARY = "Control software for sd-mux devices"
DESCRIPTION = "Tool for controlling multiple sd-mux devices (SD_MUX, SDWIRE, etc.)."
LICENSE = "Apache-2.0"

PV = "0.0~git20200217.9dd189d"

RPM_NAME = "sd-mux-ctrl-0.0~git20200217.9dd189d-1.12.aarch64.rpm"
RPM_HASH = "2e9453e92110b7aa175f9b500e2f168de4554c2d668d4a4ddc1bc4552ff93fea4ff8b7235e5554fee5e013060c9676c54b6ad0ab2954c30afc1d9f3a69b255e5"

RPROVIDES:${PN} += "sd-mux-ctrl \
sd-mux-ctrl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libftdi1.so.2()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit)"

inherit rpm
