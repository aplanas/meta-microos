SUMMARY = "A tool for 're-ptying' programs"
DESCRIPTION = "reptyr is a utility for taking an existing running program and \
attaching it to a new terminal. Started a long-running process over \
ssh, but have to leave and don't want to interrupt it? Just start a \
screen, use reptyr to grab it, and then kill the ssh session and head \
on home."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "reptyr-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "4c15000e281033e57078619b249fc154a628e3e9cfd2a28ab6c5cb8bdca061b539fbe57f07b555a44c4984429a82d6eaa26ff90c909b38333b7880295efb308b"

RPROVIDES:${PN} += "reptyr reptyr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
