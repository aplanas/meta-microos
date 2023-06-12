SUMMARY = "A tool for 're-ptying' programs"
DESCRIPTION = "reptyr is a utility for taking an existing running program and \
attaching it to a new terminal. Started a long-running process over \
ssh, but have to leave and don't want to interrupt it? Just start a \
screen, use reptyr to grab it, and then kill the ssh session and head \
on home."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "reptyr-0.10.0-1.1.aarch64.rpm"
RPM_HASH = "848b09b789a0a110f38def800be18695e2e3e0003c5fe6b42a1c68284d40a5599835bf4dc0dc5486a7d225f5d708732a5cf9400702c889ef2373088bd3d40827"

RPROVIDES:${PN} += "reptyr \
reptyr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
