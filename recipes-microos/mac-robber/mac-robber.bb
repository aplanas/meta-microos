SUMMARY = "Tool to create a timeline of file activity for mounted file systems"
DESCRIPTION = "mac-robber is a digital forensics and incident response tool that can be used \
with The Sleuth Kit to create a timeline of file activity for mounted \
file systems."
LICENSE = "GPL-2.0+"

PV = "1.02"

RPM_NAME = "mac-robber-1.02-13.26.aarch64.rpm"
RPM_HASH = "ef35b760a5924329476c2630022ba623ca0f195e09eadb4ce719ce09a532797860d2bd089b7d22fe1e3906917bf219dd5b6f614604d876d4e7b32a9b8f642966"

RPROVIDES:${PN} += "mac-robber mac-robber(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
