SUMMARY = "File compression utility"
DESCRIPTION = "A gzip implementation that uses libdeflate which is significantly \
faster than the GNU gzip implementation (+72-187%)."
LICENSE = "BSD-2-Clause"

PV = "1.18"

RPM_NAME = "libdeflate-tools-1.18-1.1.aarch64.rpm"
RPM_HASH = "3b36e551c71b0baf23e2be1b6639fd26e7a042d18288aea7e99916c64fed95973644b6a4dc3332b97dccd663720ffde5d19d62dc5f9db326e6d5262c110a6673"

RPROVIDES:${PN} += "libdeflate-tools libdeflate-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdeflate.so.0()(64bit)"

inherit rpm
